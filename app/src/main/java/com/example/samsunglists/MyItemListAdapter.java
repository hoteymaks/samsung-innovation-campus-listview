package com.example.samsunglists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyItemListAdapter extends ArrayAdapter<Item> {
    Context context;
    ArrayList<Item> people;
    public MyItemListAdapter(Context context, ArrayList<Item> people) {
        super(context, R.layout.item_video, people);
        this.context = context;
        this.people = people;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Item p = this.people.get(position);
        LayoutInflater inflater = LayoutInflater.from(this.context);
        View v = inflater.inflate(R.layout.item_video, null, false);
        TextView videoName = v.findViewById(R.id.videoName);
        TextView videoGenre = v.findViewById(R.id.videoGenre);
        TextView videoYear = v.findViewById(R.id.videoYear);
        TextView videoRating = v.findViewById(R.id.videoRating);
        videoName.setText(p.getName());
        videoGenre.setText(p.getGenre());
        videoRating.setText(p.getRating());
        videoYear.setText(p.getYear());
        return v;
    }
}
