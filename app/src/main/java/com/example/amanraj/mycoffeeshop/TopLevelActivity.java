package com.example.amanraj.mycoffeeshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() //to make any taxt clickable we declare OnItemClickListener
        {
            @Override
            public void onItemClick(AdapterView<?> listView, View listview, int position, long id)//give everything as parameter
            {
                if (position ==0)
                {
                    Intent intent = new Intent(TopLevelActivity.this,DrinkCategoryActivity.class);//use intent for going rto other activity
                    startActivity(intent);
                }
            }
        };
        //add the listener to the listview
        ListView listView =(ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}

