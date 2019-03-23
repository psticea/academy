package com.garmin.java.academy.services;

import java.util.LinkedList;
import java.util.List;

import com.garmin.java.academy.io.ActivityRepository;
import com.garmin.java.academy.io.MetricsRepository;

public class InsightService {

	private List<InsightGenerator> insightGenerators;
	
	public InsightService(ActivityRepository activityRepository, MetricsRepository metricsRepository) {
		insightGenerators = new LinkedList<InsightGenerator>();
		insightGenerators.add(new PerformanceInsightGenerator(activityRepository, metricsRepository));
		
		System.out.println("Initialised InsightService");
	}

}
