package com.example.ihahire.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ihahire.R;
import com.example.ihahire.adapters.BuyArrayAdapter;

public class BuyActivity extends AppCompatActivity {

    private ListView Products;
    private  ListView Shops;

    private String[] products = new String[]{"Protex", "CarrotLigth", "Whol-WHeat Bread", "White chocolate", "Printer HP", "Baby Daiper", "Protex",
            "CarrotLigth","Whol-WHeat Bread", "White chocolate", "Printer HP", "Baby Daiper"};

    private String[] shops = new String[]{"Frulep", "Simba Supermarket", "La Galette", "KIME Supermarket", "German Butchery", "Meru", "Frulep", "Simba Supermarket", "La Galette",
            "KIME Supermarket", "German Butchery", "Meru"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);


        Products=(ListView)findViewById(R.id.productslist);


        ArrayAdapter adapter= new BuyArrayAdapter(this, android.R.layout.simple_list_item_1, products);
        Products.setAdapter(adapter);

        Products.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               String shops=((TextView)view).getText().toString();


            }
        });

        Intent intent=getIntent();
        String product=intent.getStringExtra("product");


    }
}
