package hk.hku.cs.buttonnavigationtest.Admission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Admission
 *  文件名：    FAQ
 *  创建者：    BENNETT
 *  创建时间：  2018/10/17 13:32
 *  描述：      TODO
 */public class FAQ extends Fragment implements View.OnClickListener {

     private ImageView admission_admission;
     private ImageView admission_visa;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.admission_faq,null);
        admission_admission = view.findViewById(R.id.admission_admission);
        admission_visa = view.findViewById(R.id.admission_visa);
        admission_admission.setOnClickListener(this);
        admission_visa.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.admission_admission:
                startActivity(new Intent(v.getContext(),FAQ_admission.class));
                break;
            case R.id.admission_visa:
                startActivity(new Intent(v.getContext(),FAQ_visa.class));
                break;

        }
    }
}
