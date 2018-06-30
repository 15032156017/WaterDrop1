package com.example.harrisdong.waterdrop.model;

import com.example.harrisdong.waterdrop.net.HttpFactroy;
import com.example.harrisdong.waterdrop.net.IHttp;

public interface BaseModel  {
    public  static IHttp iHttp= HttpFactroy.create();
}
