package com.example.harrisdong.waterdrop.net;

public class HttpFactroy {
    //这个是单独把OKhttp的单利模式抽取出来
    public static IHttp create() {
        return OkHttpUtils.getInstance();
    }
}
