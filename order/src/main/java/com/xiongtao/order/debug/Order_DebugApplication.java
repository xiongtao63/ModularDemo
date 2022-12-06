package com.xiongtao.order.debug;

import android.app.Application;
import android.util.Log;

import com.xiongtao.library.utils.Config;


public class Order_DebugApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(Config.TAG, "order/debug/Order_DebugApplication");
    }
}