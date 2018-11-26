package hk.hku.cs.buttonnavigationtest.Curriculum;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hk.hku.cs.buttonnavigationtest.R;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest.Curriculum
 *  文件名：    ProgrammeOVerview
 *  创建者：    BENNETT
 *  创建时间：  2018/10/17 16:05
 *  描述：      TODO
 */public class ProgrammeOVerview extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.curriculum_programmeoverview,null);

        final View viewcyber = view.findViewById(R.id.cyberSecirity_move);
        final View viewMultimedia = view.findViewById(R.id.MultimediaComputing_move);
        final View viewFinancial = view.findViewById(R.id.FinancialComputing_move);
        final View viewGeneral = view.findViewById(R.id.General_move);

        viewcyber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Overview_cyber.class);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(getActivity(),viewcyber,"CyberSecurity");
                startActivity(intent,options.toBundle());
            }
        });

        viewMultimedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Overview_MultimediaComputing.class);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(getActivity(),viewMultimedia,"MultimediaComputing");
                startActivity(intent,options.toBundle());
            }
        });

        viewFinancial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Overview_FinalcialComuputing.class);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(getActivity(),viewFinancial,"FinancialComputing");
                startActivity(intent,options.toBundle());
            }
        });

        viewGeneral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Overview_General.class);
                ActivityOptionsCompat options = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(getActivity(),viewGeneral,"General");
                startActivity(intent,options.toBundle());
            }
        });

        return view;
    }


}
