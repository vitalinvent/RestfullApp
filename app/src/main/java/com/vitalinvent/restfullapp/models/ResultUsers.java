package com.vitalinvent.restfullapp.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ResultUsers {
    @SerializedName("foundCount")
    int foundCount;
    public ArrayList<User> results;
}
