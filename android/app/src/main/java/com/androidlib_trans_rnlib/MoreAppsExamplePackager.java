//PUT YOUR PACKAGE HERE, IT'S THE SAME AS IN MainApplication.java
package com.androidlib_trans_rnlib;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


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

import java.util.concurrent.TimeUnit;

//CHANGE MoreAppsExample WITH THE NAME OF YOUR CHOICE
public class MoreAppsExamplePackager implements ReactPackage {

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new MoreAppsExample(reactContext));

        return modules;
    }

}