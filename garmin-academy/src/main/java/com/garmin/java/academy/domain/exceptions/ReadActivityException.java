package com.garmin.java.academy.domain.exceptions;

public class ReadActivityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ReadActivityException(String string) {
		super(string);
	}

	public ReadActivityException(String string, Throwable throwable) {
		super(string, throwable);
	}

}
