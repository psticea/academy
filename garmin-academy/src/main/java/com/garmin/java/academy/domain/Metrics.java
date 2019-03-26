package com.garmin.java.academy.domain;

/**
/*
 * stores metrics for all activities of 
 * a certain type
 */
public abstract class Metrics {
	protected ActivityType activityType;
	protected int activitiesCount;
	protected double averageSpeed;

	public ActivityType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityType activityType) {
		this.activityType = activityType;
	}

	public int getActivitiesCount() {
		return activitiesCount;
	}

	public void setActivitiesCount(int activitiesCount) {
		this.activitiesCount = activitiesCount;
	}

	public double getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(double averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

}