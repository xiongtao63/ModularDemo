package com.xiangxue.order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.xiangxue.common.RecordPathManager;

public class Order_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);
    }

    public void jumpPersonal(View view) {
        // todo 方式一 类加载
        // 类加载跳转，可以成功。维护成本较高且容易出现人为失误
//        try {
//            Class targetClass = Class.forName("com.xiangxue.modular.Person_MainActivity");
//            Intent intent = new Intent(this, targetClass);
//            intent.putExtra("name", "simon");
//            startActivity(intent);
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

        // todo 方式二 全局Map
        // Toast.makeText(this, "1", Toast.LENGTH_SHORT).show();
        Class<?> targetActivity = RecordPathManager.startTargetActivity("personal", "Personal_MainActivity");
        startActivity(new Intent(this, targetActivity));
    }
    
}
