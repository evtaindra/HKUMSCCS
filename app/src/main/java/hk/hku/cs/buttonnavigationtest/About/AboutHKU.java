package hk.hku.cs.buttonnavigationtest.About;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hk.hku.cs.buttonnavigationtest.R;


/*
 *  项目名：    MSCprograme
 *  包名：      hk.hku.cs.mscprograme.About
 *  文件名：    AboutHKU
 *  创建者：    BENNETT
 *  创建时间：  2018/10/15 20:13
 *  描述：      TODO
 */public class AboutHKU extends android.support.v4.app.Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_abouthku,null);
        return view;
    }
}
