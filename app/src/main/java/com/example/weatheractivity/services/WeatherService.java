package com.example.weatheractivity.services;

import android.content.Context;

import com.example.weatheractivity.models.City;
import com.example.weatheractivity.models.Weather;

public class WeatherService implements ICityServiceListener{

    public IWeatherServiceListener activity;

    public WeatherService(IWeatherServiceListener iWeatherServiceListener){
        Context context = (Context) iWeatherServiceListener;
        this.activity = iWeatherServiceListener;
        new CityService(this, context);

    }



    @Override
    public void onSuccessCity(City city) {
        Weather newWeather = new Weather();
        newWeather.setCity(city);
        activity.onSuccessWeather(newWeather);
    }
}
