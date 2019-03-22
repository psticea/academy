package com.garmin.java.academy.domain;

public class Distance {

    private float value;

    private MeasurementUnit measurementUnit;

    public Distance() {
    }

    public Distance(float value, MeasurementUnit measurementUnit) {
        this.value = value;
        this.measurementUnit = measurementUnit;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
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
