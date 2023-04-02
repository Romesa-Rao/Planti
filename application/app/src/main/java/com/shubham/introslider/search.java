package com.shubham.introslider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class search extends AppCompatActivity {
    ImageView t;
    ConstraintLayout expandableView,expandableView1,expandableView2,expandableView3;
    Button arrowBtn,arrowBtn1,arrowBtn2,arrowBtn3;
    GridLayout cardView,cardView1,cardView2,cardView3;
    TextView phoneNumber,phoneNumber1,phoneNumber2,phoneNumber3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        //n.xml
        expandableView = findViewById(R.id.expandableView);
        arrowBtn = findViewById(R.id.arrowBtn);
        cardView = findViewById(R.id.cardView);
        arrowBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableView.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.VISIBLE);
                    arrowBtn.setBackgroundResource(R.drawable.arrow_right);
                } else {
                    TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                    expandableView.setVisibility(View.GONE);
                    arrowBtn.setBackgroundResource(R.drawable.arrow_down);
                }
            }
        });
        phoneNumber = (TextView) findViewById(R.id.phoneNumber);
        String text = "• More than 4,000 types of Aphid species exist.\n\nAphids, also known as plant lice, are small, soft-bodied, pear-shaped insects with long antennae in the front and two short tailpipes in the rear. One of the first insects to arrive in spring, aphids come in a variety of colors:-\nyellow, green, black, red and gray. Adults may or may not have wings.\n\nCertain species of aphids, such as conifer aphids and smoky-wing poplar aphids, prove more damaging than others because they feed directly on stems, twigs and branches - rather than on the underside of leaves.\n\n\nSome aphids inject toxins and transmit viral diseases from plant to plant through their saliva.\n";
        SpannableString ss = new SpannableString(text);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldSpan, 0, 48, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        phoneNumber.setText(ss);


        //o.xml
        expandableView1 = findViewById(R.id.expandableView1);
        arrowBtn1 = findViewById(R.id.arrowBtn1);
        cardView1 = findViewById(R.id.cardView1);
        arrowBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableView1.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    expandableView1.setVisibility(View.VISIBLE);
                    arrowBtn1.setBackgroundResource(R.drawable.arrow_right);
                } else {
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    expandableView1.setVisibility(View.GONE);
                    arrowBtn1.setBackgroundResource(R.drawable.arrow_down);
                }
            }
        });
        phoneNumber1 = (TextView) findViewById(R.id.phoneNumber1);
        String tex = "\n•  Measure up to 3 millimeters long.\n\n•  Slip into crop cervices and suck their sap.Sap drainage results in stunted plant growth\n\n•  Wingless females lay from 300 to 600 eggs in sacks.\n\n\nClosely related to scales, mealybugs are tiny, white insects covered in waxy threads. Yellow when they're young and white when they're older, mealybugs measure up to 3 millimeters long. These oval-shaped, wingless insects have long or short tails and are found at the base of stems and in leaf axils. They slip into crop crevices - often overlooked - and suck their sap. This sap drainage results in stunted plant growth. Mealybugs also excrete honeydew, a sticky substance that provides a substrate for dark-sooty mold and attracts ants.\n\nMale mealybugs are tiny, mouthless flies. They serve as sperm-banks, while wingless females lay from 300 to 600 eggs in sacks the size of themselves. These egg sacks are found on plant stems and leaves. Mealybugs primarily infest bedding and garden plants and foliage.";
        SpannableString s = new SpannableString(tex);
        StyleSpan boldSpa = new StyleSpan(Typeface.BOLD);
        s.setSpan(boldSpa, 0, 187, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        phoneNumber1.setText(s);


        //m.xml
        expandableView2 = findViewById(R.id.expandableView2);
        arrowBtn2 = findViewById(R.id.arrowBtn2);
        cardView2 = findViewById(R.id.cardView2);
        arrowBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableView2.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    expandableView2.setVisibility(View.VISIBLE);
                    arrowBtn2.setBackgroundResource(R.drawable.arrow_right);
                } else {
                    TransitionManager.beginDelayedTransition(cardView1, new AutoTransition());
                    expandableView2.setVisibility(View.GONE);
                    arrowBtn2.setBackgroundResource(R.drawable.arrow_down);
                }
            }
        });
        phoneNumber2 = (TextView) findViewById(R.id.phoneNumber2);
        String te = "\n•  Eggs are located on the underside of leaves.\n\n•  Impact bedding and garden plants, potted plants and cut flowers.\n\n•  Oval-shaped insects have 2 pairs of wings coated with a waxy powder.\n\n•  Cause plants to become sticky and discolored.\n\n\n Whiteflies resemble tiny, white moths. The oval-shaped insects have two pairs of wings coated with a waxy powder. After hatching, whiteflies larvae are mobile with six legs. But after a few days, they molt and develop into rounder, thinner sedentary larva that resemble scales.\n\nWhiteflies feed primarily on the underside of leaves with their piercing mouths, stunting plant growth. They also cause plants to become sticky and discolored. Whiteflies reproduce rapidly - creating vast populations. Infestations are first localized, then expanded to larger areas. Whitefly eggs, which change from yellow to gray, are located on the underside of leaves. The eggs appear cone-shaped and hatch within two days.\n\nWhiteflies plague a wide range of crops, including bedding and garden plants, potted plants and cut flowers.Most insecticides target whiteflies in the adult stage of their development.\nSince insects are never all in the same stage of growth at the same time most control programs are not effective.";
        SpannableString a = new SpannableString(te);
        StyleSpan boldSp = new StyleSpan(Typeface.BOLD);
        a.setSpan(boldSp, 0, 240, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        phoneNumber2.setText(a);


        //P.xml
        expandableView3 = findViewById(R.id.expandableView3);
        arrowBtn3 = findViewById(R.id.arrowBtn3);
        cardView3 = findViewById(R.id.cardView3);
        arrowBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (expandableView3.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandableView3.setVisibility(View.VISIBLE);
                    arrowBtn3.setBackgroundResource(R.drawable.arrow_right);
                } else {
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandableView3.setVisibility(View.GONE);
                    arrowBtn3.setBackgroundResource(R.drawable.arrow_down);
                }
            }
        });
        phoneNumber3 = (TextView) findViewById(R.id.phoneNumber3);
        String tm = "\n•  Tiny insects whose larvae cause damage by tunnelling through the inside of leaves leaving a meandering track.\n\n They spread importation of infested plants or cut flowers; pupa in soil; locally by flying\n\n A large number of species including melons, vegetables, onions, grains, cotton, ornamentals and production nurseries Leaf miners damage leaves by feeding inside them leaving squiggly trails. ";
        SpannableString b = new SpannableString(tm);
        StyleSpan boldS = new StyleSpan(Typeface.BOLD);
        b.setSpan(boldS, 0, 112, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        phoneNumber3.setText(b);


        //weather bar
        t = (ImageView)findViewById(R.id.n);
        t.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){
                Intent myIntent = new Intent(search.this,weather.class);
                startActivity(myIntent);
            }
        });

        //bottom nevigation
        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.searchId);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.searchId:

                        return true;
                    case R.id.homeId:
                        startActivity(new Intent(getApplicationContext(),log.class));
                        overridePendingTransition(0,0);
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