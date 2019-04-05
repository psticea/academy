package com.garmin.java.academy.domain.exceptions;

/**
 * Describes the error states of an activity; should be used for validation; </b> Having an enum can be pure blessing
 * when we want to internationalize the error messages, for a web app for example; the enum can be the property name for
 * the translation in multiple languages for a certain error
 *
 */
public enum ActivityErrorType {
	// TODO add all the activity error possibilities
	MISSING_NAME, MISSING_DISTANCE, MISSING_ACTIVITY;
}
