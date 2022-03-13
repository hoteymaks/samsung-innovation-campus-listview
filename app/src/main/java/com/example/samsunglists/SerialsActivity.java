package com.example.samsunglists;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class SerialsActivity extends AppCompatActivity {

    ArrayList<Item> items;
    MyItemListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_serials);
        init();
        ListView myList = findViewById(R.id.mySerialList);
        adapter = new MyItemListAdapter(this, items);
        myList.setAdapter(adapter);
    }

    public void init() {
        items = new ArrayList<>();
        items.add(new Item("The Walking Dead", "Horror, Action, Drama", "2011-2022", "8.8"));
        items.add(new Item("The Witcher: Netflix Series", "Drama, Action", "2020-2022", "7.2"));
        items.add(new Item("Breaking Bad", "Drugs, Comedy, Drama", "2016-2019", "9.4"));
        items.add(new Item("Wonder Egg Priority", "Anime, Drama", "2020", "9.5"));
        items.add(new Item("Avatar: The Last Airbender", "Anime, Action, Drama", "2011-2016", "10.0"));
    }

}