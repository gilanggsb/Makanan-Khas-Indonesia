package com.example.dicoding_apk_sederhana;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFoods;
    private ArrayList<Food> listFoods = new ArrayList<Food>();
    ImageView profile;
    static final String FOOD_KEY = "food_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFoods = findViewById(R.id.rv_foods);
        rvFoods.setHasFixedSize(true);

        listFoods.addAll(FoodsData.getListFood());
        showRecyclerList();

    }


    private void showRecyclerList() {
        rvFoods.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(listFoods);
        rvFoods.setAdapter(listFoodAdapter);
        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food data) {
                showSelectedHero(data);
            }
        });
    }

    private void showSelectedHero(Food food) {
        Intent intent = new Intent(MainActivity.this, DetailFoodActivity.class);
        intent.putExtra(FOOD_KEY, food);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_menu, menu);
        // first parameter is the file for icon and second one is menu
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.profile:
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}