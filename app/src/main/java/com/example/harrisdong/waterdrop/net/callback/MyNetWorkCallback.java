package com.example.harrisdong.waterdrop.net.callback;

public interface MyNetWorkCallback<T>  {
    void onSucess(T t);
    void onError(int errorCode,String erroeMsg);

}
