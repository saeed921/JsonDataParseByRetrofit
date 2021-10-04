package com.example.jsondataparsebyretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Now we have to create a Handler for Handle Retrofit
        * for send req for City, Api key, &Cnt we have to create a handler*/

        Retrofit retrofit=RetroFit.getRetroFitInstance();
       DataService dataService=retrofit.create(DataService.class);
       Call<DailyForeCast> call = dataService.getDailyForeCast("Dhaka", "a4d186c35343e70c8daee8e27a415f7c",
                7);
       call.enqueue(new Callback<DailyForeCast>() {
           @Override
           public void onResponse(Call<DailyForeCast> call, Response<DailyForeCast> response) {
               if(response.isSuccessful())
               {
                   Toast.makeText(MainActivity.this,response.body().getCity().getName(),Toast.LENGTH_SHORT).show();

               }
               else{

                   Toast.makeText(MainActivity.this,"Something is wrong",Toast.LENGTH_SHORT).show();
               }
           }

           @Override
           public void onFailure(Call<DailyForeCast> call, Throwable t) {
               Toast.makeText(MainActivity.this, "Failed", Toast.LENGTH_SHORT).show();



           }
       });



    }
}