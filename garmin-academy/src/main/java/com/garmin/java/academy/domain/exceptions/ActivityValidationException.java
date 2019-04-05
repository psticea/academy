package com.garmin.java.academy.domain.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ActivityValidationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	/**
	 * Contains the list of all the errors spotted while doing the validation on an activity
	 */
	private List<ActivityErrorType> crtErrors = new ArrayList<>();

	public ActivityValidationException(String message, List<ActivityErrorType> crtErrors) {
		super(message);
		this.crtErrors = crtErrors;
	}

	public List<ActivityErrorType> getCrtErrors() {
		return crtErrors;
	}

}
