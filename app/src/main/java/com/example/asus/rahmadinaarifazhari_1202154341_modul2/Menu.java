package com.example.asus.rahmadinaarifazhari_1202154341_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> food = new LinkedList<>(); //membuat variabel bebas untuk LinkedList
    private final LinkedList<Integer> price = new LinkedList<>();
    private final LinkedList<Integer> view = new LinkedList<>();
    //private int mCount = 0;

    private RecyclerView mRecyclerView; //membuat variabel bebas
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData(); //membuat method baru

        // menghubungkan dengan RecyclerView dengan mencari id recyclerview
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // mmebuat adapter dan mengambil data dari class MenuAdapter
        mAdapter = new MenuAdapter(this, food, price, view);
        // menghubungkan adapter dengan RecycleView
        mRecyclerView.setAdapter(mAdapter);
        // mengatur layout nya menjadi LinearLayout
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){ //isi dari dummies data
        for (int i = 0;i < 2; i++){
            food.add("싸이버거");
            food.add("통새우버거");
            food.add("불고기버거");
            food.add("강정콤보");
            food.add("불사치킨");

            price.add(44000);
            price.add(43000);
            price.add(48000);
            price.add(112000);
            price.add(110000);

            view.add(R.drawable.sai);
            view.add(R.drawable.sewu);
            view.add(R.drawable.bulgogi);
            view.add(R.drawable.chickin);
            view.add(R.drawable.combo);
        }
    }
}