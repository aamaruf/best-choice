package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

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