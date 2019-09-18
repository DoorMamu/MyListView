package com.example.mylistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ListItem> {


    public CustomAdapter(@NonNull Context context, ArrayList<ListItem> resource) {
        super(context,0,resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_list_item,parent,false);
        ListItem li=getItem(position);
        TextView title=convertView.findViewById(R.id.textView);
        title.setText(li.getTitle());

        TextView desc=convertView.findViewById(R.id.textView2);
        desc.setText(li.getDesc());

        ImageView imageView=convertView.findViewById(R.id.imageView);
        imageView.setImageResource(li.getImg_res());

        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.custom_listview_animation);

        return convertView;
    }
}
