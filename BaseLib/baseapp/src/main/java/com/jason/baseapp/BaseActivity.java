package com.jason.baseapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * 基础的Activity, 可以继承
 * Created by jason on 16/12/1.
 */
public class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_base);
        initBaseView();
    }

    private void initBaseView() {
        //TODO 初始化一些基础视图
    }
}
