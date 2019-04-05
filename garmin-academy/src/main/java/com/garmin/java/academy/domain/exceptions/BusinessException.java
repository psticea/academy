package com.garmin.java.academy.domain.exceptions;

/**
 * The general industry accepted rule is that if the application provides a fallback scenrio/ an alternative to an
 * error, then the exception should be checked. Otherwise, unchecked.<br/>
 * However, it is more and more 'digested' the idea that in case of business exceptions, we should have checked
 * exceptions. The business exception cases have a special behavior, including a different type of logging message.
 * Therefore, it is easier for a developer to track the code and add effective support in a real application if there is
 * a mandatory mentioning in the targeted flow of the thrown checked exception
 *
 */
public class BusinessException extends Exception {
	private static final long serialVersionUID = 1L;

	public BusinessException(String message) {
		super(message);
	}

}
