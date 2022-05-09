package com.aiden.tflite.tfliteimageclassifier;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JT\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u0006H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/aiden/tflite/tfliteimageclassifier/WeatherInterface;", "", "GetWeather", "Lretrofit2/Call;", "Lcom/aiden/tflite/tfliteimageclassifier/WEATHER;", "num_of_rows", "", "page_no", "data_type", "", "base_date", "base_time", "nx", "ny", "app_debug"})
public abstract interface WeatherInterface {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "getVilageFcst?serviceKey=Dwvax%2F04xQuRp%2B%2FihP1EsxsSHdSkFIohALltjAJSiDpPv4xZLVlIxp0ABvuOyeYNqYkLJAVgymQjVbNtioS%2FXA%3D%3D")
    public abstract retrofit2.Call<com.aiden.tflite.tfliteimageclassifier.WEATHER> GetWeather(@retrofit2.http.Query(value = "numOfRows")
    int num_of_rows, @retrofit2.http.Query(value = "pageNo")
    int page_no, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "dataType")
    java.lang.String data_type, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "base_date")
    java.lang.String base_date, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "base_time")
    java.lang.String base_time, @retrofit2.http.Query(value = "nx")
    int nx, @retrofit2.http.Query(value = "ny")
    int ny);
}