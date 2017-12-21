package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 10543 on 2017/12/6.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
