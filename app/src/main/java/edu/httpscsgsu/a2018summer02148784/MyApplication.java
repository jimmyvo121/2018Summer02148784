package edu.httpscsgsu.a2018summer02148784;

import android.app.Application;

import edu.httpscsgsu.a2018summer02148784.util.UtilLog;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setLogSwitch(true);
    }
}
