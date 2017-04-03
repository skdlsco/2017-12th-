package com.example.eka.alarm;

import android.widget.Switch;

/**
 * Created by eka on 2017. 4. 2..
 */

public class AlarmListItem {
    String time;
    String contents;
    Switch aSwitch;

    public AlarmListItem(String time, String contents) {
        this.time = time;
        this.contents = contents;
//        this.aSwitch = aSwitch;
    }

    public String getTime() {

        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

}
