package com.garmin.java.academy.services;

import java.util.List;

import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.Metrics;
import com.garmin.java.academy.io.ActivityRepository;

public class SwimmingMetricsGenerator extends AbstractMetricsGenerator{

	public SwimmingMetricsGenerator (ActivityRepository activityRepository) {
		super(activityRepository);
		System.out.println("Initialised SwimmingMetricsGenerator");
	}

	@Override
	public Metrics generateMetrics(List<Activity> activities) {
		// TODO Auto-generated method stub
		return null;
	}

}