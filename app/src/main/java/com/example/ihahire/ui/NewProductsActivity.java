package com.example.ihahire.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ihahire.R;

public class NewProductsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_products);
    }
}
    private TextView mItemView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_items);

//        mArticles = (TextView) findViewById(R.id.articles);
        mItemView=(TextView)findViewById(R.id.itemView);

        Intent intent = getIntent();

        String name=intent.getStringExtra("name");

        mItemView.setText("The received product is " + name);
    }
}
