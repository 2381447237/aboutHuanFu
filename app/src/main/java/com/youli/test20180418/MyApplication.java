package com.youli.test20180418;

import android.app.Application;

import com.zhy.changeskin.SkinManager;

/**
 * Created by liutao on 2018/4/18.
 */

public class MyApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        SkinManager.getInstance().init(this);

    }
}
