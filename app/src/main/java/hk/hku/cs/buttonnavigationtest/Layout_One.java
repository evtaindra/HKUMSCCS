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

/*
 *  项目名：    ButtonNavigationTest
 *  包名：      hk.hku.cs.buttonnavigationtest
 *  文件名：    Layout_One
 *  创建者：    BENNETT
 *  创建时间：  2018/10/16 20:35
 *  描述：      TODO
 */public class Layout_One extends Fragment{
    //TabLayout
    private TabLayout mTabLayout_One;
    //ViewPager
    private ViewPager mViewPager_One;
    //Title
    private List<String> mTitle_One;
    //Fragment
    private List<Fragment> mFragment_One;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_one,container,false);

        initData_one();
        initView_one(view);
        return view;
    }

    private void initView_one(View view) {
        mTabLayout_One = (TabLayout)view.findViewById(R.id.mTabLayout_one);
        mViewPager_One = (ViewPager)view.findViewById(R.id.mViewPager_one);
        mViewPager_One.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
            //选中的哪个item
            @Override
            public Fragment getItem(int position) {
                return mFragment_One.get(position);
            }
            //返回item个数
            @Override
            public int getCount() {
                return mFragment_One.size();
            }
            //设置标题
            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return mTitle_One.get(position);
            }
        });
        //绑定
        mTabLayout_One.setupWithViewPager(mViewPager_One);
    }

    private void initData_one() {
        mTitle_One = new ArrayList<>();
        mTitle_One.add("Leaders' Welcome");
        mTitle_One.add("Faculty");
        mTitle_One.add("About HKU");

        mFragment_One = new ArrayList<>();
        mFragment_One.add(new ProgrammeleadersWelcome());
        mFragment_One.add(new Faculty());
        mFragment_One.add(new AboutHKU());
    }
}
