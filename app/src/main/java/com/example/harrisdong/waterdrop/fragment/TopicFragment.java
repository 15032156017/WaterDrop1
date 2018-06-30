package com.example.harrisdong.waterdrop.fragment;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.ListView;

import com.example.harrisdong.waterdrop.R;
import com.example.harrisdong.waterdrop.base.BaseFragment;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class TopicFragment extends BaseFragment {

    private ListView topListView;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_topic;
    }

    @Override
    public void initView(View view, Bundle savedInstanceState) {
        swipeRefreshLayout = view.findViewById(R.id.mTopSwpie);
        topListView = view.findViewById(R.id.mTopListView);

    }

    @Override
    protected void initData() {


    }

    @Override
    protected void addListener() {

    }
}
