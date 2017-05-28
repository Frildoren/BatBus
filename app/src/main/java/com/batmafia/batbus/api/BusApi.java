package com.batmafia.batbus.api;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BusApi {

    public static BusClient getClient(Context context){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.interurbanos.welbits.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(BusClient.class);
    }

}
