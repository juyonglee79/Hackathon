package com.dsm2018.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class NightWeatherActivity extends AppCompatActivity {

    ImageView back2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_night);

        back2 = (ImageView) findViewById(R.id.ic_back2);
        back2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(NightWeatherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}