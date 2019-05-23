package com.example.himwalk;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RatingBar;

import android.widget.Toast;
/**
 * Created by Anuj Sharma on 24/05/19.
 */
public class feedback extends Activity {

    private RatingBar ratingBar;
    Animation uptodown,downtoup;
    LinearLayout feedll;
    private Button btnSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        addListenerOnRatingBar();
        addListenerOnButton();
        feedll=(LinearLayout)findViewById(R.id.feedll);
        uptodown = AnimationUtils.loadAnimation(this,R.anim.uptodown);
        downtoup = AnimationUtils.loadAnimation(this,R.anim.downtoup);
        feedll.setAnimation(downtoup);
        feedll.getBackground().setAlpha(151);
    }

    public void addListenerOnRatingBar() {

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

    }

    public void addListenerOnButton() {

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(feedback.this,
                        String.valueOf(ratingBar.getRating()),
                        Toast.LENGTH_SHORT).show();
                Toast.makeText(feedback.this, "Thanks for Rating Us", Toast.LENGTH_LONG).show();
                finish();

            }

        });

    }
}