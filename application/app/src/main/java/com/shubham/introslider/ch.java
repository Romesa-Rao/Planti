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
import android.widget.ImageView;

import com.skyhope.showmoretextview.ShowMoreTextView;

public class ch extends AppCompatActivity {
    Button angry,an;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        getWindow().setNavigationBarColor(ContextCompat.getColor(ch.this,R.color.green));
        getWindow().setStatusBarColor(ContextCompat.getColor(ch.this,R.color.green));
        setContentView(R.layout.ch);

        ShowMoreTextView textView = findViewById(R.id.teee);
        angry = findViewById(R.id.angry_btn);
        angry.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(ch.this, cherryc.class);
                startActivity(myIntent);
            }
        });

        an = findViewById(R.id.angry_btnn);
        an.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(ch.this, cherryd.class);
                startActivity(myIntent);
            }
        });

        //You have to use following one of method

        // For using character length
        textView.setShowingChar(30);
        //number of line you want to short
        textView.setShowingLine(4);

        textView.addShowMoreText("Read more");
        textView.addShowLessText("Less");
        textView.setShowMoreColor(Color.GREEN); // or other color
        textView.setShowLessTextColor(Color.RED); // or other color
    }
}