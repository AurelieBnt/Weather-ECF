package com.example.weatheractivity.services;

import com.example.weatheractivity.models.Weather;

public interface IWeatherServiceListener {

    void onSuccessWeather(Weather weather);
}
