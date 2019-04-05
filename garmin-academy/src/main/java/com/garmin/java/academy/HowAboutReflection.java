package com.garmin.java.academy;

import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.RunningActivity;

public class HowAboutReflection {

	public static void main(String[] args) {
		Activity activity = new RunningActivity();
		
		activity.setName("fugim cu exeptii azi");
		
		try {
			activity.getClass().getMethod("blah");
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

}
