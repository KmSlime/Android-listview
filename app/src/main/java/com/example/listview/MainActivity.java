package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoListView(View view) {
        Intent intent = new Intent(MainActivity.this, ListView.class);
        startActivity(intent);
    }
    public void gotoListObject(View view) {
        Intent intent = new Intent(MainActivity.this, ListView.class);
        startActivity(intent);
    }
    public void gotoListAdvanced(View view) {
        Intent intent = new Intent(MainActivity.this, ListView.class);
        startActivity(intent);
    }
}