package com.garmin.java.academy.services;

import java.util.List;

import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.Metrics;

public interface MetricsGenerator {
	
	Metrics generateMetrics(List<Activity> activities);
}