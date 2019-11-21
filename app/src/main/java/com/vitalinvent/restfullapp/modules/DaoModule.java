package com.vitalinvent.restfullapp.modules;

import android.content.Context;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DaoModule {

    @Provides
    @Singleton
    DaoSession provideDaoSession(Context context){
        return new DaoMaster(new DaoMaster.DevOpenHelper(context,"orders.db").getWritableDb()).newSession();
    }
}

