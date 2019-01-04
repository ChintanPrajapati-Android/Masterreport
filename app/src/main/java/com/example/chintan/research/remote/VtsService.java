package com.example.chintan.research.remote;

import com.example.chintan.research.model.TravelAndStopSummaryItem;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Url;

import java.util.ArrayList;

/**
 * Created by Kintan Patel on 18/03/2017.
 */

public interface VtsService {

    @GET
    Observable<ApiResponse<ArrayList<TravelAndStopSummaryItem>>> getData(@Url String url);
}
