package com.example.jinliang.testevent;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by jinliang on 16-4-2.
 */
public class MyViewPageDemo extends ViewPager {
     private final static String TAG = MyViewPageDemo.class.getName();
    public MyViewPageDemo(Context context) {
        super(context);
    }

    public MyViewPageDemo(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "dispatchTouchEvent: ----UP----");
                break;
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "dispatchTouchEvent: ----Down----");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "dispatchTouchEvent: ----Move----");
                break;
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "onInterceptTouchEvent: ----UP----");
                break;
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "onInterceptTouchEvent: ----Down----");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "onInterceptTouchEvent: ----Move----");
                break;
        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "onTouchEvent: ----UP----");
                break;
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "onTouchEvent: ----Down----");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "onTouchEvent: ----Move----");
                break;
        }
        return super.onTouchEvent(ev);
    }
}
