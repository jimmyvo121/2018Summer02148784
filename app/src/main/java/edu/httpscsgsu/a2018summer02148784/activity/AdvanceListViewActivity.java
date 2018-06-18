package edu.httpscsgsu.a2018summer02148784.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import edu.httpscsgsu.a2018summer02148784.R;
import edu.httpscsgsu.a2018summer02148784.adapter.AdvListAdapter;

public class AdvanceListViewActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> list = new ArrayList<String>();
    private AdvListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list_view);
        View view = getLayoutInflater().inflate(R.layout.listview_header, null);


        list.add("hello");
        list.add("hi");
        list.add("howdy");
        list.add("hey");
        list.add("hi");

        listView = findViewById(R.id.adv_listView);
        adapter = new AdvListAdapter(this, list);
        listView.setAdapter(adapter);
        listView.addHeaderView(view);

    }

}
