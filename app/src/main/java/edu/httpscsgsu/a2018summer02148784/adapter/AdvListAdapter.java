package edu.httpscsgsu.a2018summer02148784.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

import edu.httpscsgsu.a2018summer02148784.R;

public class AdvListAdapter extends BaseAdapter {
    private final Context context;
    private final LayoutInflater inflater;
    private List<String> list;
    


    public AdvListAdapter(Context context, List<String> list){
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));
    }
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = inflater.inflate(R.layout.item_adv_listview,parent,false);

        }

        return null;
    }


}
