package com.terex.utility;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.terex.driver.Driver;
import com.terex.driver.DriverManager;

public class GetScreenShot extends Driver {
	static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	static Date date = new Date();
	static String path = null;

	public static String capture() throws IOException {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	}

}
