package com.webdroid.school;

import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.androidnetworking.AndroidNetworking;




public class Slrtce extends MultiDexApplication {

    private static Slrtce istance;

    @Override
    public void onCreate() {
        super.onCreate();
        istance = this;
        AndroidNetworking.initialize(this);
        MultiDex.install(this);
    }

    /**
     * Instance of this class
     * @return
     */
    public static Slrtce getIstance() {
        return istance;
    }

}

