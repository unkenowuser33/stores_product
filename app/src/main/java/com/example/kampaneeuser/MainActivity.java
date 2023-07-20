package com.example.kampaneeuser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.kampaneeuser.ui.launcher.LauncherActivity;
import com.example.kampaneeuser.ui.search.Stores_ProductsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, Stores_ProductsActivity.class));
    }
}

