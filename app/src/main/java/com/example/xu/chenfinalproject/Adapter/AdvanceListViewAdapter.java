package com.example.xu.chenfinalproject.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.example.xu.chenfinalproject.R;
import com.example.xu.chenfinalproject.util.UtilDensity;

import java.util.ArrayList;

/**
 * Created by xu on 6/14/17.
 */

public class AdvanceListViewAdapter extends BaseAdapter {

    private final Context context;
    private final LayoutInflater inflater;
    private ArrayList<String> list;

    public AdvanceListViewAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.d("ViewHolder","getView");
        ViewHolder viewHolder;
        if(convertView == null){
            Log.d("ViewHolder","getViewById");
            convertView = inflater.inflate(R.layout.fragment_ramen4_list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.rl_odd = (RelativeLayout) convertView.findViewById(R.id.odd);
            viewHolder.tv = (TextView)convertView.findViewById(R.id.activity_advance_list_item_tv);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tv.setText(list.get(position));
        viewHolder.lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.MATCH_PARENT);


            //message from your friend
            viewHolder.rl_odd.setVisibility(View.VISIBLE);
            viewHolder.tv.setBackgroundResource(R.drawable.chatfrom_bg_focused);
            viewHolder.lp.setMargins(UtilDensity.dip2px(context,70),10,10,10);
            viewHolder.lp.addRule(RelativeLayout.ALIGN_LEFT);
            viewHolder.tv.setLayoutParams(viewHolder.lp);
            viewHolder.tv.setTextColor(Color.parseColor("#000000"));



        return convertView;
    }
    private class ViewHolder{
        RelativeLayout rl_odd;
        TextView tv;
        RelativeLayout.LayoutParams lp;
    }
}
