package com.example.dicoding_apk_sederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFoodActivity extends AppCompatActivity {
    Food food;
    ImageView imgPhoto;
    TextView tvName, tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_food);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imgPhoto = findViewById(R.id.detail_image);
        tvName = findViewById(R.id.tv_detail_name);
        tvDescription = findViewById(R.id.tv_detail_description);

        if (getIntent().hasExtra(MainActivity.FOOD_KEY)) {
            food = getIntent().getParcelableExtra(MainActivity.FOOD_KEY);
            imgPhoto.setImageResource(food.getPhoto());
            tvName.setText(food.getName());
            tvDescription.setText(food.getDetail());
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}