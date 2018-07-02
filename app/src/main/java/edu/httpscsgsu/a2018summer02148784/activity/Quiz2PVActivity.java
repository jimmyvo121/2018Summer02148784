package edu.httpscsgsu.a2018summer02148784.activity;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.adapter.ViewPagerAdapter;
import edu.httpscsgsu.a2018summer02148784.fragment.DemoFragment;
import edu.httpscsgsu.a2018summer02148784.fragment.Test1Fragment;
import edu.httpscsgsu.a2018summer02148784.fragment.WorkFragment;

public class Quiz2PVActivity extends BaseActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2_pv);
        viewPager = findViewById(R.id.viewpager_viewpager);

        fragmentList.add(new WorkFragment());
        fragmentList.add(new Test1Fragment());
        fragmentList.add(new WorkFragment());

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentList);
        viewPager.setAdapter(adapter);

    }
}
