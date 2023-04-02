package com.shubham.introslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grd extends AppCompatActivity {
    Button angr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grd);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.green)));
        getWindow().setNavigationBarColor(ContextCompat.getColor(grd.this,R.color.green));
        getWindow().setStatusBarColor(ContextCompat.getColor(grd.this,R.color.green));
        angr = findViewById(R.id.angry_btnn);
        angr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(grd.this, grc.class);
                startActivity(myIntent);
            }
        });

    }
}