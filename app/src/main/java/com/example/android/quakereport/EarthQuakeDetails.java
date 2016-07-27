package com.example.android.quakereport;

/**
 * Created by Roshan Rai on 7/27/2016.
 */
public class EarthQuakeDetails {
    private String mMagnitude, mCityName, mDate;

    public EarthQuakeDetails(String mMagnitude, String mCityName, String mDate) {
        this.mMagnitude = mMagnitude;
        this.mCityName = mCityName;
        this.mDate = mDate;
    }

    public EarthQuakeDetails() {
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(String mMagnitude) {
        this.mMagnitude = mMagnitude;
    }

    public String getCityName() {
        return mCityName;
    }

    public void setCityName(String mCityName) {
        this.mCityName = mCityName;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String mDate) {
        this.mDate = mDate;
    }


}
