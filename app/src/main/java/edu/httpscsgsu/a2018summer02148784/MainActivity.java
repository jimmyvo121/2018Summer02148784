package edu.httpscsgsu.a2018summer02148784;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        RelativeLayout b = findViewById(R.id.main_title_layout);
        Toast.makeText(this,"hello, android!", Toast.LENGTH_LONG);
    }
}
