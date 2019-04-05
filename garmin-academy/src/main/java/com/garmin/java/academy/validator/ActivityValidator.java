package com.garmin.java.academy.validator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.garmin.java.academy.domain.Activity;
import com.garmin.java.academy.domain.exceptions.ActivityErrorType;
import com.garmin.java.academy.domain.exceptions.ActivityValidationException;

/**
 * Each class should have a single purpose => so we are separating the input validation from the main application layers
 * and extract the logic in a separate util class
 */
public class ActivityValidator {

	public void validate(Activity activity) {
		List<ActivityErrorType> errorsList = new ArrayList<>();
		if (activity == null) {
			throw new ActivityValidationException("The activity cannot be null", Arrays.asList(ActivityErrorType.MISSING_ACTIVITY));
		}
		if (activity.getName() == null || "".equals(activity.getName())) {
			errorsList.add(ActivityErrorType.MISSING_NAME);
		}
		// TODO add the rest of the errors

		// TODO use CollectionUtils :D
		if (errorsList.size() != 0) {
			throw new ActivityValidationException("Invalid input", errorsList);
		}
	}

}
