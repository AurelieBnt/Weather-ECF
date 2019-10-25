package com.example.weatheractivity.services;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import com.example.weatheractivity.models.Location;

public class LocationService implements LocationListener {

    public ILocationServiceListener activity;

    public LocationManager locationManager;

    public LocationService(ILocationServiceListener iLocationServiceListener, Context context){
        this.activity = iLocationServiceListener;
        locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
        String[] permission = {Manifest.permission.ACCESS_FINE_LOCATION};
        ActivityCompat.requestPermissions((Activity)context, permission, 1);
        if(context.checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 1, this);
        }
    }

    @Override
    public void onLocationChanged(android.location.Location location) {
        Location newLocation = new Location();
        newLocation.setLatitude(location.getLatitude());
        newLocation.setLongitude(location.getLongitude());
        activity.onSuccessLocation(newLocation);

    }

    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    public void onProviderEnabled(String provider) {

    }

    public void onProviderDisabled(String provider) {

    }

}
