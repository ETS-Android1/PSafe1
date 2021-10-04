package com.example.psafe.data.model;

public class AccidentLocation {
    private double latitude;
    private double longitude;

    public AccidentLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public AccidentLocation() {
        this.latitude = 0;
        this.longitude = 0;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
