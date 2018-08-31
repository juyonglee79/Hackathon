package com.dsm2018.project;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MakingIDActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    EditText input3;
    EditText input4;
    EditText input5;
    EditText input6;
    EditText input7;
    Button check;
    TextView make_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_making_id);

        input1 = (EditText) findViewById(R.id.name);
        input2 = (EditText) findViewById(R.id.id2);
        input3 = (EditText) findViewById(R.id.password2);
        input4 = (EditText) findViewById(R.id.password2_confirm);
        input5 = (EditText) findViewById(R.id.age);
        input6 = (EditText) findViewById(R.id.gender);
        input7 = (EditText) findViewById(R.id.email);

        check = (Button) findViewById(R.id.finish);

        check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (input1.getText().toString().equals("")) {
                    Toast.makeText(MakingIDActivity.this, "입력값을 확인해주세요.", Toast.LENGTH_SHORT).show();
                } else if (input2.getText().toString().equals("")) {
                    Toast.makeText(MakingIDActivity.this, "입력값을 확인해주세요.", Toast.LENGTH_SHORT).show();
                } else if (6 > input2.length() || input2.length() > 12) {
                    Toast.makeText(MakingIDActivity.this, "아이디 형식을 지켜주세요.", Toast.LENGTH_SHORT).show();
                } else if (input3.getText().toString().equals("")) {
                    Toast.makeText(MakingIDActivity.this, "입력값을 확인해주세요.", Toast.LENGTH_SHORT).show();
                } else if (8 > input3.length() || input3.length() > 20) {
                    Toast.makeText(MakingIDActivity.this, "비밀번호 형식을 지켜주세요.", Toast.LENGTH_SHORT).show();
                } else if (input4.equals(input3)) {
                    Toast.makeText(MakingIDActivity.this, "비밀번호가 다릅니다.", Toast.LENGTH_SHORT).show();
                } else if (input5.getText().toString().equals("")) {
                    Toast.makeText(MakingIDActivity.this, "입력값을 확인해주세요.", Toast.LENGTH_SHORT).show();
                } else if (input6.getText().toString().equals("")) {
                    Toast.makeText(MakingIDActivity.this, "입력값을 확인해주세요.", Toast.LENGTH_SHORT).show();
                } else if (input7.getText().toString().equals("")) {
                    Toast.makeText(MakingIDActivity.this, "입력값을 확인해주세요.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(MakingIDActivity.this, LoginActivity.class);
                    startActivity(intent);
                }

            }
        });
        }

}


