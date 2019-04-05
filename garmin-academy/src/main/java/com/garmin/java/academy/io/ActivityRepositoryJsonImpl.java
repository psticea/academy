package com.garmin.java.academy.io;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.RunningActivity;
import com.garmin.java.academy.domain.SwimmingActivity;
import com.garmin.java.academy.domain.exceptions.ReadActivityException;

public class ActivityRepositoryJsonImpl implements ActivityRepository {

	private static final String RUNNING_ACTIVITIES_FILE_NAME = "activities/runningActivities.json";
	private static final String SWIMMING_ACTIVITIES_FILE_NAME = "activities/swimmingActivities.json";

	static ObjectMapper mapper = new ObjectMapper();

	static {
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	private List<Activity> activities;

	public ActivityRepositoryJsonImpl() {
		loadActivities();
		System.out.println("Initialised ActivityRepositoryJsonImpl");
	}

	// load all activities
	@Override
	public List<Activity> loadActivities() {
		String runningActivities = readFile(RUNNING_ACTIVITIES_FILE_NAME);
		String swimmingActivities = readFile(SWIMMING_ACTIVITIES_FILE_NAME);

		try {
			activities = mapper.readValue(runningActivities, new TypeReference<List<RunningActivity>>() {
			});
			activities.addAll(mapper.readValue(swimmingActivities, new TypeReference<List<SwimmingActivity>>() {
			}));
		} catch (IOException e) {
			throw new ReadActivityException("Could not parse correctly json file", e);
		}

		System.out.println("ActivityRepositoryJsonImpl loaded from file " + activities.size() + " activities.");

		activities.stream().forEach(System.out::println);

		return activities;
	}

	private static String readFile(String fileName) throws ReadActivityException {
		Path path;
		try {
			path = Paths.get(ActivityRepositoryJsonImpl.class.getClassLoader().getResource(fileName).toURI());
		} catch (Exception uriSyntaxException) {
			throw new ReadActivityException("Error while building the file path:" + fileName, uriSyntaxException);
		}

		// Stream<String> lines;
		// try {
		// lines = Files.lines(path);
		// } catch (IOException ioException) {
		// throw new ReadActivityException("Error while processing the lines", ioException);
		// }
		//
		// try {
		// return lines.collect(Collectors.joining("\n"));
		// } finally {
		// // This is just for didactic purposes, as the above line will not throw exception and the lines stream will
		// // get closed on time
		// lines.close();
		// }
		// }
		//

		try (Stream<String> lines = Files.lines(path)) {
			return lines.collect(Collectors.joining("\n"));
		} catch (IOException ioException) {
			throw new ReadActivityException("Error while processing the lines", ioException);
		}
	}

	@Override
	public void add(Activity activity) {
		// TODO 

	}

	@Override
	public List<Activity> getActivities() {
		return activities;
	}

}
