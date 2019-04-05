package com.garmin.java.academy.services;

import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.exceptions.BusinessException;
import com.garmin.java.academy.io.ActivityRepository;

public class ActivityService {

	private ActivityRepository activityRepository;

	public ActivityService(ActivityRepository activityRepository) {

		this.activityRepository = activityRepository;
		System.out.println("Initialised ActivityService");
	}

	// assuming we do not want the combination of (activity name and type) to repeat among activities;
	// TODO to be actually fair to the application logic, we should validate a duplicate by all its fields.s
	public void addActivity(Activity activity) throws BusinessException {
		boolean result = activityRepository.getActivities()//
				.stream()//
				.anyMatch(existingActivity -> existingActivity.getName()//
						.equalsIgnoreCase(activity.getName()) //
						&& existingActivity.getType().equals(activity.getType()));
		if (result) {
			throw new BusinessException("The activity with name" + activity.getName() + "... and the rest of details... already exists");
		}
		activityRepository.add(activity);
	}

}
