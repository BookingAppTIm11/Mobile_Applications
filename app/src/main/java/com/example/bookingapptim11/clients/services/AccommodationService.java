package com.example.bookingapptim11.clients.services;

import com.example.bookingapptim11.models.AccommodationDetailsDTO;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface AccommodationService {
    @Headers({
            "User-Agent: Mobile-Android",
            "Content-Type:application/json"
    })
    @GET("accommodations")
    Call<ArrayList<AccommodationDetailsDTO>> getAccommodations();

    @GET("search")
    Call<ArrayList<AccommodationDetailsDTO>> searchAccommodations(
            @Query("guests") Integer guests,
            @Query("location") String location,
            @Query("startDate") String startDate, // Assuming you pass date strings in a specific format
            @Query("endDate") String endDate
    );
}
