package com.shubham.introslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stc extends AppCompatActivity {
     Button ang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.green)));
        getWindow().setNavigationBarColor(ContextCompat.getColor(stc.this,R.color.green));
        getWindow().setStatusBarColor(ContextCompat.getColor(stc.this,R.color.green));
        ang = findViewById(R.id.angry_btn);
        ang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(stc.this, std.class);
                startActivity(myIntent);
            }
        });
    }
}