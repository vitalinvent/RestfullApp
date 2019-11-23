package com.vitalinvent.restfullapp;

import android.content.Context;

import com.vitalinvent.restfullapp.api.DaggerNetComponent;
import com.vitalinvent.restfullapp.api.NetComponent;
import com.vitalinvent.restfullapp.api.NetModule;
import com.vitalinvent.restfullapp.common.Utils;
import com.vitalinvent.restfullapp.common.Variables;
import com.vitalinvent.restfullapp.modules.AppModule;

import io.reactivex.annotations.NonNull;

public class MainApplication extends android.app.Application {

    private ComponentsHolder componentsHolder;
    private static NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        componentsHolder = new ComponentsHolder(getApplicationContext());
        componentsHolder.init();
        Variables.PACKAGE_NAME = getApplicationContext().getPackageName();
        Utils.init(this);
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://users.bugred.ru/"))
//                .watcherCurrentUser(new WatcherCurrentUser(getApplicationContext()))
                .build();
    }

    public static MainApplication getApplication(Context context) {
        return (MainApplication) context.getApplicationContext();
    }

    public ComponentsHolder getComponentsHolder() {
        return componentsHolder;
    }

    @NonNull
    public static MainApplication get(@NonNull Context context) {
        return (MainApplication) context.getApplicationContext();
    }

    public static NetComponent getNetComponent() {
        return mNetComponent;
    }

}
