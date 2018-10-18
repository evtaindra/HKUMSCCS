package hk.hku.cs.buttonnavigationtest.Admission;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Admission
 *  文件名：    Requirements
 *  创建者：    BENNETT
 *  创建时间：  2018/10/17 13:19
 *  描述：      TODO
 */public class Procedures extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.admission_procedures,null);
        return view;
    }
}
