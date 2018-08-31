package com.dsm2018.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {

    EditText input1;
    EditText input2;
    Button check;
    TextView make_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        input1 = (EditText) findViewById(R.id.id1);
        input2 = (EditText) findViewById(R.id.password1);
        check = (Button) findViewById(R.id.button1);
        make_id =(TextView) findViewById(R.id.make_id);


        make_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MakingIDActivity.class);
                startActivity(intent);
            }
        });
        check.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if (input1.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this, "아이디 또는 비밀번호가 입력되지 않았습니다.", Toast.LENGTH_SHORT).show();
                } else if (input2.getText().toString().equals("")) {
                    Toast.makeText(LoginActivity.this, "아이디 또는 비밀번호가 입력되지 않았습니다.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }

        });

    }
}