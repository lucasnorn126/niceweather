package com.example.niceweather.gson;

/**
 * Created by Lucas on 2017/4/30.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
