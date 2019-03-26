package com.garmin.java.academy.services;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import com.garmin.java.academy.domain.Metrics;
import com.garmin.java.academy.io.ActivityRepository;
import com.garmin.java.academy.io.MetricsRepository;

public class MetricsService {

	private List<MetricsGenerator> metricsGenerators;
	MetricsRepository metricsRepository;
	
	public MetricsService(ActivityRepository activityRepository, MetricsRepository metricsRepository) {
	
		this.metricsRepository = metricsRepository;
		metricsGenerators = new LinkedList<MetricsGenerator>();
		metricsGenerators.add(new RunningMetricsGenerator(activityRepository));
		metricsGenerators.add(new SwimmingMetricsGenerator(activityRepository));
		
		initializeAllMetrics();
		
		System.out.println("Initialised MetricsService");
	}
	
	private void initializeAllMetrics() {
		
		List<Metrics> metrics =
		metricsGenerators
			.stream()
			.map(MetricsGenerator::generateMetrics)
			.collect(Collectors.toList());
		
		metricsRepository.addMetrics(metrics);
		
		System.out.println("MetricsService generated "+metrics.size() +" metrics" );
		metrics.forEach(System.out::println);
	}

}
















