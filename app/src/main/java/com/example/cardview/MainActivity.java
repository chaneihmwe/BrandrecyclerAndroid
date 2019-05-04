package com.example.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    RecyclerView mRecyclerView;
    List<BrandData> mBrandList;
    BrandData mBrandData;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerview);

//        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);
//        mRecyclerView.setLayoutManager(lm);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 2);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        mBrandList = new ArrayList<>();

        mBrandData = new BrandData("Eleven", R.drawable.eleven);
        mBrandList.add(mBrandData);

        mBrandData = new BrandData("Adidas", R.drawable.adidas);
        mBrandList.add(mBrandData);

        mBrandData = new BrandData("Apple", R.drawable.apple);
        mBrandList.add(mBrandData);

        mBrandData = new BrandData("Starbucks", R.drawable.starbucks);
        mBrandList.add(mBrandData);

        mBrandData = new BrandData("Miniso", R.drawable.miniso);
        mBrandList.add(mBrandData);

        mBrandData = new BrandData("Kit Kat", R.drawable.kitkat);
        mBrandList.add(mBrandData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, mBrandList);
        mRecyclerView.setAdapter(myAdapter);


    }
}
