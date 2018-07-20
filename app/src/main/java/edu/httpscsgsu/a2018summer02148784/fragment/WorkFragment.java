package edu.httpscsgsu.a2018summer02148784.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.activity.BaseActivity;
import edu.httpscsgsu.a2018summer02148784.activity.Quiz1Activity;
import edu.httpscsgsu.a2018summer02148784.activity.Quiz2LVActivity;
import edu.httpscsgsu.a2018summer02148784.activity.Quiz2PVActivity;
import edu.httpscsgsu.a2018summer02148784.activity.Quiz3Activity;
import edu.httpscsgsu.a2018summer02148784.activity.Quiz5Activity;
import edu.httpscsgsu.a2018summer02148784.bean.CustomDialog;

public class WorkFragment extends Fragment {

     @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("fragment","ContentFragment: onDestroy");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("fragment","ContentFragment: onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("fragment","ContentFragment: onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("fragment","ContentFragment: onPause");
    }
    public void onResume() {
        super.onResume();
        Log.d("fragment","ContentFragment: onResume");
    }

    private Button quiz1;
    private Button quiz2;
    private Button quiz3;
    private Button quiz5;
    private Button submit;


    private int checkedId;
    ViewPager viewPager;





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_work, viewGroup, false);

        return view;
    }
    @BindView(R.id.quiz4_radioGroup)
    RadioGroup radioGroup;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstance){

        quiz1 = getView().findViewById(R.id.quiz1_bt);
        quiz2 = getView().findViewById(R.id.quiz2_bt);
        quiz3 = getView().findViewById(R.id.quiz3_bt);
        quiz5 = getView().findViewById(R.id.quiz4_bt);

        submit= getView().findViewById(R.id.quiz_submit_bt);

        quiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You clicked Quiz one", Toast.LENGTH_SHORT).show();
            }
        });
        quiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(getContext(), Quiz2LVActivity.class);
                startActivity(intent);
            }
        });
        quiz3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Quiz3Activity.class);
                startActivity(intent);
            }
        });
        quiz5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setClass(getActivity(), Quiz5Activity.class);
                startActivity(intent);
            }
        });
    }

}
