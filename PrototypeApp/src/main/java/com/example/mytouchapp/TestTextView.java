package com.example.mytouchapp;

import android.content.Context;
import android.text.method.Touch;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by dada on 2017/9/25.
 */

public class TestTextView extends Button{
    public TestTextView(Context context) {
        super(context);
    }

    public TestTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("@@@", "dispatchTouchEvent: "+"子view  "+"ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("@@@", "dispatchTouchEvent: "+"子view  "+"ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("@@@", "dispatchTouchEvent: "+"子view  "+"ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("@@@", "onTouchEvent: "+"子view  "+"ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("@@@", "onTouchEvent: "+"子view  "+"ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("@@@", "onTouchEvent: "+"子view  "+"ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}
