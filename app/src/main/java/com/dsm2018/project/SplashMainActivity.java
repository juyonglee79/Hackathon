package com.dsm2018.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashMainActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        // 스플래시 화면 띄우기
        startActivity(new Intent(this, SplashActivity.class));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        initialize();  // 시간이 걸리는 작업 처리
    }
    private void initialize() {
        InitializationRunnable init = new InitializationRunnable();
        new Thread(init).start();
    }
    class InitializationRunnable implements Runnable {
        public void run() {
            // 여기서부터 초기화 작업 처리
            // do_something
        }
    }
}