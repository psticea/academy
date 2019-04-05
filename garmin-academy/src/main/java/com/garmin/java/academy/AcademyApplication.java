package com.garmin.java.academy;

import org.apache.log4j.Logger;

import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.exceptions.BusinessException;
import com.garmin.java.academy.io.ActivityRepository;
import com.garmin.java.academy.io.ActivityRepositoryJsonImpl;
import com.garmin.java.academy.io.MetricsRepository;
import com.garmin.java.academy.io.MetricsRepositoryInMemory;
import com.garmin.java.academy.services.ActivityService;
import com.garmin.java.academy.services.InsightService;
import com.garmin.java.academy.services.MetricsService;
import com.garmin.java.academy.validator.ActivityValidator;

public class AcademyApplication {
	private static final Logger LOG = Logger.getLogger(AcademyApplication.class);

	private ActivityService activityService;
	private MetricsService metricsService;
	private InsightService insightService;

	private ActivityValidator activityValidator;

	public AcademyApplication() {
		LOG.info("Application starting to be initialized");
		try {
			ActivityRepository activityRepository = new ActivityRepositoryJsonImpl();
			MetricsRepository metricsRepository = new MetricsRepositoryInMemory();
			this.activityValidator = new ActivityValidator();

			activityService = new ActivityService(activityRepository);
			metricsService = new MetricsService(activityRepository, metricsRepository);
			insightService = new InsightService(activityRepository, metricsRepository);
		} catch (Exception exception) {
			LOG.error("Error while initializing our app :( bad things do happen - please check the stack trace to see why", exception);
			throw exception;
		}

		LOG.info("Application is initialized");
	}

	public void addActivity(Activity activity) throws BusinessException {
		// we want to do as soon that we can the filed presence and format type validation!!!
		activityValidator.validate(activity);
		activityService.addActivity(activity);
		// TODO write logic for recomputing the metrics and the insights based on our activity addition
	}

}
