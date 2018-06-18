package edu.httpscsgsu.a2018summer02148784.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.adapter.ScaleTypeAdapter;

public class ScaleTypeActivity extends AppCompatActivity {

    private View view1;
    private View view3;
    private View view2;
    private List<View> viewList = new ArrayList<View>();
    private ScaleTypeAdapter adapter;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_type);
        viewPager = findViewById(R.id.scale_type_vp);

        LayoutInflater lf = getLayoutInflater().from(this);
        view1 = lf.inflate(R.layout.scale_type_center_inside, null );
        view2 = lf.inflate(R.layout.scale_type_center, null );
        view3 = lf.inflate(R.layout.scale_type_center_crop, null );
    
        viewList.add(view1);
        viewList.add(view2);
        viewList.add(view3);

        adapter = new ScaleTypeAdapter(viewList);
        viewPager.setAdapter(adapter);


    }
}
