package com.garmin.java.academy.client;

import java.util.Date;

import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.ActivityType;
import com.garmin.java.academy.domain.Distance;
import com.garmin.java.academy.domain.MeasurementUnit;
import com.garmin.java.academy.domain.RunningActivity;

public class AcademyApplicationClientUtil {

	public static Activity createRunningActivityWithNoMandatoryFields() {
		return new RunningActivity();
	}
	
	public static Activity createRunningActivity() {
		Activity activity= new RunningActivity();
		activity.setDate(new Date());
		activity.setDistance(new Distance(10, MeasurementUnit.KILOMETERS));
		activity.setName("I am a super runner");
		activity.setType(ActivityType.RUNNING);
		return activity;
	}

}
