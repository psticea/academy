package com.garmin.java.academy.domain;

public class Distance {

    private double value;

    private MeasurementUnit measurementUnit;

    public Distance() {
    }

    public Distance(double value, MeasurementUnit measurementUnit) {
        this.value = value;
        this.measurementUnit = measurementUnit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "value=" + value +
                ", measurementUnit=" + measurementUnit +
                '}';
    }
}
