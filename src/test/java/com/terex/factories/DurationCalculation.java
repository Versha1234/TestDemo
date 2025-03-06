package com.terex.factories;

import java.util.concurrent.TimeUnit;

public class DurationCalculation {

	private static Long end;
	private static Long start;

	public static long getStartTime() {
		start = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		return start;

	}

	public static long getEndTime() {
		Long End = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
		return End;

	}

	public static String totalDuration(long startTime, long endTime) {
		long dt = endTime - startTime;
		String totalDuration = Long.toString(dt);
		return totalDuration;

	}

}

