package com.example.ihahire.network;

import com.example.ihahire.Search;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
    @GET("businesses/search")
    Call<Search> getProducts(
            @Query("location") String location,
            @Query("term") String term
    );
}
