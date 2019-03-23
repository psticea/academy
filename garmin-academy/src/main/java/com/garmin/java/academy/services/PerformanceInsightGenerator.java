package com.garmin.java.academy.services;

import java.util.List;

import com.garmin.java.academy.domain.Insight;
import com.garmin.java.academy.io.ActivityRepository;
import com.garmin.java.academy.io.MetricsRepository;

public class PerformanceInsightGenerator implements InsightGenerator {

	private ActivityRepository activityRepository;
	private MetricsRepository metricsRepository;

	public PerformanceInsightGenerator(ActivityRepository activityRepository, MetricsRepository metricsRepository) {
		this.activityRepository = activityRepository;
		this.metricsRepository = metricsRepository;
		System.out.println("Initialised PerformanceInsightGenerator");
	}

	@Override
	public List<Insight> generateInsights() {
		return null;
	}

}
