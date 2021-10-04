package com.example.jsondataparsebyretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataService {


    //data/2.5/forecast?q=Dhaka&appid=a4d186c35343e70c8daee8e27a415f7c&cnt=7
/*Note:
// Here we can see that in our end_url have 3 query likes, City name? Api key?and cnt that means
  how much day forecast we want. so we pass the end_url "data/2.5/forecast/daily"
  after that we write query for that we call, Call class and the type is<DailyForeCast> this is a model type referance and for 3 query
  we write the "key" and type & Value here. thats all for Interface Now we have to handle it so that we have to create a handler but
  this is a Interface type class so normally we can't create a Object in MainActivity so we have to apply another way. lets go to MainActivity Now
    */

    @GET("data/2.5/forecast")
    Call<DailyForeCast> getDailyForeCast(@Query("Q")String city,
                                        @Query("APPID") String apikey,
                                        @Query("cnt") int cnt);



}
