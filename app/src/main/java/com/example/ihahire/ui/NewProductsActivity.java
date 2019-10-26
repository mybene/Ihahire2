package com.example.ihahire.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ihahire.R;

public class NewProductsActivity extends AppCompatActivity {

    private TextView Article;
    private TextView Detail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_products);

        Detail=(TextView)findViewById(R.id.detail);

        Intent intent=getIntent();

        String name=intent.getStringExtra("name");
        String shop=intent.getStringExtra("shop");
        String phone=intent.getStringExtra("contact");

        Detail.setText("The product's name : "+name +" is available at "+ shop + " with contact "+phone );
    }
}