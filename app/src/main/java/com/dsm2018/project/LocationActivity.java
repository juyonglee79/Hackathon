package com.dsm2018.project;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class LocationActivity extends AppCompatActivity {

    ImageView image2;
    ImageView back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        image2 = (ImageView) findViewById(R.id.ic_boat);

        Drawable alpha1 = image2.getBackground();
        alpha1.setAlpha(50);

        back2 = (ImageView) findViewById(R.id.ic_back2);
        back2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(LocationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}