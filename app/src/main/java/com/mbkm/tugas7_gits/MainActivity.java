package com.mbkm.tugas7_gits;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recylerViewLayoutManager;

    String[] nama = {"Alpha","Beta","Charlie","Delta","Echo","Frenta","Garuda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recylerViewLayoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter = new AdapterRecyclerView(MainActivity.this, nama);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}