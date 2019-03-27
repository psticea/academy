package com.garmin.java.academy.services;

import com.garmin.java.academy.domain.ActivityType;
import com.garmin.java.academy.domain.Metrics;
import com.garmin.java.academy.domain.RunningMetrics;
import com.garmin.java.academy.io.ActivityRepository;

public class RunningMetricsGenerator extends AbstractMetricsGenerator{

	public RunningMetricsGenerator(ActivityRepository activityRepository) {
		super(activityRepository);
		System.out.println("Initialised RunningMetricsGenerator");
	}

	@Override
	public Metrics generateMetrics(){
		RunningMetrics metrics = new RunningMetrics();
		metrics.setActivityType(ActivityType.RUNNING);
		
		int count =
		(int)activityRepository.getActivities()
			.stream()
			.filter(x -> x.getType().equals(ActivityType.RUNNING))
			.count();
		
		metrics.setActivitiesCount(count);

		Double totalDistanceInMeters = 
		activityRepository.getActivities()
			.stream()
			.filter(x -> x.getType().equals(ActivityType.RUNNING))
			.mapToDouble(a -> a.getDistance().getValue())
			.sum();
		
		Long totalTimeInSec= 
		activityRepository.getActivities()
			.stream()
			.filter(x -> x.getType().equals(ActivityType.RUNNING))
			.map(a -> a.getDuration())
			.reduce(Long::sum)
			.get();
			
		metrics.setAveragePace((totalTimeInSec/60) / (totalDistanceInMeters/1000));
		
		return metrics;
	}

}
