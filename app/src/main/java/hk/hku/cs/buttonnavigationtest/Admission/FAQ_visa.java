package hk.hku.cs.buttonnavigationtest.Admission;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Admission
 *  文件名：    FAQ_visa
 *  创建者：    BENNETT
 *  创建时间：  2018/11/7 19:54
 *  描述：      TODO
 */public class FAQ_visa extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admission_faq_visa);

        TextView admission_visrelated_faq11 = findViewById(R.id.admission_visrelated_faq1);
        TextView admission_visrelated_faq12 = findViewById(R.id.admission_visrelated_faq2);
        TextView admission_visrelated_faq13 = findViewById(R.id.admission_visrelated_faq3);
        TextView admission_visrelated_faq14 = findViewById(R.id.admission_visrelated_faq4);

        admission_visrelated_faq11.setOnClickListener(this);
        admission_visrelated_faq12.setOnClickListener(this);
        admission_visrelated_faq13.setOnClickListener(this);
        admission_visrelated_faq14.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.admission_visrelated_faq1:
                Intent intent1 = new Intent(FAQ_visa.this,FAQ_answer.class);
                String admission_visrelated_faq1 = this.getString(R.string.admission_visrelated_faq1);
                String admission_visrelated_faq1_answer = this.getString(R.string.admission_visrelated_faq1_answer);
                intent1.putExtra("dif_question",admission_visrelated_faq1);
                intent1.putExtra("dif_answer",admission_visrelated_faq1_answer);
                startActivity(intent1);
                break;
            case R.id.admission_visrelated_faq2:
                Intent intent2 = new Intent(FAQ_visa.this,FAQ_answer.class);
                String admission_visrelated_faq2 = this.getString(R.string.admission_visrelated_faq2);
                String admission_visrelated_faq2_answer = this.getString(R.string.admission_visrelated_faq2_answer);
                intent2.putExtra("dif_question",admission_visrelated_faq2);
                intent2.putExtra("dif_answer",admission_visrelated_faq2_answer);
                startActivity(intent2);
                break;
            case R.id.admission_visrelated_faq3:
                Intent intent3 = new Intent(FAQ_visa.this,FAQ_answer.class);
                String admission_visrelated_faq3 = this.getString(R.string.admission_visrelated_faq3);
                String admission_visrelated_faq3_answer = this.getString(R.string.admission_visrelated_faq3_answer);
                intent3.putExtra("dif_question",admission_visrelated_faq3);
                intent3.putExtra("dif_answer",admission_visrelated_faq3_answer);
                startActivity(intent3);
                break;
            case R.id.admission_visrelated_faq4:
                Intent intent4 = new Intent(FAQ_visa.this,FAQ_answer.class);
                String admission_visrelated_faq4 = this.getString(R.string.admission_visrelated_faq4);
                String admission_visrelated_faq4_answer = this.getString(R.string.admission_visrelated_faq4_answer);
                intent4.putExtra("dif_question",admission_visrelated_faq4);
                intent4.putExtra("dif_answer",admission_visrelated_faq4_answer);
                startActivity(intent4);
                break;
        }

    }
}
