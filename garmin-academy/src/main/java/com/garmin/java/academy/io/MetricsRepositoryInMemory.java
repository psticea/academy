package com.garmin.java.academy.io;

import java.util.LinkedList;
import java.util.List;

import com.garmin.java.academy.domain.Metrics;

public class MetricsRepositoryInMemory implements MetricsRepository {

	private List<Metrics> metrics;

	public MetricsRepositoryInMemory() {
		metrics = new LinkedList<Metrics>();
		System.out.println("Initialised MetricsRepositoryInMemory");
	}

	@Override
	public void addMetrics(List<Metrics> metrics) {
		this.metrics.addAll(metrics);
	}

	@Override
	public List<Metrics> getAllMetrics() {
		return metrics;
	}

}
