package com.garmin.java.academy.domain;

public class SwimmingActivity extends Activity {

	private StrokeType strokeType;
	// numberOfStrokes/poolLength (50m)
	private Integer swolf;
	private Integer numberOfStrokes;

	public StrokeType getStrokeType() {
		return strokeType;
	}

	public void setStrokeType(StrokeType strokeType) {
		this.strokeType = strokeType;
	}

	public Integer getSwolf() {
		return swolf;
	}

	public void setSwolf(Integer swolf) {
		this.swolf = swolf;
	}

	public Integer getNumberOfStrokes() {
		return numberOfStrokes;
	}

	public void setNumberOfStrokes(Integer numberOfStrokes) {
		this.numberOfStrokes = numberOfStrokes;
	}

	@Override
	public String toString() {
		return "SwimmingActivity [strokeType=" + strokeType + ", swolf=" + swolf + ", numberOfStrokes="
				+ numberOfStrokes + ", name=" + name + ", type=" + type + ", date=" + date + ", duration=" + duration
				+ ", distance=" + distance + "]";
	}
}
