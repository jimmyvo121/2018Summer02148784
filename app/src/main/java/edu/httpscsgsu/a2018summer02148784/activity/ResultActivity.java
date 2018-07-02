package edu.httpscsgsu.a2018summer02148784.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.httpscsgsu.a2018summer02148784.R;

public class ResultActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


    }

    @Override
    protected void onDestroy(){
        Intent intent;
        setResult(200);
        super.onDestroy();
    }

}
