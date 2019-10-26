package com.example.ihahire.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.ihahire.R;

public class BuyActivity extends AppCompatActivity {

    private ListView Products;
    private  ListView Shops;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);


        Products=(ListView)findViewById(R.id.productslist);
        Shops=(ListView)findViewById(R.id.locationList);

    }
}
