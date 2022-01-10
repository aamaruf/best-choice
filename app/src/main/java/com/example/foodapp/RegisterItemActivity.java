package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterItemActivity extends AppCompatActivity {
    TextView returnMenuItem;
    Button addItemBtn;
    EditText addItemName;
    EditText addItemPrice;
    EditText addItemDescription;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_item);


        returnMenuItem = findViewById(R.id.returnMenuItem);
        addItemBtn = findViewById(R.id.signinBtn);
        addItemName = findViewById(R.id.addItemName);
        addItemPrice = findViewById(R.id.addItemPrice);
        addItemDescription = findViewById(R.id.signInEmail);



        addItemBtn.setOnClickListener(view -> {
                Toast.makeText(RegisterItemActivity.this, "clicked save", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(RegisterItemActivity.this, MenuItemActivity.class);
            startActivity(intent);
        });

        returnMenuItem.setOnClickListener(view -> {
                Toast.makeText(RegisterItemActivity.this, "clicked Go back", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(RegisterItemActivity.this, MenuItemActivity.class);
            startActivity(intent);
        });
    }
}