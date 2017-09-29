package com.example.mytouchapp;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by dada on 2017/9/25.
 */

public class TestTextView2 extends TextView{
    public TestTextView2(Context context) {
        super(context);
    }

    public TestTextView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("@@@", "dispatchTouchEvent2: "+"子view2  "+"ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("@@@", "dispatchTouchEvent2: "+"子view2  "+"ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("@@@", "dispatchTouchEvent2: "+"子view2  "+"ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("@@@", "onTouchEvent: "+"子view2  "+"ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("@@@", "onTouchEvent: "+"子view2  "+"ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("@@@", "onTouchEvent: "+"子view2  "+"ACTION_UP");
                break;
        }
        return super.onTouchEvent(event);
    }
}
