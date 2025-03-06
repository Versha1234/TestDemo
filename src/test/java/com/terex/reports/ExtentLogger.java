package com.terex.reports;

import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.terex.utility.BasePage;
import com.terex.utils.ConfigProperties;
import com.terex.utils.ReadPropertyFile;

public class ExtentLogger extends BasePage {

	private ExtentLogger() {

	}

	public static void pass(String message) {
		ExtentManager.getExtentTest().pass(message);
	}

	public static void fail(String message) {
		ExtentManager.getExtentTest().fail(message);
	}

	public static void skip(String message) {
		ExtentManager.getExtentTest().skip(message);
	}

	public static void info(String message) {
		ExtentManager.getExtentTest().info(message);
	}

	public static void pass(String message, boolean isScreenShotNeeded) throws Exception {

		ExtentManager.getExtentTest().log(Status.PASS, message,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
	}

	public static void fail(String message, boolean isScreenShotNeeded) throws Exception {

		ExtentManager.getExtentTest().log(Status.FAIL, message,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());
	}

	public static void skip(String message, boolean isScreenShotNeeded) throws Exception {

		ExtentManager.getExtentTest().log(Status.SKIP,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());

	}

	public static void info(String message, boolean isScreenShotNeeded) throws Exception {

		ExtentManager.getExtentTest().log(Status.INFO, message,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());

	}

	public static void info(List<String> list, boolean isScreenShotNeeded, String message) throws Exception {

		ExtentManager.getExtentTest().log(Status.INFO, message,
				MediaEntityBuilder.createScreenCaptureFromBase64String(getBase64Image()).build());

	}

	public static String getBase64Image() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

}

