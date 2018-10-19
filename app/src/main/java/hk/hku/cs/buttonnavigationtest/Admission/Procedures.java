package hk.hku.cs.buttonnavigationtest.Admission;

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
 *  包名：      hk.hku.cs.buttonnavigationtest.Admission
 *  文件名：    Requirements
 *  创建者：    BENNETT
 *  创建时间：  2018/10/17 13:19
 *  描述：      TODO
 */public class Procedures extends Fragment implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.admission_procedures,null);
        Button button1 = view.findViewById(R.id.admission_apply);
        button1.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.admission_apply:
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://aal.hku.hk/tpg/programme/master-science-computer-science"));
                intent.setAction(Intent.ACTION_VIEW);
                this.startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
