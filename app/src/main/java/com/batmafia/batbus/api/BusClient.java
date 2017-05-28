package com.batmafia.batbus.api;

import com.batmafia.batbus.model.BusStop;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface BusClient {

    @GET("stop/{id}")
    Call<BusStop> getStops(@Path("id") String id);

}
