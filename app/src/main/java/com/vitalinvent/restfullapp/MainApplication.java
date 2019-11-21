package com.vitalinvent.restfullapp;

import android.content.Context;

import com.vitalinvent.restfullapp.common.Utils;
import com.vitalinvent.restfullapp.common.Variables;

public class MainApplication extends android.app.Application {

    private ComponentsHolder componentsHolder;

    @Override
    public void onCreate() {
        super.onCreate();
        componentsHolder = new ComponentsHolder(getApplicationContext());
        componentsHolder.init();
        Variables.PACKAGE_NAME = getApplicationContext().getPackageName();
        Utils.init(this);
    }

    public static MainApplication getApplication(Context context){
        return (MainApplication) context.getApplicationContext();
    }

    public ComponentsHolder getComponentsHolder(){
        return componentsHolder;
    }
}
