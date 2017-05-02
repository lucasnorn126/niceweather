package com.example.niceweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lucas on 2017/4/30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;


    public class More {

        @SerializedName("txt")
        public String info;
    }
}
