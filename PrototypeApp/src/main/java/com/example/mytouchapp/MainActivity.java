package com.example.mytouchapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test2).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        Log.d("@@@", "onTouchEvent: "+"子view--Activity  "+"ACTION_DOWN");
                        break;
                    case MotionEvent.ACTION_MOVE:
                        Log.d("@@@", "onTouchEvent: "+"子view--Activity  "+"ACTION_MOVE");
                        break;
                    case MotionEvent.ACTION_UP:
                        Log.d("@@@", "onTouchEvent: "+"子view--Activity  "+"ACTION_UP");
                        break;
                }
                return false;
            }
        });
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("@@@", "dispatchTouchEvent: "+"Activity  "+"ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("@@@", "dispatchTouchEvent: "+"Activity  "+"ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("@@@", "dispatchTouchEvent: "+"Activity  "+"ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("@@@", "onTouchEvent: "+"Activity  "+"ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("@@@", "onTouchEvent: "+"Activity  "+"ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("@@@", "onTouchEvent: "+"Activity  "+"ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}
