package com.xiongtao.modulargradledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.xiongtao.modulargradledemo.config.NetConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = NetConfig.SERVER_URL_DEBUG;
        url = NetConfig.SERVER_URL_RELASE;

        url = BuildConfig.SERVER_URL;

    }
}