package com.example.harrisdong.waterdrop.module;

import com.example.harrisdong.waterdrop.base.BasePresenter;
import com.example.harrisdong.waterdrop.base.BaseView;
import com.example.harrisdong.waterdrop.entity.TopicBean;

public class TopicContract {
    interface View extends BaseView<Presenter> {
        void showProgressDialog();

        void dismissDialog();//这个是网络请求的时候写得一个进度条

        void setResult(TopicBean topicBean);

        void showMessage(String msg);
    }

    interface Presenter extends BasePresenter {
    }
}
