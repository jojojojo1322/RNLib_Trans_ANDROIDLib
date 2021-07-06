package com.androidlib_trans_rnlib;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.app.Activity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.rocky.moreapps.MoreAppsBuilder;
import com.rocky.moreapps.listener.MoreAppsDialogListener;
import com.rocky.moreapps.model.MoreAppsDetails;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import androidx.work.Configuration;

public class MoreAppsExample extends ReactContextBaseJavaModule {
    // Activity activity = getCurrentActivity();
    // MoreAppsBuilder MA = MoreAppsBuilder
    public MoreAppsExample(ReactApplicationContext reactContext) {
        
        super(reactContext);
    }

    @Override 
    public void initialize () { 
        super.initialize ();
    }

    @Override
    public String getName() {
        return "MoreAppsExample";
    }

    @ReactMethod
    public void toggle() {
        // CoreApp.getWorkManagerConfiguration();
        System.out.println("aaa");
        Activity activity = getCurrentActivity();
        ReactApplicationContext reactContext = getReactApplicationContext();
		//PUT YOUR NATIVE CODE HERE
        System.out.println("aaa >>>> 1");
        // new MoreAppsBuilder(activity, CoreApp.JSON_FILE_URL)
        //     .removeApplicationFromList("com.appdroidtechnologies.whatscut") // to remove an application from the list, give package name here
        //     .removeApplicationFromList(Collections.singletonList("com.appdroidtechnologies.whatscut")) // to remove applications from the list, give package names here
        //     .buildAndShow(new MoreAppsDialogListener() {
        //     @Override
        //     public void onClose() {
        //         // on dialog close
        //         System.out.println("aaa >>>> 2");
        //     }

        //     @Override
        //     public void onAppClicked(MoreAppsDetails appsModel) {
        //         System.out.println("aaa >>>> 3");

        //     }
        // });

        CoreApp.getInstance().getMoreAppsDialog().show(activity
                ,
                new MoreAppsDialogListener() {
                    @Override
                    public void onClose() {

                    }

                    @Override
                    public void onAppClicked(MoreAppsDetails appsModel) {

                    }
                });
    }
    // @NonNull
    // @Override
    // public Configuration getWorkManagerConfiguration() {
    //     return new Configuration.Builder()
    //             .setMinimumLoggingLevel(BuildConfig.DEBUG ? Log.DEBUG : Log.ERROR)
    //             .build();
    // }

}