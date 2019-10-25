package com.example.weatheractivity.services;

import android.content.Context;
import com.example.weatheractivity.models.City;
import com.example.weatheractivity.models.Location;

public class CityService implements ILocationServiceListener {

    public ICityServiceListener activity;

    public CityService(ICityServiceListener iCityServiceListener, Context context) {
        this.activity = iCityServiceListener;
        new LocationService(this, context);

    }

    @Override
    public void onSuccessLocation(Location location) {
        City newCity = new City();



        newCity.setLocation(location);
        activity.onSuccessCity(newCity);
    }

}
