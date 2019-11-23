package com.vitalinvent.restfullapp.api;

import com.vitalinvent.restfullapp.models.ResultUsers;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface DaDataApi2 {
    //-----------------------------------DaData------------------------------//
    @Headers("Content-Type: application/json")
    @POST("tasks/rest/magicsearch")
    Call<ResultUsers> data(@Body HashMap<String, String> body);

}
