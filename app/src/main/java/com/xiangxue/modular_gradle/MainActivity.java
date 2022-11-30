package com.xiangxue.modular_gradle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xiangxue.modular_gradle.config.NetConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = NetConfig.SERVER_URL_DEBUG;
        url = NetConfig.SERVER_URL_RELASE;

        // 优雅
        url = BuildConfig.SERVER_URL;
    }
}
