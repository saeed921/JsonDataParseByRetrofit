package com.example.jsondataparsebyretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFit {

    private  static final  String BASE_URL="https://api.openweathermap.org/";
    private static Retrofit retroFit;
    private static Retrofit getRetroFitInstance()
    {

        retroFit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
return  retroFit;
    }

}
