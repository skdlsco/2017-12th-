package com.example.eka.alarm;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class alarm_page extends Fragment {
    private ArrayList<AlarmListItem> items= new ArrayList<>();
    private AlarmlListAdapter alarmlListAdapter;
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_alarm_page,container,false);
        final Context context = view.getContext();
        listView = (ListView) view.findViewById(R.id.alarm_list);
        alarmlListAdapter = new AlarmlListAdapter(items,context);
        listView.setAdapter(alarmlListAdapter);
        items.add(new AlarmListItem("10:24","불끄기전등끄기"));
        items.add(new AlarmListItem("10:24","불끄기전등끄기"));
        items.add(new AlarmListItem("10:24","불끄기전등끄기"));
        items.add(new AlarmListItem("10:24","불끄기전등끄기"));
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(final AdapterView<?> parent, View view, final int position, long id) {
                new AlertDialog.Builder(view.getContext())
                        .setTitle("알람 삭제")
                        .setMessage("알람을 삭제 하시겠습니까?")
                        .setPositiveButton("삭제", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                items.remove(position);
                                alarmlListAdapter.notifyDataSetChanged();
                                dialog.dismiss();
                            }
                        })
                        .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).show();
                return true;
            }
        });
        return view;
    }
}
