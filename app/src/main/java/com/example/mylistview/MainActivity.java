package com.example.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
String[] my_list ={"Pie","Oreo","Nougat","Marshmallow"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<ListItem> items=new ArrayList<>();
        items.add(new ListItem(my_list[0],"Latest Ver of pie",R.drawable.pie));
        items.add(new ListItem(my_list[1],"Latest Ver of oreo",R.drawable.oreao));
        items.add(new ListItem(my_list[2],"Latest Ver of nougat",R.drawable.nougat2));
        items.add(new ListItem(my_list[3],"Latest Ver of marshmellow",R.drawable.marshmello));

        CustomAdapter customAdapter=new CustomAdapter(MainActivity.this,items);
        ListView listView=findViewById(R.id.list_views);
        listView.setDivider(null);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                final Dialog dialog=new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.custom_alert);
                TextView text=dialog.findViewById(R.id.alert_text_view);
                Button hide=dialog.findViewById(R.id.hide_btn);
                text.setText(my_list[position]);
                dialog.show();
                hide.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
            }
        });
    }
}
