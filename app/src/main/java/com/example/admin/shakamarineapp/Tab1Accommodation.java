package com.example.admin.shakamarineapp;

/**
 * Created by Admin on 7/27/2017.
 */
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Tab1Accommodation extends Fragment  {

    ImageView imageView;
    TextView hotel_name;
    TextView hotel_price;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1accommodation, container, false);
        return rootView;


    }
}
