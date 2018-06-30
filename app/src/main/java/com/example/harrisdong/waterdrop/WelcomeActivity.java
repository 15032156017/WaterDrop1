package com.example.harrisdong.waterdrop;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.harrisdong.waterdrop.base.BaseActivity;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends BaseActivity {
    int a=3;
    private Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int b=msg.what;
            if (b==0){
                startActivity(new Intent(WelcomeActivity.this,MainActivity.class));
                timer.cancel();
                finish();
            }
        }
    };
    private Timer timer;

    @Override
    public int getLayoutId() {
        return R.layout.activity_welcome;
    }

    @Override
    public void initData() {

    }

    @Override
    public void initView(Bundle savedInstanceState) {

    }

    @Override
    public void initOnClick() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        timer = new Timer();
        TimerTask timerTask =new TimerTask() {
            @Override
            public void run() {
                Message message = mHandler.obtainMessage();
                message.what=a--;
                mHandler.sendMessage(message);
            }
        };
        timer.schedule(timerTask,100,100);
    }
}
