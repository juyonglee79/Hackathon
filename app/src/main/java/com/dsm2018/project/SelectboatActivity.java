package com.dsm2018.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SelectboatActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectboat);

        finish = (TextView)findViewById(R.id.finish);
        textView1 = (TextView) findViewById(R.id.name);
        textView2 = (TextView) findViewById(R.id.id2);
        textView3 = (TextView) findViewById(R.id.password2);
        textView4 = (TextView) findViewById(R.id.password2_confirm);
        textView5 = (TextView) findViewById(R.id.wow);

        finish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (textView1.getText().toString().equals("")) {
                    Toast.makeText(SelectboatActivity.this, "입력을 완료해주세요.", Toast.LENGTH_SHORT).show();
                } else if (textView2.getText().toString().equals("")) {
                    Toast.makeText(SelectboatActivity.this, "입력을 완료해주세요..", Toast.LENGTH_SHORT).show();
                } else if (textView3.getText().toString().equals("")) {
                    Toast.makeText(SelectboatActivity.this, "입력을 완료해주세요.", Toast.LENGTH_SHORT).show();
                } else if (textView4.getText().toString().equals("")) {
                    Toast.makeText(SelectboatActivity.this, "입력을 완료해주세요.", Toast.LENGTH_SHORT).show();
                } else if (textView5.getText().toString().equals("")) {
                    Toast.makeText(SelectboatActivity.this, "입력을 완료해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(SelectboatActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}