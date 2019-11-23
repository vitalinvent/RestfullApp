package com.vitalinvent.restfullapp.modules;

import android.app.Application;
import android.content.Context;

import com.vitalinvent.restfullapp.models.DaoSession;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {

    Application mApplication;

    public AppModule(Application application) {
        mApplication = application;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return mApplication;
    }


}