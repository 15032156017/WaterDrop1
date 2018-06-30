package com.example.harrisdong.waterdrop.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.harrisdong.waterdrop.R;
import com.example.harrisdong.waterdrop.base.BaseFragment;

public class HotsPotFragment extends BaseFragment {


    private SwipeRefreshLayout mSwipe;
    private RecyclerView mRecy;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_hostpot;
    }

    @Override
    public void initView(View view, Bundle savedInstanceState) {
        mSwipe = view.findViewById(R.id.mSwipe);
        mRecy = view.findViewById(R.id.mRecy);


    }

    @Override
    protected void initData() {

    }

    @Override
    protected void addListener() {

    }
}
