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

public class cherryc extends AppCompatActivity {
    Button ang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getColor(R.color.green)));
        getWindow().setNavigationBarColor(ContextCompat.getColor(cherryc.this,R.color.green));
        getWindow().setStatusBarColor(ContextCompat.getColor(cherryc.this,R.color.green));
        setContentView(R.layout.cherryc);

        ShowMoreTextView textView = findViewById(R.id.te);

        ang = findViewById(R.id.angry_btn);
        ang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(cherryc.this, cherryd.class);
                startActivity(myIntent);
            }
        });
    }
}