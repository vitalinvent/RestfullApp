package com.vitalinvent.restfullapp.api;

import com.vitalinvent.restfullapp.models.ResultUsers;

import io.reactivex.Observable;
import retrofit2.http.POST;

public interface UsersBugregApi {
    //-----------------------------------DaData------------------------------//
    @POST("tasks/rest/magicsearch")
    Observable<ResultUsers> getUsers();

}
