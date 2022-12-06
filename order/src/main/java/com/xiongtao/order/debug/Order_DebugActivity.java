package com.xiongtao.order.debug;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import com.xiongtao.library.utils.Config;
import com.xiongtao.order.Order_MainActivity;
import com.xiongtao.order.R;

public class Order_DebugActivity extends Order_DebugBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_debug);

        Log.e(Config.TAG, "order/debug/Order_DebugActivity");
    }

    public void jump(View view) {
        startActivity(new Intent(this, Order_MainActivity.class));
    }
}