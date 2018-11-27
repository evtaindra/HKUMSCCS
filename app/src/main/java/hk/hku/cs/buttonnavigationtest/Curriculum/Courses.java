package hk.hku.cs.buttonnavigationtest.Curriculum;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Curriculum
 *  文件名：    ProgrammeOVerview
 *  创建者：    BENNETT
 *  创建时间：  2018/10/17 16:05
 *  描述：      TODO
 */public class Courses extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.curriculum_courses,null);

        Button button1 = view.findViewById(R.id.courses_cs_moredetails);
        Button button2 = view.findViewById(R.id.courses_ECOM_ICOMP);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.courses_cs_moredetails:
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://www.msc-cs.hku.hk/Curriculum/Courses"));
                intent.setAction(Intent.ACTION_VIEW);
                this.startActivity(intent);
                break;
            case R.id.courses_ECOM_ICOMP:
                Intent intent1 = new Intent();
                intent1.setData(Uri.parse("https://www.ecom-icom.hku.hk/Curriculum/Courses"));
                intent1.setAction(Intent.ACTION_VIEW);
                this.startActivity(intent1);
                break;
                default:
                    break;
        }
    }
}
