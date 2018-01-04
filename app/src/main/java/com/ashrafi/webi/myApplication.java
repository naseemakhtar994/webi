package com.ashrafi.webi;

import android.app.Application;

import com.ashrafi.webi.classes.WebiConfig;

/**
 * Created by AlirezaAshrafi on 1/3/2018.
 */

public class myApplication extends Application {
    @Override
    public void onCreate() {
        WebiConfig.init()
                .setDefaultConnectTimeOut(15000)
                .setDefaultReadTimeOut(15000);



        super.onCreate();

    }
}
