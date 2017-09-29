package com.example.mytouchapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by dada on 2017/9/25.
 */

public class TestLayout extends LinearLayout{
    public TestLayout(Context context) {
        super(context);
    }

    public TestLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TestLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("@@@", "dispatchTouchEvent2: "+"父view  "+"ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("@@@", "dispatchTouchEvent2: "+"父view  "+"ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("@@@", "dispatchTouchEvent2: "+"父view  "+"ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("@@@", "onInterceptTouchEvent: "+"父view  "+"ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("@@@", "onInterceptTouchEvent: "+"父view  "+"ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("@@@", "onInterceptTouchEvent: "+"父view  "+"ACTION_UP");
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("@@@", "onTouchEvent: "+"父view  "+"ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("@@@", "onTouchEvent: "+"父view  "+"ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("@@@", "onTouchEvent: "+"父view  "+"ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}
