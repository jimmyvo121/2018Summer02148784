package edu.httpscsgsu.a2018summer02148784;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tv_demo;
    private TextView tv_work;
    private Object v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        RelativeLayout b = findViewById(R.id.main_title_layout);
        Toast.makeText(this,"hello, android!", Toast.LENGTH_LONG);
        
        intialView();
        setListener();
    }
    

    private void intialView() {
        tv_demo = (TextView) findViewById(R.id.activity_tool_demo);
        tv_work = (TextView) findViewById(R.id.activity_tool_work);
    }
    private void setListener() {
        tv_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You clicked demo",  Toast.LENGTH_SHORT).show();
            }
        });

         View.OnClickListener listener = new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Toast.makeText(MainActivity.this, "You clicked work", Toast.LENGTH_SHORT).show();
             }
         };
         tv_work.setOnClickListener(listener);

    }

    public void login (View v) {
        Toast.makeText(MainActivity.this, "You clicked login", Toast.LENGTH_SHORT).show();
    }
}
