package com.example.jinliang.testevent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by jinliang on 16-4-2.
 */
public class FragmentB extends Fragment {
 private final static String TAG = FragmentB.class.getName();
private  int mNum ;

    public FragmentB newInstance(int num ) {
        FragmentB fragment = new FragmentB();
        // Supply num input as an argument.
        Bundle args = new Bundle();
        args.putInt("num", num);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //这里我只是简单的用num区别标签，其实具体应用中可以使用真实的fragment对象来作为叶片
        mNum = getArguments() != null ? getArguments().getInt("num") : 1;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_fragment2,null);
//        TextView textView  = (TextView) view.findViewById(R.id.tv_content);
//        textView.setText(mNum);


        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.i(TAG, "onTouch: " +event.getAction());
                return false;
            }
        });
        return view;
    }



}
