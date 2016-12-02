package com.jason.baseapp;

import android.app.Application;
import android.content.Context;

/**
 * Created by jsson on 16/12/1.
 */
public class BaseApp extends Application {
    private static BaseApp INSTANCE;

    public static Context getContext() {
        return INSTANCE.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        initConfig();
    }

    private void initConfig() {
        //TODO 初始化操作
    }
}
