package hk.hku.cs.buttonnavigationtest.Admission;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Admission
 *  文件名：    FAQ_admission
 *  创建者：    BENNETT
 *  创建时间：  2018/11/7 19:54
 *  描述：      TODO
 */public class FAQ_admission extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admission_faq_admission);

        TextView admission_faq_admission1 = findViewById(R.id.admission_faq_admission1);
        TextView admission_faq_admission2 = findViewById(R.id.admission_faq_admission2);
        TextView admission_faq_admission3 = findViewById(R.id.admission_faq_admission3);
        TextView admission_faq_admission4 = findViewById(R.id.admission_faq_admission4);
        TextView admission_faq_admission5 = findViewById(R.id.admission_faq_admission5);
        TextView admission_faq_admission6 = findViewById(R.id.admission_faq_admission6);
        TextView admission_faq_admission7 = findViewById(R.id.admission_faq_admission7);
        TextView admission_faq_admission8 = findViewById(R.id.admission_faq_admission8);
        TextView admission_faq_admission9 = findViewById(R.id.admission_faq_admission9);

        admission_faq_admission1.setOnClickListener(this);
        admission_faq_admission2.setOnClickListener(this);
        admission_faq_admission3.setOnClickListener(this);
        admission_faq_admission4.setOnClickListener(this);
        admission_faq_admission5.setOnClickListener(this);
        admission_faq_admission6.setOnClickListener(this);
        admission_faq_admission7.setOnClickListener(this);
        admission_faq_admission8.setOnClickListener(this);
        admission_faq_admission9.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.admission_faq_admission1:
                Intent intent = new Intent(FAQ_admission.this,FAQ_answer.class);
                String admission_admission_faq11 = this.getString(R.string.admission_admission_faq1);
                String admission_admission_answer11 = this.getString(R.string.admission_admission_faq1_answer);
                intent.putExtra("dif_question",admission_admission_faq11);
                intent.putExtra("dif_answer",admission_admission_answer11);
                startActivity(intent);
                break;
            case R.id.admission_faq_admission2:
                Intent intent2 = new Intent(FAQ_admission.this,FAQ_answer.class);
                String admission_admission_faq12= this.getString(R.string.admission_admission_faq2);
                String admission_admission_answer12 = this.getString(R.string.admission_admission_faq2_answer);
                intent2.putExtra("dif_question",admission_admission_faq12);
                intent2.putExtra("dif_answer",admission_admission_answer12);
                startActivity(intent2);
                break;
            case R.id.admission_faq_admission3:
                Intent intent3 = new Intent(FAQ_admission.this,FAQ_answer.class);
                String admission_admission_faq13= this.getString(R.string.admission_admission_faq3);
                String admission_admission_answer13 = this.getString(R.string.admission_admission_faq3_answer);
                intent3.putExtra("dif_question",admission_admission_faq13);
                intent3.putExtra("dif_answer",admission_admission_answer13);
                startActivity(intent3);
                break;
            case R.id.admission_faq_admission4:
                Intent intent4 = new Intent(FAQ_admission.this,FAQ_answer.class);
                String admission_admission_faq14= this.getString(R.string.admission_admission_faq4);
                String admission_admission_answer14 = this.getString(R.string.admission_admission_faq4_answer);
                intent4.putExtra("dif_question",admission_admission_faq14);
                intent4.putExtra("dif_answer",admission_admission_answer14);
                startActivity(intent4);
                break;
            case R.id.admission_faq_admission5:
                Intent intent5 = new Intent(FAQ_admission.this,FAQ_answer.class);
                String admission_admission_faq15= this.getString(R.string.admission_admission_faq5);
                String admission_admission_answer15 = this.getString(R.string.admission_admission_faq5_answer);
                intent5.putExtra("dif_question",admission_admission_faq15);
                intent5.putExtra("dif_answer",admission_admission_answer15);
                startActivity(intent5);
                break;
            case R.id.admission_faq_admission6:
                Intent intent6 = new Intent(FAQ_admission.this,FAQ_answer.class);
                String admission_admission_faq16= this.getString(R.string.admission_admission_faq6);
                String admission_admission_answer16 = this.getString(R.string.admission_admission_faq6_answer);
                intent6.putExtra("dif_question",admission_admission_faq16);
                intent6.putExtra("dif_answer",admission_admission_answer16);
                startActivity(intent6);
                break;
            case R.id.admission_faq_admission7:
                Intent intent7 = new Intent(FAQ_admission.this,FAQ_answer.class);
                String admission_admission_faq17= this.getString(R.string.admission_admission_faq7);
                String admission_admission_answer17 = this.getString(R.string.admission_admission_faq7_answer);
                intent7.putExtra("dif_question",admission_admission_faq17);
                intent7.putExtra("dif_answer",admission_admission_answer17);
                startActivity(intent7);
                break;
            case R.id.admission_faq_admission8:
                Intent intent8 = new Intent(FAQ_admission.this,FAQ_answer.class);
                String admission_admission_faq18= this.getString(R.string.admission_admission_faq8);
                String admission_admission_answer18 = this.getString(R.string.admission_admission_faq8_answer);
                intent8.putExtra("dif_question",admission_admission_faq18);
                intent8.putExtra("dif_answer",admission_admission_answer18);
                startActivity(intent8);
                break;
            case R.id.admission_faq_admission9:
                Intent intent9 = new Intent(FAQ_admission.this,FAQ_answer.class);
                String admission_admission_faq19= this.getString(R.string.admission_admission_faq9);
                String admission_admission_answer19 = this.getString(R.string.admission_admission_faq9_answer);
                intent9.putExtra("dif_question",admission_admission_faq19);
                intent9.putExtra("dif_answer",admission_admission_answer19);
                startActivity(intent9);
                break;

        }

    }
}
