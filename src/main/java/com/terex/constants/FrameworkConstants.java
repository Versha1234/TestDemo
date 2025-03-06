package com.terex.constants;

import com.terex.utils.ConfigProperties;
import com.terex.utils.ReadPropertyFile;

public class FrameworkConstants {

	public static final String configFilePath = System.getProperty("user.dir")
			+ "/src/test/resources/Config/config.properties";
	public static final String ExtentReportPath = System.getProperty("user.dir") + "/extent-test-ouput";
	public static String extentReportFilePath = "";

	public static String getConfigfilepath() {
		return configFilePath;
	}

	public static String getExtentreportpath() throws Exception {

		if (extentReportFilePath.isEmpty()) {
			extentReportFilePath = createReportPath();
		}
		return extentReportFilePath;

	}

	private static String createReportPath() throws Exception {
		if (ReadPropertyFile.get(ConfigProperties.OVERRIDEREPORTS).equalsIgnoreCase("no")) {
			return ExtentReportPath + System.currentTimeMillis() + "/index.html";
		} else {
			return ExtentReportPath + "/index.html";

		}

	}

}
