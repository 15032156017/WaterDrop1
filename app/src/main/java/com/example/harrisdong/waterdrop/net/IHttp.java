package com.example.harrisdong.waterdrop.net;

import com.example.harrisdong.waterdrop.net.callback.MyNetWorkCallback;

import java.util.Map;

public interface IHttp {
    <T> void get(String url, Map<String,String>parmas,MyNetWorkCallback<T> callback);
    <T>void post(String url,Map<String,String>parmas,MyNetWorkCallback<T>callback);
    void upload();
}
