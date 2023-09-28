package com.example.kiingstore898_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class IntroActivity extends AppCompatActivity {
private RecyclerView.Adapter adapter;
private RecyclerView recyclerViewCategoryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        recyclerViewCategory();
    }

    private void recyclerViewCategory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList=findViewById(R.id.recyclerView2);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> category=new ArrayList<>();
        category.add(new CategoryDomain("Jordan 1","cat_1"));
        category.add(new CategoryDomain("Jordan 3","cat_2"));
        category.add(new CategoryDomain("Jordan 4","cat_3"));
        category.add(new CategoryDomain("Jordan 5","cat_4"));
        category.add(new CategoryDomain("Jordan 6","cat_5"));
        category.add(new CategoryDomain("Jordan 7","cat_6"));
        category.add(new CategoryDomain("Jordan 11","cat_7"));

        adapter = new CategoryAdaptor(category);
        recyclerViewCategoryList.setAdapter(adapter);
        //jaja//
    }
}