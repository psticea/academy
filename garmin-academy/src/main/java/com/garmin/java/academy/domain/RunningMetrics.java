package com.garmin.java.academy.domain;

public class RunningMetrics extends Metrics {
	private double averagePace;

	public double getAveragePace() {
		return averagePace;
	}

	public void setAveragePace(double averagePace) {
		this.averagePace = averagePace;
	}

	@Override
	public String toString() {
		return "RunningMetrics [averagePace=" + averagePace + ", activityType=" + activityType + ", activitiesCount="
				+ activitiesCount + ", averageSpeed=" + averageSpeed + "]";
	}

	
}
