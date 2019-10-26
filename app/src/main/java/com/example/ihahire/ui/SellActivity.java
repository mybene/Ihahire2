package com.example.ihahire.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ihahire.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SellActivity extends AppCompatActivity {



    @BindView(R.id.selling) Button mSelling;
    @BindView(R.id.name) EditText Product;
    @BindView(R.id.place)EditText Shop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);

        ButterKnife.bind(this);


        mSelling.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View mSelling) {

                String article = Product.getText().toString();
                String place = Shop.getText().toString();

                Toast.makeText(SellActivity.this, "Your product is received!!!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SellActivity.this, NewProductsActivity.class);
                intent.putExtra("name", article);
                intent.putExtra("shop", place);
                startActivity(intent);


            }
        });

    }

}
