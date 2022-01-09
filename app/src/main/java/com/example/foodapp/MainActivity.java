package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signin, signup;
    TextView tbskip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Transparent ActionBAr

//        getWindow().setFlags(
//                windowManager.LayoutParams.FLAG_LAYOUT_NO_LIMIT,
//                windowManager.LayoutParams.FLAG_LAYOUT_NO_LIMIT
//        );
        // hide action bar
        getSupportActionBar().hide();

        signin = findViewById(R.id.btnsignin);
        signup = findViewById(R.id.btnsignup);
        tbskip = findViewById(R.id.tbskip);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "clicked signin", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "clicked signup", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        tbskip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "clicked tbskip", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                Intent intent = new Intent(MainActivity.this, MenuItemActivity.class);
                startActivity(intent);
            }
        });
    }
}