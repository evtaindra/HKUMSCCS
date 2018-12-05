package hk.hku.cs.buttonnavigationtest.NewsEvents;

import android.widget.ImageView;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.NewsEvents
 *  文件名：    NewsEvents_item
 *  创建者：    BENNETT
 *  创建时间：  2018/12/5 1:50
 *  描述：      TODO
 */public class NewsEvents_item {
     private String NewsTitle;
    private String NewsTime;
    private String NewsContent;

    public String getNewsTitle() {
        return NewsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        NewsTitle = newsTitle;
    }

    public String getNewsTime() {
        return NewsTime;
    }

    public void setNewsTime(String newsTime) {
        NewsTime = newsTime;
    }

    public String getNewsContent() {
        return NewsContent;
    }

    public void setNewsContent(String newsContent) {
        NewsContent = newsContent;
    }
}
