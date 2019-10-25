package com.example.weatheractivity.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.weatheractivity.R;
import com.example.weatheractivity.models.Weather;
import com.example.weatheractivity.services.IWeatherServiceListener;
import com.example.weatheractivity.services.WeatherService;

public class WeatherActivity extends AppCompatActivity implements IWeatherServiceListener {

    public String maKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new WeatherService(this);
        maKey = getString(R.string.openWeather);

    }


    @Override
    public void onSuccessWeather(Weather weather) {
        Toast.makeText(this, weather.getCity().getLocation().getLatitude().toString(), Toast.LENGTH_LONG).show();
    }
}
