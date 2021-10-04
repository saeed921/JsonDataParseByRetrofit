package com.example.jsondataparsebyretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFit {


    /* From the Url we have to copy our Base Url sor convertwith Gson.so we put Base_Url link in a Base_Url Variable
   create a Referance Object for Retrofit
   Create a method so that we can call this method whenever we need
   for create a Retrofit Object thats the way we put in getRetrofitInstance() method and return retrofit
   * */

    /*Again Note that::: , there is 2way in Retrofit. we have to divide the End and Base Url for Handle Retrofit. lets go to Dataservice Interface Class
            for End_Url*/

    private  static final  String BASE_URL="https://api.openweathermap.org/";
    private static Retrofit retroFit;



     static Retrofit getRetroFitInstance()
    {

        retroFit=new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
return  retroFit;
    }

}
