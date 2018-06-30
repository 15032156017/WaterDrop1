package com.example.harrisdong.waterdrop.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.harrisdong.waterdrop.R;

import java.util.List;

public class TopicFragmentAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> list;

    public TopicFragmentAdapter(Context mContext, List<String> list) {
        this.mContext = mContext;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            LayoutInflater.from(mContext).inflate(R.layout.top_item,null);
        }
        return null;
    }
}
