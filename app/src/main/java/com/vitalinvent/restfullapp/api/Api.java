package com.vitalinvent.restfullapp.api;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    private RxJava2CallAdapterFactory rxJava2CallAdapterFactory;
    private GsonConverterFactory gsonConverterFactory;
    private OkHttpClient okHttpClient;
    private DaDataApi2 apiService;

    public Api(String baseUrl, RxJava2CallAdapterFactory rxJava2CallAdapterFactory, GsonConverterFactory gsonConverterFactory, OkHttpClient okHttpClient) {
        this.rxJava2CallAdapterFactory = rxJava2CallAdapterFactory;
        this.gsonConverterFactory = gsonConverterFactory;
        this.okHttpClient = okHttpClient;
        this.apiService = getService(baseUrl);

    }

    public DaDataApi2 getApiService() {
        return apiService;
    }

    public DaDataApi2 getService(String server) {
        return new Retrofit.Builder()
                .baseUrl("http://users.bugred.ru/")
                .addCallAdapterFactory(rxJava2CallAdapterFactory)
                .addConverterFactory(gsonConverterFactory)
                .client(okHttpClient)
                .build()
                .create(DaDataApi2.class);
    }
}
