package com.dsm2018.project;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity implements View.OnTouchListener {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_map);
        final TextView text_2=findViewById(R.id.text_2);
        final TextView text_3=findViewById(R.id.text_3);
        final TextView text_plus2=findViewById(R.id.text_plus1);
        final TextView text_plus3=findViewById(R.id.text_plus2);
        final TextView text_minus3=findViewById(R.id.text_minus_3);
        final TextView text_minus2=findViewById(R.id.text_minus_2);
        ImageView ic_1=findViewById(R.id.ic_1);
        ImageView ic_2=findViewById(R.id.ic_2);
        ImageView ic_3=findViewById(R.id.ic_3);
        ImageView ic_wc1=findViewById(R.id.ic_wc1);
        ImageView ic_wc2=findViewById(R.id.ic_wc2);
        ImageView ic_wc3=findViewById(R.id.ic_wc3);
        ImageView ic_q=findViewById(R.id.ic_q);
        ImageView ic_w=findViewById(R.id.ic_w);
        ImageView ic_e=findViewById(R.id.ic_e);
        ic_1.setOnTouchListener(this);
        ic_2.setOnTouchListener(this);
        ic_3.setOnTouchListener(this);
        ic_q.setOnTouchListener(this);
        ic_w.setOnTouchListener(this);
        ic_e.setOnTouchListener(this);
        ic_wc1.setOnTouchListener(this);
        ic_wc2.setOnTouchListener(this);
        ic_wc3.setOnTouchListener(this);
        TextView text_save=findViewById(R.id.text_save);
        text_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomDialogActivity customDialog = new CustomDialogActivity(MapActivity.this);
                customDialog.CallFunction();
            }
        });
        text_plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_plus2.setVisibility(View.INVISIBLE);
                text_2.setVisibility(View.VISIBLE);
                text_minus2.setVisibility(View.VISIBLE);
                text_plus3.setVisibility(View.VISIBLE);
            }
        });
        text_plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_3.setVisibility(View.VISIBLE);
                text_plus3.setVisibility(View.INVISIBLE);
                text_minus3.setVisibility(View.VISIBLE);
                text_minus2.setVisibility(View.INVISIBLE);
            }
        });
        text_minus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_minus3.setVisibility(View.INVISIBLE);
                text_3.setVisibility(View.INVISIBLE);
                text_minus2.setVisibility(View.VISIBLE);
                text_plus3.setVisibility(View.VISIBLE);
            }
        });
        text_minus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_minus2.setVisibility(View.INVISIBLE);
                text_2.setVisibility(View.INVISIBLE);
                text_plus3.setVisibility(View.INVISIBLE);
                text_plus2.setVisibility(View.VISIBLE);
            }
        });
    }


    float oldXvalue;
    float oldYvalue;

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int width = ((ViewGroup) v.getParent()).getWidth() - v.getWidth();
        int height = ((ViewGroup) v.getParent()).getHeight() - v.getHeight();
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            oldXvalue = event.getX();
            oldYvalue = event.getY();
            //  Log.i("Tag1", "Action Down X" + event.getX() + "," + event.getY());
            Log.i("Tag1", "Action Down rX " + event.getRawX() + "," + event.getRawY());
        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
            v.setX(event.getRawX() - oldXvalue);
            v.setY(event.getRawY() - (oldYvalue + v.getHeight()));
            //  Log.i("Tag2", "Action Down " + me.getRawX() + "," + me.getRawY());
        } else if (event.getAction() == MotionEvent.ACTION_UP) {
            if (v.getX() > width && v.getY() > height) {
                v.setX(width);
                v.setY(height);
            } else if (v.getX() < 0 && v.getY() > height) {
                v.setX(0);
                v.setY(height);
                v.setVisibility(View.INVISIBLE);
            } else if (v.getX() > width && v.getY() < 0) {
                v.setX(width);
                v.setY(0);
                v.setVisibility(View.INVISIBLE);
            } else if (v.getX() < 0 && v.getY() < 0) {
                v.setX(0);
                v.setY(0);
                v.setVisibility(View.INVISIBLE);
            } else if (v.getX() < 0 || v.getX() > width) {
                if (v.getX() < 0) {
                    v.setX(0);
                    v.setY(event.getRawY() - oldYvalue - v.getHeight());
                    v.setVisibility(View.INVISIBLE);
                } else {
                    v.setX(width);
                    v.setY(event.getRawY() - oldYvalue - v.getHeight());
                    v.setVisibility(View.INVISIBLE);
                }
            } else if (v.getY() < 0 || v.getY() > height) {
                if (v.getY() < 0) {
                    v.setX(event.getRawX() - oldXvalue);
                    v.setY(0);
                    v.setVisibility(View.INVISIBLE);
                } else {
                    v.setX(event.getRawX() - oldXvalue);
                    v.setY(height);
                    v.setVisibility(View.INVISIBLE);
                }
            }


        }
        return true;
    }
}
