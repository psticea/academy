package com.garmin.java.academy.services;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.ActivityType;
import com.garmin.java.academy.domain.Insight;
import com.garmin.java.academy.domain.InsightType;
import com.garmin.java.academy.domain.RunningActivity;
import com.garmin.java.academy.domain.RunningMetrics;
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
		List<Insight> insights = new LinkedList<Insight>();

		RunningActivity lastRunningActivity = (RunningActivity) activityRepository.getActivities()//
				.stream()//
				.filter(a -> a.getType().equals(ActivityType.RUNNING))//
				.max(Comparator.comparing(Activity::getDate))//
				.orElse(null);
		// TODO if we consider insights for other activities, the below return logic can change
		if (lastRunningActivity == null) {
			// we prefer to return empty list instead of null to avoid possible NullPointerExceptions
			return Collections.emptyList();
		}

		System.out.println("last running activity " + lastRunningActivity.toString());

		// TODO add the necessary checks so that we do not run into accessing missing elements!!!!
		RunningMetrics runningMetrics = (RunningMetrics) metricsRepository.getAllMetrics().stream()//
				.filter(m -> m.getActivityType().equals(ActivityType.RUNNING))//
				.findFirst().get();

		if (lastRunningActivity.getPace() < runningMetrics.getAveragePace()) {
			Insight insight = new Insight();
			insight.setType(InsightType.PERFORMANCE);
			insight.setMessage("Your latest running activity has a better pace than your historical average! cool!");
			insights.add(insight);
		}
		return insights;
	}

}
