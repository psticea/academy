package com.garmin.java.academy;

import com.garmin.java.academy.client.AcademyApplicationClientUtil;
import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.exceptions.ActivityValidationException;
import com.garmin.java.academy.domain.exceptions.BusinessException;

public class Main {
	// TODO replace all the System.out.println with the proper logging messages and logging levels
	public static void main(String[] args) {
		AcademyApplication academyApplication = new AcademyApplication();
		Activity dummyActivity = AcademyApplicationClientUtil.createRunningActivityWithNoMandatoryFields();
		try {
			academyApplication.addActivity(dummyActivity);
		} catch (ActivityValidationException activityValidationException) {
			// TODO: Log the exception
		} catch (BusinessException businessException) {
			// TODO: Log the exception
		}
	}

}
