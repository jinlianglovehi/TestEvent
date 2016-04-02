package com.example.jinliang.testevent;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by jinliang on 16-4-2.
 */
public class LinearLayoutB extends LinearLayout {
    
     private final static String TAG = LinearLayoutB.class.getName();
    public LinearLayoutB(Context context) {
        super(context);
    }

    public LinearLayoutB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LinearLayoutB(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
