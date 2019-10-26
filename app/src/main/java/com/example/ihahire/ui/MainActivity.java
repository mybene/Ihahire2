package com.example.ihahire.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ihahire.R;

public class MainActivity extends AppCompatActivity {

    private TextView WelcomeTextView;
    private Button Start;
    private Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WelcomeTextView = (TextView) findViewById(R.id.welcomeTextView);
        Login = (Button) findViewById(R.id.login);
        Start = (Button) findViewById(R.id.create);


        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent vasy = new Intent(MainActivity.this, SignUpActivity.class);
                Toast.makeText(MainActivity.this, "Welcome!!!", Toast.LENGTH_LONG).show();
                startActivity(vasy);

            }
        });

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Welcome!!!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });

    }
}