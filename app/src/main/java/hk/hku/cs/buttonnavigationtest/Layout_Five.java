package hk.hku.cs.buttonnavigationtest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest
 *  文件名：    Layout_One
 *  创建者：    BENNETT
 *  创建时间：  2018/10/16 20:35
 *  描述：      TODO
 */public class Layout_Five extends Fragment implements View.OnClickListener {


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_five, null);

        ImageView imageView1 = view.findViewById(R.id.Resources_Learning_env);
        ImageView imageView2 = view.findViewById(R.id.Resources_Userful_Link);

        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Resources_Learning_env:
                Intent intent1 = new Intent();
                intent1.setData(Uri.parse("https://www.msc-cs.hku.hk/StuRes/Environment"));
                intent1.setAction(Intent.ACTION_VIEW);
                this.startActivity(intent1);
                break;
            case R.id.Resources_Userful_Link:
                Intent intent2 = new Intent();
                intent2.setData(Uri.parse("https://www.msc-cs.hku.hk/StuRes/Useful-Links"));
                intent2.setAction(Intent.ACTION_VIEW);
                this.startActivity(intent2);
                break;
        }
    }
}
