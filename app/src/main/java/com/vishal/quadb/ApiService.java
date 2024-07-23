package com.vishal.quadb;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("search/shows")
    Call<List<ShowResponse>> getAllShows(@Query("q") String query);
}
