package com.example.medishop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
    }

    public void has(View view){
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }
    public void tintaka(View view){
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
}
}
