package com.example.eka.alarm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by eka on 2017. 4. 2..
 */

public class AlarmlListAdapter extends BaseAdapter {
    private ArrayList<AlarmListItem> items;
    private Context context;

    public AlarmlListAdapter(ArrayList<AlarmListItem> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.alarm_list,null);
        TextView time = (TextView) view.findViewById(R.id.alarm_listitem_time);
        TextView text = (TextView) view.findViewById(R.id.alarm_listitem_text);
        time.setText(items.get(position).getTime());
        text.setText(items.get(position).getContents());
        return view;
    }
}
