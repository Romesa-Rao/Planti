 package com.shubham.introslider;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.skyhope.showmoretextview.ShowMoreTextView;

public class cherryd extends AppCompatActivity {
    Button angr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.green)));
        getWindow().setNavigationBarColor(ContextCompat.getColor(cherryd.this,R.color.green));
        getWindow().setStatusBarColor(ContextCompat.getColor(cherryd.this,R.color.green));
        setContentView(R.layout.cherryd);

        ShowMoreTextView textView = findViewById(R.id.tee);
        angr = findViewById(R.id.angry_btnn);
        angr.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(cherryd.this, cherryc.class);
                startActivity(myIntent);
            }
        });

    }
}