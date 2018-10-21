package hk.hku.cs.buttonnavigationtest.Admission;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Admission
 *  文件名：    Stu_Clark
 *  创建者：    BENNETT
 *  创建时间：  2018/10/21 14:58
 *  描述：      TODO
 */public class Stu_Clark extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admission_stuindivi_clark);
        View view = findViewById(R.id.clark);
    }

}

