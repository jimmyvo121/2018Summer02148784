package edu.httpscsgsu.a2018summer02148784.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import edu.httpscsgsu.a2018summer02148784.R;

public class IntentAndBundleActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_and_bundle);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("B");
        String bundle_msg = bundle.getString("B_Msg");
        bundle.getSerializable("Base");
        int number = intent.getIntExtra("No",0);
        String msg = intent.getStringExtra("Msg");
        Toast.makeText(this, String.valueOf(number), Toast.LENGTH_SHORT).show();
        tv = findViewById(R.id.intent_tv);
        tv.setText(bundle_msg);
    }
}
