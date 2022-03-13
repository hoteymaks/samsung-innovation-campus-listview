package com.example.samsunglists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MoviesActivity extends AppCompatActivity {

    ArrayList<Item> items;
    MyItemListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_movies);
        init();
        ListView myList = findViewById(R.id.myMoviesList);
        adapter = new MyItemListAdapter(this, items);
        myList.setAdapter(adapter);
    }

    public void init() {
        items = new ArrayList<>();
        items.add(new Item("Terminator", "Sci-Fi, Action", "1990", "9.8"));
        items.add(new Item("Rambo", "Drama, Action", "1988", "9.2"));
        items.add(new Item("Kung-Fu Master", "Action", "1988", "9.4"));
        items.add(new Item("1917: Documentary", "documentary film", "1975", "6.5"));
        items.add(new Item("Ooga-Booga-Hooga-Mooga", "Ancient, Rare", "310000 years B. C.", "10.0"));
    }
}