package com.androidlib_trans_rnlib;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.app.Activity;


import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Configuration;

import com.rocky.moreapps.MoreAppsBuilder;
import com.rocky.moreapps.MoreAppsDialog;

import java.util.concurrent.TimeUnit;

public class CoreApp extends Application implements androidx.work.Configuration.Provider {

    public static final String JSON_FILE_URL = "https://raghavsatyadev.github.io/more_apps_example.json";

     private static CoreApp mInstance;

     private MoreAppsDialog moreAppsDialog;

     public static synchronized CoreApp getInstance() {
         return mInstance;
     }

     @Override
     public void onCreate() {
         super.onCreate();
         mInstance = this;

 //        this pattern is part of option-2
         createMoreAppDialog();
     }

     public MoreAppsDialog getMoreAppsDialog() {
         if (moreAppsDialog == null) createMoreAppDialog();
         return moreAppsDialog;
     }

     private void createMoreAppDialog() {
         moreAppsDialog = new MoreAppsBuilder(this, JSON_FILE_URL)
                 // .setPeriodicSettings(15, TimeUnit.MINUTES, R.mipmap.ic_launcher, R.drawable.ic_small_icon)
                 .build();
     }

    @NonNull
    @Override
    public Configuration getWorkManagerConfiguration() {
        System.out.println("bbb");
        return new Configuration.Builder()
                .setMinimumLoggingLevel(BuildConfig.DEBUG ? Log.DEBUG : Log.ERROR)
                .build();
    }
}