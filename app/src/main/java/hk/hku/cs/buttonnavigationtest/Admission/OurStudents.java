package hk.hku.cs.buttonnavigationtest.Admission;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Admission
 *  文件名：    OurStudents
 *  创建者：    BENNETT
 *  创建时间：  2018/10/17 13:24
 *  描述：      学生界面
 */public class OurStudents extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.admission_ourstudents, null);

        final View view1 = view.findViewById(R.id.clark);
        final View view2 = view.findViewById(R.id.cuiyitong);
        final View view3 = view.findViewById(R.id.hutianyi);
        final View view4 = view.findViewById(R.id.lee);

        view1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Stu_Clark.class);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(getActivity(),view1,"Clark");
                startActivity(intent,options.toBundle());
            }
        });

        view2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Stu_cuiyitong.class);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(getActivity(),view2,"Cuiyitong");
                startActivity(intent,options.toBundle());
            }
        });

        view3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Stu_Hutianyi.class);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(getActivity(),view3,"Hutianyi");
                startActivity(intent,options.toBundle());
            }
        });

        view4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Stu_Lee.class);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(getActivity(),view4,"lee");
                startActivity(intent,options.toBundle());
            }
        });
        return view;
    }
}
