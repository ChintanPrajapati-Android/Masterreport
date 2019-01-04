package com.example.chintan.research.remote;

import android.content.Context;

import com.example.chintan.research.BuildConfig;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by sai on 18/03/2017.
 */

public class MyRetrofitdebug {
    //call default url

    public static String BASE_URL = "http://www.vts24.com/";
    public static Retrofit retrofit;
    private static Context mContext;


    public static void resetRetrofitObject() {  //Use when new Default Parameter update
        retrofit = null;
    }

    private static HttpLoggingInterceptor getLoggingInterceptor() {
        return new HttpLoggingInterceptor()
                .setLevel(HttpLoggingInterceptor.Level.HEADERS)
                .setLevel(HttpLoggingInterceptor.Level.BODY);
    }


    private static OkHttpClient getHttpClient() {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.readTimeout(60, TimeUnit.MINUTES);
        httpClient.connectTimeout(60, TimeUnit.SECONDS);
        // add your other interceptors (extra parameter)…
        //httpClient.addInterceptor(getDefaultParameterInterceptor());
        // add logging as last interceptor
        if (BuildConfig.DEBUG) httpClient.addInterceptor(getLoggingInterceptor());

        return httpClient.build();
    }

    public static Retrofit getInstance(Context mContext) {
        MyRetrofitdebug.mContext = mContext;

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    //.baseUrl(BASE_URL)
                    .baseUrl("https://api.myjson.com/bins/")
                    .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .client(getHttpClient())
                    .build();
        }
        return retrofit;
    }
}
