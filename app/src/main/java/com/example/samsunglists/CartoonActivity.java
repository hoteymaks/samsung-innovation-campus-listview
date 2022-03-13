package com.example.samsunglists;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

import java.util.ArrayList;

public class CartoonActivity extends AppCompatActivity {

    ArrayList<Item> items;
    MyItemListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_cartoon);
        init();
        ListView myList = findViewById(R.id.myCartoonList);
        adapter = new MyItemListAdapter(this, items);
        myList.setAdapter(adapter);
    }

    public void init() {
        items = new ArrayList<>();
        items.add(new Item("Shrek 7", "Comedy", "2025", "10.0"));
        items.add(new Item("Encanto", "Comedy, Action", "2021", "7.8"));
        items.add(new Item("How to Train Your Dragon", "Action, Drama", "2016", "9.4"));
        items.add(new Item("Aldar Kose", "Ethnic, Comedy, Philosophy", "2012-2022", "9.5"));
        items.add(new Item("Tom and Jerry", "Comedy", "1990-2017", "10.0"));
    }

}