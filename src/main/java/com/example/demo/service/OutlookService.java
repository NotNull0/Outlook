package com.example.demo.service;


import com.example.demo.info.Event;
import com.example.demo.info.PagedResult;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface OutlookService {
    @GET("/v1.0/me/events")
    Call<PagedResult<Event>> getEvents(
            @Query("$orderby") String orderBy,
            @Query("$select") String select,
            @Query("$top") Integer maxResults
    );
}
