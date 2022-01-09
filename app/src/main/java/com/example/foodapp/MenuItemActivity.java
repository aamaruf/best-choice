package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.foodapp.Adapters.MenuItemAdapter;
import com.example.foodapp.Models.MenuItemModel;
import com.example.foodapp.databinding.ActivityMenuItemBinding;

import java.util.ArrayList;

public class MenuItemActivity extends AppCompatActivity {

    ActivityMenuItemBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMenuItemBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<MenuItemModel> list = new ArrayList<>();

        binding.addItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuItemActivity.this, "clicked Add New Item", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MenuItemActivity.this, RegisterItemActivity.class);
                startActivity(intent);

            }
        });

        list.add(new MenuItemModel(R.drawable.i1,"Vorta", "90", "Any single type per ball"));
        list.add(new MenuItemModel(R.drawable.i2,"Vorta", "90", "Any single type per ball"));
        list.add(new MenuItemModel(R.drawable.i3,"Vorta", "90", "Any single type per ball"));
        list.add(new MenuItemModel(R.drawable.i4,"Vorta", "90", "Any single type per ball"));
        list.add(new MenuItemModel(R.drawable.i5,"Vorta", "90", "Any single type per ball"));
        list.add(new MenuItemModel(R.drawable.i6,"Vorta", "90", "Any single type per ball"));
        list.add(new MenuItemModel(R.drawable.i7,"Vorta", "90", "Any single type per ball"));
        list.add(new MenuItemModel(R.drawable.i8,"Vorta", "90", "Any single type per ball"));

        MenuItemAdapter menuItemAdapter = new MenuItemAdapter(list, this);
        binding.menuItemRecyclerView.setAdapter(menuItemAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.menuItemRecyclerView.setLayoutManager(layoutManager);



    }
}