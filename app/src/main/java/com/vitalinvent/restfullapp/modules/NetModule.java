package com.vitalinvent.restfullapp.modules;

import android.app.Application;

import com.google.gson.Gson;
import com.vitalinvent.restfullapp.api.Api;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetModule {

    private String server;

    public NetModule(String server) {
        this.server = server;
    }

    @Provides
    @Singleton
    Cache provideOkHttpCache(Application application) {
        int cacheSize = 10 * 1024 * 1024; // 10 MiB
        Cache cache = new Cache(application.getCacheDir(), cacheSize);
        return cache;
    }

    @Provides
    @Singleton
    OkHttpClient provideOkHttpClient(Cache cache, Application application) {
        OkHttpClient.Builder clientBuilder = new OkHttpClient().newBuilder();
        clientBuilder.readTimeout(60, TimeUnit.SECONDS);
        clientBuilder.connectTimeout(60, TimeUnit.SECONDS);
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        clientBuilder.addInterceptor(logging);
        clientBuilder.cache(cache);
        return clientBuilder.build();
    }

    @Provides
    @Singleton
    Api provideApiService(Application application, Gson gson, OkHttpClient okHttpClient) {
        return new Api(server, RxJava2CallAdapterFactory.create(),
                GsonConverterFactory.create(gson), okHttpClient);
    }

}
