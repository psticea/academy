package com.garmin.java.academy.services;

import java.util.LinkedList;
import java.util.List;

import com.garmin.java.academy.domain.Metrics;
import com.garmin.java.academy.io.ActivityRepository;

public class MetricsService {

	private List <Metrics> metrics;
	private List<MetricsGenerator> generators;
	
	public MetricsService(ActivityRepository activityRepository) {
		metrics = new LinkedList<Metrics>();
		generators = new LinkedList<MetricsGenerator>();
		generators.add(new RunningMetricsGenerator(activityRepository));
		
		initializeAllMetrics();
		
		System.out.println("Initialised MetricsService");
	}
	
	private void initializeAllMetrics() {
		//		generators.stream().
	}

}
