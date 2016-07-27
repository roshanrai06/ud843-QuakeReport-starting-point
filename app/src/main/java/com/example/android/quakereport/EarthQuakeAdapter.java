package com.example.android.quakereport;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Roshan Rai on 7/27/2016.
 */
public class EarthQuakeAdapter extends RecyclerView.Adapter<EarthQuakeAdapter.MyViewHolder> {
    private List<EarthQuakeDetails> mEarthQuakeDetailsList;

    public EarthQuakeAdapter(List<EarthQuakeDetails> mEarthQuakeDetailsList) {
        this.mEarthQuakeDetailsList = mEarthQuakeDetailsList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView magnitude, name, date;

        public MyViewHolder(View view) {
            super(view);
            magnitude = (TextView) view.findViewById(R.id.magnitude);
            name = (TextView) view.findViewById(R.id.city_name);
            date = (TextView) view.findViewById(R.id.date);
        }
    }

    @Override
    public EarthQuakeAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.earthquake_list, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EarthQuakeAdapter.MyViewHolder holder, int position) {
        EarthQuakeDetails earthQuakeDetails = mEarthQuakeDetailsList.get(position);
        holder.magnitude.setText(earthQuakeDetails.getMagnitude());
        holder.name.setText(earthQuakeDetails.getCityName());
        holder.date.setText(earthQuakeDetails.getDate());

    }

    @Override
    public int getItemCount() {
        return mEarthQuakeDetailsList.size();
    }
}
