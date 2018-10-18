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

import hk.hku.cs.buttonnavigationtest.About.AboutHKU;
import hk.hku.cs.buttonnavigationtest.About.Faculty;
import hk.hku.cs.buttonnavigationtest.About.ProgrammeleadersWelcome;
import hk.hku.cs.buttonnavigationtest.Admission.CompositionFees;
import hk.hku.cs.buttonnavigationtest.Admission.FAQ;
import hk.hku.cs.buttonnavigationtest.Admission.InfoSessions;
import hk.hku.cs.buttonnavigationtest.Admission.OurStudents;
import hk.hku.cs.buttonnavigationtest.Admission.Procedures;
import hk.hku.cs.buttonnavigationtest.Admission.Requirements;

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest
 *  文件名：    Layout_One
 *  创建者：    BENNETT
 *  创建时间：  2018/10/16 20:35
 *  描述：      TODO
 */public class Layout_Two extends Fragment{
    //TabLayout
    private TabLayout mTabLayout_Two;
    //ViewPager
    private ViewPager mViewPager_Two;
    //Title
    private List<String> mTitle_Two;
    //Fragment
    private List<Fragment> mFragment_Two;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_two,container,false);

        initData_two();
        initView_two(view);
        return view;
    }

    private void initView_two(View view) {
        mTabLayout_Two = (TabLayout)view.findViewById(R.id.mTabLayout_two);
        mViewPager_Two = (ViewPager)view.findViewById(R.id.mViewPager_two);
        mViewPager_Two.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            //选中的哪个item
            @Override
            public Fragment getItem(int position) {
                return mFragment_Two.get(position);
            }
            //返回item个数
            @Override
            public int getCount() {
                return mFragment_Two.size();
            }
            //设置标题
            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle_Two.get(position);
            }
        });
        //绑定
        mTabLayout_Two.setupWithViewPager(mViewPager_Two);
    }

    private void initData_two() {
        mTitle_Two = new ArrayList<>();
        mTitle_Two.add("Requirements");
        mTitle_Two.add("Procedures");
        mTitle_Two.add("Composition Fees");
        mTitle_Two.add("Our Students");
        mTitle_Two.add("Information Sessions");
        mTitle_Two.add("FAQ");

        mFragment_Two = new ArrayList<>();
        mFragment_Two.add(new Requirements());
        mFragment_Two.add(new Procedures());
        mFragment_Two.add(new CompositionFees());
        mFragment_Two.add(new OurStudents());
        mFragment_Two.add(new InfoSessions());
        mFragment_Two.add(new FAQ());
    }
}
