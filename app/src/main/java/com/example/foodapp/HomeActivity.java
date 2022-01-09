package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnadditem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnadditem = findViewById(R.id.btnadditem);

        btnadditem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                additemDialogue();
            }
        });

    }

    public void additemDialogue(){
        AddNewItemDialogue addNewItemDialogue = new AddNewItemDialogue();
        addNewItemDialogue.show(getSupportFragmentManager(),"new item add");
    }
}