package com.terex.tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.Status;
import com.terex.reports.ExtentManager;
import com.terex.reports.ExtentReport;
import com.terex.utility.BasePage;
//import com.terex.utility.GetWarningFromBrowser;

public class BaseTests extends BasePage {
	static Logger log;

	protected BaseTests() {

	}

	@BeforeClass
	public void beforeClass() {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		System.setProperty("log4jFileName", timeStamp);
		log = Logger.getLogger(IntegrationScenario.class);
		PropertyConfigurator.configure(
				"C:\\Users\\10731193\\eclipse-workspace\\MPCPQ\\src\\test\\resources\\Config\\log4j.properties");
		String date = new SimpleDateFormat("dd-MM-yy").format(new Date());
		File warningLog = new File(System.getProperty("user.dir") + "\\WarningLogs\\" + date);
		warningLog.mkdir();

	}

//	public static void getWarningLogsFromBrowser(String activityName) throws InterruptedException {
//		Set<String> warninigLogs = GetWarningFromBrowser.warninigLogs();
//		for (String string : warninigLogs) {
//
//			log.warn(activityName + "<br>" + string);
//
//		}
//	}
	@BeforeSuite
	protected void beforeSuite() throws Exception {
		ExtentReport.initReports();

	}

	@AfterSuite
	protected void AfterSuite() throws IOException {
		ExtentReport.flushReports();

	}

	@AfterMethod
	protected void tearDown(ITestResult result) throws Exception {

		if (result.getStatus() == ITestResult.FAILURE) {
			ExtentManager.getExtentTest().log(Status.FAIL, result.getThrowable());
		}
		// driver.quit();
	}
}

