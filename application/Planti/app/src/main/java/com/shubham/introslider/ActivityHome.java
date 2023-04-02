package com.shubham.introslider;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class ActivityHome extends BaseActivity  {
    Button changeMyLanguage,log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        loadLocale();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        log= (Button) findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityHome.this,log.class);
                startActivity(i);
            }
        });
        changeMyLanguage =(Button)findViewById(R.id.changeMyLanguage);
        changeMyLanguage.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                showChangeLanguageDialog();
            }
        });

    }
    private void showChangeLanguageDialog(){
        final String[] listItems={" English","اردو"};
        AlertDialog.Builder mBuilder= new AlertDialog.Builder(ActivityHome.this);
        mBuilder.setTitle("Choose Language...");
        mBuilder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (i==0) {
                    setLocale("eng");
                    recreate();
                }
                else if (i==1) {
                    setLocale("ur");
                    recreate();
                }
                dialogInterface.dismiss();
            }
        });
        AlertDialog mDialog =mBuilder.create();
        mDialog.show();
    }
    private void setLocale(String lang) {
        Locale locale =new Locale(lang);
        Locale.setDefault(locale);
        Configuration config =new Configuration();
        config.locale =locale;
        getBaseContext().getResources().updateConfiguration(config,getBaseContext().getResources().getDisplayMetrics());
        SharedPreferences.Editor editor =getSharedPreferences("Settings",MODE_PRIVATE).edit();
        editor.putString("My_Lang",lang);
        editor.apply();
    }
    public void loadLocale(){
        SharedPreferences prefs =getSharedPreferences("Settings", Activity.MODE_PRIVATE);
        String language =prefs.getString("My_Lang","");
        setLocale(language);
    }


}

