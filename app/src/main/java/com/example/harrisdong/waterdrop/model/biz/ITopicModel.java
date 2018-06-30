package com.example.harrisdong.waterdrop.model.biz;

import com.example.harrisdong.waterdrop.entity.TopicBean;
import com.example.harrisdong.waterdrop.model.BaseModel;
import com.example.harrisdong.waterdrop.net.callback.MyNetWorkCallback;

public interface ITopicModel extends BaseModel {
    void getTopic(MyNetWorkCallback<TopicBean> callback);
}
