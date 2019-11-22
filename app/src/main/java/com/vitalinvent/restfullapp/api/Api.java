package com.vitalinvent.restfullapp.api;


import com.vitalinvent.restfullapp.MainApplication;
import com.vitalinvent.restfullapp.models.ResultUsers;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;


public class Api {

    private RxJava2CallAdapterFactory rxJava2CallAdapterFactory;
    private GsonConverterFactory gsonConverterFactory;
    private OkHttpClient okHttpClient;
    private UsersBugregApi usersBugregApi;

    public Api(String baseUrl, RxJava2CallAdapterFactory rxJava2CallAdapterFactory, GsonConverterFactory gsonConverterFactory, OkHttpClient okHttpClient) {
        this.rxJava2CallAdapterFactory = rxJava2CallAdapterFactory;
        this.gsonConverterFactory = gsonConverterFactory;
        this.okHttpClient = okHttpClient;
        this.usersBugregApi = getService(baseUrl);

    }

    public UsersBugregApi getApiService() {
        return usersBugregApi;
    }

    public UsersBugregApi getService(String server) {
        return new Retrofit.Builder()
                .baseUrl(server)
                .addCallAdapterFactory(rxJava2CallAdapterFactory)
                .addConverterFactory(gsonConverterFactory)
                .client(okHttpClient)
                .build()
                .create(UsersBugregApi.class);
    }

}
