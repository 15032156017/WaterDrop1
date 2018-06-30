package com.example.harrisdong.waterdrop.base;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity {

    private View mContentView;
    /**
     * 获取加载页面的资源id
     */
    public abstract int getLayoutId();

    public abstract void initData();

    public  void remoteData(){}
    /**
     * 初始化view
     */
    public abstract void initView(Bundle savedInstanceState);

    /**
     * 初始化点击事件
     */
    public abstract void initOnClick();



    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        mContentView = view;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView(savedInstanceState);
        initData();
        remoteData();
        initOnClick();

    }


}
