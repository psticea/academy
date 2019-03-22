package com.garmin.java.academy.domain;

public class RunningActivity extends Activity {

	private Integer elevation;
	// distance/elevation
	private Double slope;
	// minute/km
	private Double pace;

	public Integer getElevation() {
		return elevation;
	}

	public void setElevation(Integer elevation) {
		this.elevation = elevation;
	}

	public Double getSlope() {
		return slope;
	}

	public void setSlope(Double slope) {
		this.slope = slope;
	}

	public Double getPace() {
		return pace;
	}

	public void setPace(Double pace) {
		this.pace = pace;
	}

	@Override
	public String toString() {
		return "RunningActivity [elevation=" + elevation + ", slope=" + slope + ", pace=" + pace + ", name=" + name
				+ ", type=" + type + ", date=" + date + ", duration=" + duration + ", distance=" + distance + "]";
	}

}
