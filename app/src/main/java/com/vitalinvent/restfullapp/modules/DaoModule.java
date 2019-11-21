package com.vitalinvent.restfullapp.modules;

import android.content.Context;


import com.vitalinvent.restfullapp.models.DaoMaster;
import com.vitalinvent.restfullapp.models.DaoSession;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class DaoModule {

    @Provides
    @Singleton
    DaoSession provideDaoSession(Context context){
        return new DaoMaster(new DaoMaster.DevOpenHelper(context,"users.db").getWritableDb()).newSession();
    }
}

