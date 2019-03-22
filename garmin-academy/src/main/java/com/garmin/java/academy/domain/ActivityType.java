package com.garmin.java.academy.domain;

public enum ActivityType {

    RUNNING("RUNNING"), SWIMMING("SWIMMING");
	
	private String type;
	
	ActivityType (String type){
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}

}
