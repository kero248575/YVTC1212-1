package com.example.auser.yvtc1212_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by auser on 2017/12/12.
 */

//public class MyAdapter extends BaseAdapter {
//    Context context;
//    ZooInfo[] zooInfo;
//
//    }
//    public MyAdapter(Context context, ZooInfo[] zooInfo)
//    {
//        this.context = context;
//        this.zooInfo = zooInfo;
//    }
//    @Override
//    public int getCount() {
//        return zooInfo.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return null;
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View v = inflater.inflate(R.layout.item_layout, null);
//        TextView tv = (TextView) v.findViewById(R.id.textView);
//        tv.setText(zooInfo[position].E_Name);
//
//        ImageView img = (ImageView) v.findViewById(R.id.imageView2);
//        Picasso.with(context).load(zooInfo[position].E_Pic_URL).into(img);
//        return v;
//    }
//}