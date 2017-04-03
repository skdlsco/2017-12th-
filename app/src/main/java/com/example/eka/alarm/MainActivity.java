package com.example.eka.alarm;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.tomerrosenfeld.customanalogclockview.CustomAnalogClock;


public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("asdf","asdf");
//        startActivity(new Intent(this,Intro.class));

        viewPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter= new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(pagerAdapter);
    }

}
