package com.garmin.java.academy.services;

import com.garmin.java.academy.io.ActivityRepository;

public class ActivityService {

	private ActivityRepository activityRepository;

	public ActivityService(ActivityRepository activityRepository) throws Exception {

		this.activityRepository = activityRepository;
		System.out.println("Initialised ActivityService");
	}

}
