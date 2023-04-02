package com.shubham.introslider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class log extends BaseActivity  {
    ImageView iv,v,vi,vii,ix,xii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        iv = (ImageView)findViewById(R.id.imagea);
        iv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(log.this, st.class);
                startActivity(myIntent);
            }
        });

        v = (ImageView)findViewById(R.id.b);
        v.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(log.this, po.class);
                startActivity(myIntent);
            }
        });
        vi = (ImageView)findViewById(R.id.c);
        vi.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(log.this, le.class);
                startActivity(myIntent);
            }
        });
        vii = (ImageView)findViewById(R.id.d);
        vii.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(log.this, ch.class);
                startActivity(myIntent);
            }
        });
        ix = (ImageView)findViewById(R.id.e);
        ix.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(log.this, gr.class);
                startActivity(myIntent);
            }
        });
        xii = (ImageView)findViewById(R.id.he);
        xii.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(log.this, mu.class);
                startActivity(myIntent);
            }
        });

        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        // Set Home selected
        bottomNavigationView.setSelectedItemId(R.id.homeId);

        // Perform item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch(item.getItemId())
                {
                    case R.id.searchId:
                        startActivity(new Intent(getApplicationContext(),search.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.homeId:
                        return true;
                    case R.id.f:
                        startActivity(new Intent(getApplicationContext(),disease.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }}