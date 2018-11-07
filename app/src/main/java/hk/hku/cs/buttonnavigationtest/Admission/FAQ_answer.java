package hk.hku.cs.buttonnavigationtest.Admission;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Admission
 *  文件名：    FAQ_answer
 *  创建者：    BENNETT
 *  创建时间：  2018/11/7 21:04
 *  描述：      TODO
 */public class FAQ_answer extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admission_answer);

        TextView answer1 = findViewById(R.id.admission_answer_question);
        TextView answer2 = findViewById(R.id.admission_answer_answer);

        Intent intent = getIntent();
        String admission_answer1 = intent.getStringExtra("dif_question");
        String admission_answer2 = intent.getStringExtra("dif_answer");

        answer1.setText(admission_answer1);
        answer2.setText(admission_answer2);

    }
}
