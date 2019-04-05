package com.garmin.java.academy;

import java.util.Arrays;
import java.util.List;

public class LetsInsertSomeProblems {

	public static void main(String[] args) {
		playWithSomeDummyList();
	}

	private static void playWithSomeDummyList() {
		List<String> dummyList = Arrays.asList("ab", "de");
		System.out.println(dummyList.get(10));
	}

}
