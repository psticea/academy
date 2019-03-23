package com.garmin.java.academy.io;

import java.util.List;

import com.garmin.java.academy.domain.Metrics;

public interface MetricsRepository {
	void addMetrics(List<Metrics> metrics);

	List<Metrics> getAllMetrics();
}
