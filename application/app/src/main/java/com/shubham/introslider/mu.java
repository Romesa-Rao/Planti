package com.shubham.introslider;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.skyhope.showmoretextview.ShowMoreTextView;

public class mu extends AppCompatActivity {
   Button angry,an;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setNavigationBarColor(ContextCompat.getColor(mu.this,R.color.green));
        getWindow().setStatusBarColor(ContextCompat.getColor(mu.this,R.color.green));
        setContentView(R.layout.mu);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        angry = findViewById(R.id.angry_btn);
        angry.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(mu.this, muc.class);
                startActivity(myIntent);
            }
        });

        an = findViewById(R.id.angry_btnn);
        an.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(mu.this, mud.class);
                startActivity(myIntent);
            }
        });

        ShowMoreTextView textView = findViewById(R.id.teee);

        //You have to use following one of method

        // For using character length
        //number of line you want to short
        textView.setShowingLine(7);

        textView.addShowMoreText("Read more");
        textView.addShowLessText("Less");
        textView.setShowMoreColor(Color.GREEN); // or other color
        textView.setShowLessTextColor(Color.RED); // or other color
    }
}