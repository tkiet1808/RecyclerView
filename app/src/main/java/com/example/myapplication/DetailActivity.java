package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import functions.Product;

public class DetailActivity extends AppCompatActivity {
    private TextView textViewName;
    private ImageView imageView;
    private Product product;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textViewName = findViewById(R.id.text_view_name);
        imageView = findViewById(R.id.image_view);

        Product product = (Product) getIntent().getSerializableExtra("product");

        imageView.setImageResource(product.getImage());
        textViewName.setText(product.getName());
    }


}