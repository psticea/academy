package com.garmin.java.academy.services;

import com.garmin.java.academy.io.ActivityRepository;

public abstract class AbstractMetricsGenerator implements MetricsGenerator{

	private ActivityRepository activityRepository;
	
	public AbstractMetricsGenerator(ActivityRepository activityRepository) {
		this.activityRepository = activityRepository;
	}

}