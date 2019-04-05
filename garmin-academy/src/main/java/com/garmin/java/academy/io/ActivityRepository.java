package com.garmin.java.academy.io;

import java.util.List;

import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.exceptions.ReadActivityException;

public interface ActivityRepository {

	void add(Activity activity);

	List<Activity> getActivities();

	/**
	 * Reads activities from memory
	 * 
	 * @return
	 * @throws ReadActivityException 
	 */
	List<Activity> loadActivities();
}
