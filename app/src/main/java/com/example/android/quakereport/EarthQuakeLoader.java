package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Roshan Rai on 10/11/2016.
 */
public class EarthQuakeLoader extends AsyncTaskLoader<List<EarthQuakeDetails>> {
    /**
     * URL for earthquake data from the USGS dataset
     */
    private static final String USGS_REQUEST_URL =
            "http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&orderby=time&minmag=6&limit=10";

    public EarthQuakeLoader(Context context) {
        super(context);
    }

    @Override
    public List<EarthQuakeDetails> loadInBackground() {
        List<EarthQuakeDetails> list = QueryUtil.fetchEarthquakeData(USGS_REQUEST_URL);
        return list;
    }
}
