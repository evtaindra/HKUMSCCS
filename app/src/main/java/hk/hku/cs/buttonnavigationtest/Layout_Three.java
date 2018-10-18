package hk.hku.cs.buttonnavigationtest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import hk.hku.cs.buttonnavigationtest.Admission.CompositionFees;
import hk.hku.cs.buttonnavigationtest.Admission.FAQ;
import hk.hku.cs.buttonnavigationtest.Admission.InfoSessions;
import hk.hku.cs.buttonnavigationtest.Admission.OurStudents;
import hk.hku.cs.buttonnavigationtest.Admission.Procedures;
import hk.hku.cs.buttonnavigationtest.Admission.Requirements;
import hk.hku.cs.buttonnavigationtest.Curriculum.Courses;
import hk.hku.cs.buttonnavigationtest.Curriculum.DurationofStudyClassschedule;
import hk.hku.cs.buttonnavigationtest.Curriculum.ProgrammeOVerview;
import hk.hku.cs.buttonnavigationtest.Curriculum.RegulationsandSyllabus;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest
 *  文件名：    Layout_One
 *  创建者：    BENNETT
 *  创建时间：  2018/10/16 20:35
 *  描述：      TODO
 */public class Layout_Three extends Fragment{
    //TabLayout
    private TabLayout mTabLayout_Three;
    //ViewPager
    private ViewPager mViewPager_Three;
    //Title
    private List<String> mTitle_Three;
    //Fragment
    private List<Fragment> mFragment_Three;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_three,container,false);

        initData_three();
        initView_three(view);
        return view;
    }

    private void initView_three(View view) {
        mTabLayout_Three = (TabLayout)view.findViewById(R.id.mTabLayout_three);
        mViewPager_Three = (ViewPager)view.findViewById(R.id.mViewPager_three);
        mViewPager_Three.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            //选中的哪个item
            @Override
            public Fragment getItem(int position) {
                return mFragment_Three.get(position);
            }
            //返回item个数
            @Override
            public int getCount() {
                return mFragment_Three.size();
            }
            //设置标题
            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle_Three.get(position);
            }
        });
        //绑定
        mTabLayout_Three.setupWithViewPager(mViewPager_Three);
    }

    private void initData_three() {
        mTitle_Three = new ArrayList<>();
        mTitle_Three.add("Programme Overview");
        mTitle_Three.add("Courses");
        mTitle_Three.add("Duration of Study & Class Schedule");
        mTitle_Three.add("Regulations and Syllabus");

        mFragment_Three = new ArrayList<>();
        mFragment_Three.add(new ProgrammeOVerview());
        mFragment_Three.add(new Courses());
        mFragment_Three.add(new DurationofStudyClassschedule());
        mFragment_Three.add(new RegulationsandSyllabus());
    }
}
