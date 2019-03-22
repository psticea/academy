package com.garmin.java.academy.domain;

public class SwimmingMetrics extends Metrics {

    private float avgSwolf;
    private StrokeType favouriteStyle;

    public float getAvgSwolf() {
        return avgSwolf;
    }

    public void setAvgSwolf(float avgSwolf) {
        this.avgSwolf = avgSwolf;
    }

    public StrokeType getFavouriteStyle() {
        return favouriteStyle;
    }

    public void setFavouriteStyle(StrokeType favouriteStyle) {
        this.favouriteStyle = favouriteStyle;
    }

}
