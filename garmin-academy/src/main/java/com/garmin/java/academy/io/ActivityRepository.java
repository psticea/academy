package com.garmin.java.academy.io;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import com.garmin.java.academy.domain.Activity;

public interface ActivityRepository {

	void add(Activity activity) throws Exception;

	List<Activity> getActivities();

	/**
	 * Reads activities from memory
	 * 
	 * @return
	 * @throws IOException
	 * @throws URISyntaxException
	 */
    List <Activity> loadActivities() throws Exception;
}
