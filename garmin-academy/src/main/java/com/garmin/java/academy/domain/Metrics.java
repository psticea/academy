package com.garmin.java.academy.domain;

/*
 * stores metrics for all activities of 
 * a certain activity type
 */
public abstract class Metrics {
	private ActivityType activityType;
	private int activitiesCount;
	private double averageSpeed;

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