package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

import functions.Product;
import functions.ProductAdapter;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ProductAdapter adapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        productList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));

        adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);

        prepareProductData();
    }

    private void prepareProductData() {
        // Add your products to the productList
        Product product1 = new Product("Pant", R.drawable.pant);
        productList.add(product1);

        Product product2 = new Product("Cap", R.drawable.cap);
        productList.add(product2);


        Product product3 = new Product("Shoes",R.drawable.shose );
        productList.add(product3);

        Product product4 = new Product("Clothing", R.drawable.clothing );
        productList.add(product4);

        Product product5 = new Product("Setting",R.drawable.setting);
        productList.add(product5);

        Product product6 = new Product("Flower",R.drawable.rose );
        productList.add(product6);

        Product product7 = new Product("Money",R.drawable.usd );
        productList.add(product7);

        Product product8 = new Product("School",R.drawable.school );
        productList.add(product8);

        // Add more products as needed

        adapter.notifyDataSetChanged();
    }
}
