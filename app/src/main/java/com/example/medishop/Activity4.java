package com.example.medishop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
    }
    public void nxt (View view){
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }
    public void nyuma (View view){
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }
}
