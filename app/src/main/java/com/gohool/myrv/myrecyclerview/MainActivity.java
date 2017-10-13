package com.gohool.myrv.myrecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
    private RecyclerView reciclerView;
    private RecyclerView.Adapter adapter;
    private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String name[]={"BD JOB","Job Circular","bd govt job circular","BD Govt Jobs","BD Job Search","Job Bangladesh","Jibika Dishari","Chakri Online","সাপ্তাহিক চাকরির সার্কুলার","Bangladesh Jobs","All BD Job","চাকরির খবর / chakrir khabar","Bangladesh Jobs","চাকরির সার্কুলার","চাকরির খবর","কিভাবে চাকরি পাবেন?","চাকুরির জন্য| Jobs Guide","All BD JOB NEWS","Jobs In BD","কাজের বাজার","BDJOBS Unofficial App","All BD JOB NEWS","Chakri - চাকরি","চাকরির প্রস্তুতি Job Solution","কিভাবে চাকরি পাবেন?","আউটসোর্সিং online income tips","চাকরির পত্রিকা - Job+Newspaper","isoft jobs","চাকরির খবর / chakrir khabar","JobsPack – Bangladesh","Job Bangladesh","সরকারি চাকরির সার্কুলার Govt Jobs","চাকরীর খবর","BD Job(s) Sites","Jora Job Search","BD Jobs2Study","Top BD Jobs Circular"};

        reciclerView = (RecyclerView) findViewById(R.id.reciclerView);
        reciclerView.setHasFixedSize(true);
        //every item has a fixed size
        reciclerView.setLayoutManager(new
                LinearLayoutManager(this));

        listItems = new ArrayList<>();

        for (int i = 0; i<name.length; i++) {
            ListItem listItem = new ListItem(
                    "" + name[i],
                    ""
            );
            listItems.add(listItem);
        }

        adapter = new MyAdapter(this, listItems);

        reciclerView.setAdapter(adapter);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuflatter=getMenuInflater();
        menuflatter.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int res_id=item.getItemId();
        if(res_id==R.id.setting){

            Intent inte= new Intent(MainActivity.this,About.class);
            startActivity(inte);
        }
        return true;
    }
}
