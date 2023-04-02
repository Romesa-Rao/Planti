package com.shubham.introslider;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.skyhope.showmoretextview.ShowMoreTextView;

public class le extends AppCompatActivity {
   Button an,angry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(le.this,R.color.green));
        getWindow().setStatusBarColor(ContextCompat.getColor(le.this,R.color.green));
        setContentView(R.layout.le);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        angry = findViewById(R.id.angry_btn);
        angry.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(le.this, lec.class);
                startActivity(myIntent);
            }
        });

        an = findViewById(R.id.angry_btnn);
        an.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(le.this, led.class);
                startActivity(myIntent);
            }
        });
        ShowMoreTextView textView = findViewById(R.id.tw);

        //You have to use following one of method

        // For using character length
        //number of line you want to short
        textView.setShowingLine(8);

        textView.addShowMoreText("Read more");
        textView.addShowLessText("Less");
        textView.setShowMoreColor(Color.GREEN); // or other color
        textView.setShowLessTextColor(Color.RED); // or other color
    }
}