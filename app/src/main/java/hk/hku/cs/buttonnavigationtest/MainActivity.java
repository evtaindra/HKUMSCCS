package hk.hku.cs.buttonnavigationtest;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import hk.hku.cs.buttonnavigationtest.About.AboutHKU;
import hk.hku.cs.buttonnavigationtest.About.Faculty;
import hk.hku.cs.buttonnavigationtest.About.ProgrammeleadersWelcome;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_about:
                    replaceFragment(new Layout_One());
                    return true;
                case R.id.navigation_admission:
                    replaceFragment(new Layout_Two());
                    return true;
                case R.id.navigation_curriculum:
                    replaceFragment(new Layout_Three());
                    return true;
                case R.id.navigation_newsevents:
                    replaceFragment(new Layout_Four());
                    return true;
                case R.id.navigation_sturesources:
                    replaceFragment(new Layout_Five());
                    return true;
                default:
                    break;
            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.hide();
        }

        replaceFragment(new Layout_One());

    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.above_layout,fragment);
        transaction.commit();
    }

}
