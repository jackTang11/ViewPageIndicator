package com.viewpagerindicator.sample;

import com.example.viewpagesingle.R;
import com.viewpagerindicator.CirclePageIndicator;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

public class SampleCirclesWithListener extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_circles);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);

        //We set this on the indicator, NOT the pager
        mIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                Toast.makeText(SampleCirclesWithListener.this, "Changed to page " + position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }
}