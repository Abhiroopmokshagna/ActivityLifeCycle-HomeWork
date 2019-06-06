package com.mokshagna.abhiroop.activitylifecyclehomework;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount;
    private TextView show_count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCount=0;
        show_count = findViewById(R.id.show_count);
        if(savedInstanceState!=null){
            mCount = savedInstanceState.getInt("countvalue");
            show_count.setText(Integer.toString(mCount));
        }
    }

    public void countUp(View view) {
        mCount++;
        show_count.setText(Integer.toString(mCount));
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt("countvalue",mCount);
        super.onSaveInstanceState(outState);
    }
}
