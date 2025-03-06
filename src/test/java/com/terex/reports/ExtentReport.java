package com.terex.reports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.terex.factories.DurationCalculation;

public class ExtentReport {
	private ExtentReport() {
	}

	private static ExtentReports extent;
	public static ExtentTest test;

	public static ExtentReports initReports() throws Exception {
		if (Objects.isNull(extent)) {
			extent = new ExtentReports();
			String timestamps = new SimpleDateFormat("hh_mm_ss").format(new Date());
			ExtentSparkReporter spark = new ExtentSparkReporter(
					System.getProperty("user.dir") + "/extent-test-ouput" + "/MP_CPQ_" + timestamps + ".html");
			final File configFile = new File("extentconfig.xml");
			spark.loadXMLConfig(configFile);
			extent.attachReporter(spark);

		}
		return extent;

	}

	public static void flushReports() throws IOException {
		if (Objects.nonNull(extent)) {
			extent.flush();

		}

	}

	public static void createTest(String testCasename) {
		ExtentManager.setExtentTest(extent.createTest(testCasename).assignAuthor("Versha"));

	}

	public static void AssignDevice(String testCasename) {

	}

}

