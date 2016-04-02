package com.example.jinliang.testevent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

//    @Bind(R.id.myviewPager)
//    MyViewPageDemo myviewPager;
//
//    private Fragment fragmentA;
//    private Fragment fragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


//        FragmentManager fm = getSupportFragmentManager();
//        //初始化自定义适配器
//        MyFragmentAdapter mAdapter = new MyFragmentAdapter(fm);
//        myviewPager.setAdapter(mAdapter);


    }


//    private class MyFragmentAdapter extends FragmentPagerAdapter {
//
//
//        public MyFragmentAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
//
//        @Override
//        public void destroyItem(ViewGroup container, int position, Object object) {
//            super.destroyItem(container, position, object);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            if (position == 0) {
//                return new FragmentA().newInstance(0);
//            } else {
//                return new FragmentB().newInstance(1);
//
//            }
//
//        }
//
//        @Override
//        public int getCount() {
//            return 2;
//        }
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
