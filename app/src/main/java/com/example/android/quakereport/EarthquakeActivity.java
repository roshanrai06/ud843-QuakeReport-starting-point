/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();
    private List<EarthQuakeDetails> earthQuakeDetailsList = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private EarthQuakeAdapter mEarthQuakeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mEarthQuakeAdapter = new EarthQuakeAdapter(earthQuakeDetailsList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mEarthQuakeAdapter);

        prepareMovieData();


    }

    private void prepareMovieData() {
        EarthQuakeDetails earthQuakeDetails = new EarthQuakeDetails("5.1", "San Francisco", "Feb 2,2016");
        earthQuakeDetailsList.add(earthQuakeDetails);

        earthQuakeDetails = new EarthQuakeDetails("4.1", "London", "Jun 6,2016");
        earthQuakeDetailsList.add(earthQuakeDetails);

        earthQuakeDetails = new EarthQuakeDetails("3.1", "Tokyo", "July 8,2016");
        earthQuakeDetailsList.add(earthQuakeDetails);

        earthQuakeDetails = new EarthQuakeDetails("6.1", "Mexico City", "August 12,2016");
        earthQuakeDetailsList.add(earthQuakeDetails);

        earthQuakeDetails = new EarthQuakeDetails("7.1", "Moscow", "Sep 23,2016");
        earthQuakeDetailsList.add(earthQuakeDetails);

        earthQuakeDetails = new EarthQuakeDetails("4.7", "Rio de Janeiro", "Nov 27,2016");
        earthQuakeDetailsList.add(earthQuakeDetails);

        earthQuakeDetails = new EarthQuakeDetails("2.1", "Paris", "Dec 17,2016");
        earthQuakeDetailsList.add(earthQuakeDetails);

        mEarthQuakeAdapter.notifyDataSetChanged();
    }
}
