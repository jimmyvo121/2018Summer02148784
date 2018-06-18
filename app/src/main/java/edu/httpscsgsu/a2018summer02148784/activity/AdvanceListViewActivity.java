package edu.httpscsgsu.a2018summer02148784.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import edu.httpscsgsu.a2018summer02148784.R;

public class AdvanceListViewActivity extends AppCompatActivity {

    private View listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list_view);
        listView = findViewById(R.id.adv_listView);



    }

}
