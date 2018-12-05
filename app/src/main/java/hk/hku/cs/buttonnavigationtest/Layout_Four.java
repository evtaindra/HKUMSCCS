package hk.hku.cs.buttonnavigationtest;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import java.util.ArrayList;

import hk.hku.cs.buttonnavigationtest.NewsEvents.NewsEvents_item;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest
 *  文件名：    Layout_One
 *  创建者：    BENNETT
 *  创建时间：  2018/10/16 20:35
 *  描述：      TODO
 */public class Layout_Four extends Fragment implements View.OnClickListener {
    private TextView newsTitle1;
    private TextView newsTitle2;
    private TextView newsTitle3;

    private TextView newsTime1;
    private TextView newsTime2;
    private TextView newsTime3;

    private TextView newsContent1;
    private TextView newsContent2;
    private TextView newsContent3;

    private Button news_button;

    private static String URL = "https://www.msc-cs.hku.hk/NewsnEvents";
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_four,null);
        findView(view);
        return view;
    }

    private void findView(View v) {

        newsTitle1 = v.findViewById(R.id.newstitle111);
        newsTitle2 = v.findViewById(R.id.newstitle222);
        newsTitle3 = v.findViewById(R.id.newstitle333);

        newsTime1 = v.findViewById(R.id.newstime111);
        newsTime2 = v.findViewById(R.id.newstime222);
        newsTime3 = v.findViewById(R.id.newstime333);

        newsContent1 = v.findViewById(R.id.newscontent111);
        newsContent2 = v.findViewById(R.id.newscontent222);
        newsContent3 = v.findViewById(R.id.newscontent333);

        news_button = v.findViewById(R.id.news_button);
        news_button.setOnClickListener(this);
        //开始处理异步任务
        new MyAsyncTask().execute(URL);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.news_button:
                Intent intent1 = new Intent();
                intent1.setData(Uri.parse("https://www.msc-cs.hku.hk/NewsnEvents"));
                intent1.setAction(Intent.ACTION_VIEW);
                startActivity(intent1);
                break;
        }
    }

    private class MyAsyncTask extends AsyncTask<String ,Void ,ArrayList<NewsEvents_item>>{
        @Override
        protected ArrayList<NewsEvents_item> doInBackground(String... params) {
            ArrayList<NewsEvents_item> newsItems = new ArrayList<>();

            try {
                org.jsoup.nodes.Document doc = Jsoup.connect(URL).get();

                Elements elements_titles = doc.select("#blogpost-masonry");
                Elements elements_children = elements_titles.get(0).children();
                for(org.jsoup.nodes.Element element : elements_children){
                    NewsEvents_item item = new NewsEvents_item();
                    item.setNewsTitle(element.select(".title").text());
                    item.setNewsTime(element.select(".clearfix").text());
                    item.setNewsContent(element.select(".description").text());
                    newsItems.add(item);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return newsItems;
        }

        //结束doInBackground之后就执行onPostExecute,用于更新UI
        @Override
        protected void onPostExecute(ArrayList<NewsEvents_item> items_serial) {
            super.onPostExecute(items_serial);

            newsTitle1.setText(items_serial.get(0).getNewsTitle());
            newsTitle2.setText(items_serial.get(1).getNewsTitle());
            newsTitle3.setText(items_serial.get(2).getNewsTitle());
//
            newsTime1.setText(items_serial.get(0).getNewsTime());
            newsTime2.setText(items_serial.get(1).getNewsTime());
            newsTime3.setText(items_serial.get(2).getNewsTime());
//
            newsContent1.setText(items_serial.get(0).getNewsContent());
            newsContent2.setText(items_serial.get(1).getNewsContent());
            newsContent3.setText(items_serial.get(2).getNewsContent());
        }
    }
}
