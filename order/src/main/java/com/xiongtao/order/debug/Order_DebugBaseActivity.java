package com.xiongtao.order.debug;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.xiongtao.library.utils.Config;

import javax.annotation.Nullable;

public class Order_DebugBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(Config.TAG, "order/debug/Order_DebugBaseActivity");
    }
}