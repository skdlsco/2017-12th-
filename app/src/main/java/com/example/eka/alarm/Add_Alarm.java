package com.example.eka.alarm;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

/**
 * Created by eka on 2017. 4. 2..
 */

public class Add_Alarm extends Activity {
    private Button btn_back;
    private String contents;
    private String time;
    private TimePicker timePicker;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        Log.d("fucking","adsfadf");
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.add_alarm);
        btn_back = (Button) findViewById(R.id.btn_back);
        timePicker = (TimePicker) findViewById(R.id.time_picker);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
