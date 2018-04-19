package com.youli.test20180418;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zhy.changeskin.SkinManager;

/**
 * Created by liutao on 2018/4/18.
 */

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SkinManager.getInstance().register(this);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        SkinManager.getInstance().unregister(this);
    }
}
