package com.example.fooddelivery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.fooddelivery.fragment.HomeFragment;
import com.example.fooddelivery.fragment.ListRestaurantFragment;
import com.example.fooddelivery.fragment.SettingFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation extends AppCompatActivity {
    private ActionBar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setItemIconTintList(null);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        // set fragment home đầu tiên
        if (savedInstanceState == null) {
            HomeFragment gt  = new HomeFragment();
            FragmentManager mn = getSupportFragmentManager();
            mn.beginTransaction()
                    .add(R.id.frame_layout, gt)
                    .commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.action_one:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new HomeFragment()).commit();
                    return true;
                case R.id.action_two:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new ListRestaurantFragment()).commit();
                    return true;
                case R.id.action_three:
                    return true;
                case R.id.action_giohang:
                    return true;
                case R.id.action_bon:
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new SettingFragment()).commit();
                    return true;
            }
            return false;
        }
    };
    }