package edu.httpscsgsu.a2018summer02148784.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import edu.httpscsgsu.a2018summer02148784.R;

public class Quiz1Activity extends AppCompatActivity {

    private Button quiz1;
    private Button quiz2;
    private Button quiz3;
    private Button submit;

    ViewPager viewPager;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        quiz1 = findViewById(R.id.quiz1_bt);
        quiz2 = findViewById(R.id.quiz2_bt);
        quiz3 = findViewById(R.id.quiz3_bt);
        submit = findViewById(R.id.quiz_submit_bt);

        quiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Quiz1Activity.this, "You clicked Quiz one", Toast.LENGTH_SHORT).show();
            }
        });
        quiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Quiz1Activity.this, Quiz2LVActivity.class);
                startActivity(intent);
            }
        });
        quiz3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Quiz1Activity.this, Quiz2PVActivity.class);
                startActivity(intent);
            }
        });



    }

}
