package com.example.android.quakereport;

/**
 * Created by Tomi on 3.5.2017..
 */

public class Earthquake {

    private String mCityName;
    private double mMag;
    private long mTime;
    private String mUrl;

    Earthquake(double mag, String cityName, long time, String url) {
        mMag = mag;
        mCityName = cityName;
        mTime = time;
        mUrl = url;
    }


    public  double getmMag() {
        return  mMag;
    }

    public String getmCityName () {return  mCityName;}

    public long getmTime() {return mTime;}

    public String getmUrl() {return mUrl;}

}
