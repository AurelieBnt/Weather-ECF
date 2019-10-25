package com.example.weatheractivity.models;

public class Weather {

    private int temperature;
    private String description;
    private int humidity;
    private City city;
    private VisualRendering visualRendering;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public VisualRendering getVisualRendering() {
        return visualRendering;
    }

    public void setVisualRendering(VisualRendering visualRendering) {
        this.visualRendering = visualRendering;
    }
}
