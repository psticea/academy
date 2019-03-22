package com.garmin.java.academy.domain;

public class Insight {
	private String message;
	private InsightType type;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InsightType getType() {
		return type;
	}

	public void setType(InsightType type) {
		this.type = type;
	}

}