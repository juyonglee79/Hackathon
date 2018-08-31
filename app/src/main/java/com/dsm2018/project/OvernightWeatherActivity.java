package com.dsm2018.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class OvernightWeatherActivity extends AppCompatActivity {

    ImageView back1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_overnight);

        back1 = (ImageView) findViewById(R.id.ic_back1);
        back1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(OvernightWeatherActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
