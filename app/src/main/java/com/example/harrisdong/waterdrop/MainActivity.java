package com.example.harrisdong.waterdrop;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

import com.example.harrisdong.waterdrop.base.BaseActivity;
import com.example.harrisdong.waterdrop.fragment.ArticleFragment;
import com.example.harrisdong.waterdrop.fragment.HotsPotFragment;
import com.example.harrisdong.waterdrop.fragment.PUSHFragment;
import com.example.harrisdong.waterdrop.fragment.TopicFragment;
import com.example.harrisdong.waterdrop.fragment.VideoFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private List<Fragment> fragments = new ArrayList<>();
    private ViewPager mViewPager;
    private TabLayout tabLayout;
    private String[] titles = {"热点", "PUSH", "话题", "视频", "文章"};
    private TabLayoutAdapter tabLayoutAdapter;
    private HotsPotFragment potFragment;
    private VideoFragment videoFragment;
    private PUSHFragment pushFragment;
    private TopicFragment topicFragment;
    private ArticleFragment articleFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        initData();
    }


    private void initView() {
        mViewPager = findViewById(R.id.mViewPager);
        tabLayout = findViewById(R.id.mTab);
        tabLayoutAdapter = new TabLayoutAdapter(getSupportFragmentManager(), fragments, titles);
        fragments.add(potFragment);
        fragments.add(videoFragment);
        fragments.add(pushFragment);
        fragments.add(topicFragment);
        fragments.add(articleFragment);
        mViewPager.setAdapter(tabLayoutAdapter);

//        绑定
        tabLayout.setupWithViewPager(mViewPager);


    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    public void initData() {
//        热点
        potFragment = new HotsPotFragment();
//        视频
        videoFragment = new VideoFragment();
//        PUSH
        pushFragment = new PUSHFragment();
//        话题
        topicFragment = new TopicFragment();
//        文章
        articleFragment = new ArticleFragment();



    }

    @Override
    public void initView(Bundle savedInstanceState) {

    }

    @Override
    public void initOnClick() {

    }

    class TabLayoutAdapter extends FragmentPagerAdapter {
        private Context mContext;
        private List<Fragment> mList;
        private String[] titles = {"热点", "PUSH", "话题", "视频", "文章"};

        public TabLayoutAdapter(FragmentManager fm, Context mContext, List<Fragment> mList, String[] titles) {
            super(fm);
            this.mContext = mContext;
            this.mList = mList;
            this.titles = titles;
        }

        public TabLayoutAdapter(FragmentManager fm, List<Fragment> fragments, String[] titles) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }
    }
}


