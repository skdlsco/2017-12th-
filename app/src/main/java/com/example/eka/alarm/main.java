package com.example.eka.alarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tomerrosenfeld.customanalogclockview.CustomAnalogClock;


public class main extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        CustomAnalogClock customAnalogClock= (CustomAnalogClock) view.findViewById(R.id.clock);
        customAnalogClock.init(getActivity(),R.drawable.watch_face,R.drawable.hour_hand,R.drawable.minute_hand,0,false,false);
        Button add_btn= (Button) view.findViewById(R.id.add_btn);
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(getActivity(),Add_Alarm.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
