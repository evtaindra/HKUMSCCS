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
import android.widget.TextView;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Curriculum
 *  文件名：    ProgrammeOVerview
 *  创建者：    BENNETT
 *  创建时间：  2018/10/17 16:05
 *  描述：      TODO
 */public class RegulationsandSyllabus extends Fragment implements View.OnClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.curriculum_regulationsandsyllabus,null);

        TextView textView1 = view.findViewById(R.id.Curriculum_regulationandSyllabus1);
        TextView textView2 = view.findViewById(R.id.Curriculum_regulationandSyllabus2);
        TextView textView3 = view.findViewById(R.id.Curriculum_regulationandSyllabus3);
        TextView textView4 = view.findViewById(R.id.Curriculum_regulationandSyllabus4);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Curriculum_regulationandSyllabus1:
                Intent intent1 = new Intent();
                intent1.setData(Uri.parse("https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/genreg.pdf"));
                intent1.setAction(Intent.ACTION_VIEW);
                this.startActivity(intent1);
                break;
            case R.id.Curriculum_regulationandSyllabus2:
                Intent intent2 = new Intent();
                intent2.setData(Uri.parse("https://www4.hku.hk/pubunit/drcd/files/pgdr2017-18/tpg-regulations.pdf"));
                intent2.setAction(Intent.ACTION_VIEW);
                this.startActivity(intent2);
                break;
            case R.id.Curriculum_regulationandSyllabus3:
                Intent intent3 = new Intent();
                intent3.setData(Uri.parse("https://www.msc-cs.hku.hk/Media/Default/RegulationSyllabus/Regulations_MSc_2017-18.pdf"));
                intent3.setAction(Intent.ACTION_VIEW);
                this.startActivity(intent3);
                break;
            case R.id.Curriculum_regulationandSyllabus4:
                Intent intent4 = new Intent();
                intent4.setData(Uri.parse("https://www.msc-cs.hku.hk/Media/Default/RegulationSyllabus/Syllabus_MSc(CompSc)_2018-19.pdf"));
                intent4.setAction(Intent.ACTION_VIEW);
                this.startActivity(intent4);
                break;

        }
    }

}
