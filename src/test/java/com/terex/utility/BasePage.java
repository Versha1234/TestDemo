package com.terex.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.terex.factories.DurationCalculation;
import com.terex.factories.ExplicitWaitFactory;
import com.terex.reports.ExtentManager;
import com.terex.reports.ExtentReport;
import com.terex.utils.WaitStrategy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static long startTime;
	public static long endTime;
	public static WebDriver driver;

	public static WebDriver launchBrowser(String browser, String scenarioName) throws Exception {
		if (browser.contains("edge")) {

			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			List<String> listA = Arrays.asList("--disable-web-security", "--disable-web-security");
			Map<String, Object> map = new HashMap<>();
			map.put("args", listA);
			options.setCapability("ms:edgeOptions", map);
			options.setCapability("user_experience_metrics.personalization_data_consent_enabled", true);
	 
			driver = new EdgeDriver(options);
			
			ExtentManager.setExtentTest(ExtentReport.initReports().createTest(scenarioName).assignAuthor("Selva")
					.assignDevice("Edge").assignCategory("DryRun"));

		} else if (browser.contains("chrome")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();  
			Map prefs = new HashMap();  
			prefs.put("profile.default_content_settings.cookies", 2);  
			options.setExperimentalOption("prefs", prefs); 
			driver = new ChromeDriver(options); 
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--disable-web-security");
//			options.addArguments("--block-third-party-cookies");
//			driver = new ChromeDriver(options);
			
			ExtentManager.setExtentTest(ExtentReport.initReports().createTest(scenarioName).assignAuthor("Selva")
					.assignDevice("Chrome").assignCategory("DryRun"));
		}

		driver.manage().window().maximize();
		driver.get("https://fa-epvk-test-saasfaprod1.fa.ocs.oraclecloud.com/fscmUI/redwood/cx-custom/application/container/cpm_action_c/cpm_action_c-list");
		return driver;

	}

	protected boolean checkElementIsDisplayed(By by) {
		boolean displayed = driver.findElement(by).isDisplayed();
		return displayed;

	}

	protected int findelementsSize(By by) {
		int size = driver.findElements(by).size();
		return size;

	}

	protected String clickBy(By by, WaitStrategy waitStrategy) throws Exception {
		startTime = DurationCalculation.getStartTime();
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
		endTime = DurationCalculation.getStartTime();
		String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
		return totalDuration;

	}

	protected String enterValue(By by, WaitStrategy waitStrategy, String value) throws Exception {
		startTime = DurationCalculation.getStartTime();
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
		endTime = DurationCalculation.getStartTime();
		String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
		return totalDuration;

	}

	protected String enterValues(By by, WaitStrategy waitStrategy, String value) throws Exception {
		startTime = DurationCalculation.getStartTime();
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
		endTime = DurationCalculation.getStartTime();
		String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
		return totalDuration;

	}

	protected void clearValueInTextBox(By by, WaitStrategy waitStrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.clear();
	}

	protected void explicitWaitForElementToBeClickable(By by) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(by));

	}

	protected void explicitWaitForElementToBePresent(By by) {
		new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(by));

	}

	protected String getTextValue(By by, WaitStrategy waitStrategy) throws Exception {
		startTime = DurationCalculation.getStartTime();
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		String text = element.getText();
		endTime = DurationCalculation.getStartTime();
		String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
		return "<b><i><u>" + text + "</b></i></u>" + "<br> " + totalDuration;

	}

	protected String jsClick(By by, WaitStrategy waitStrategy) {
		startTime = DurationCalculation.getStartTime();
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			endTime = DurationCalculation.getStartTime();
			String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
			return totalDuration;

		} catch (Exception e) {

			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
			endTime = DurationCalculation.getStartTime();
			String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
			return totalDuration;
		}
	}

	protected String scrollToElement(By by, WaitStrategy waitStrategy) {
		startTime = DurationCalculation.getStartTime();
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			WebElement Element = driver.findElement(element);
			js.executeScript("arguments[0].scrollIntoView();", element);
			endTime = DurationCalculation.getStartTime();
			String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
			return totalDuration;
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
//			WebElement Element = driver.findElement(element);
			js.executeScript("arguments[0].scrollIntoView();", element);
			endTime = DurationCalculation.getStartTime();
			String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
			return totalDuration;
		}
	}
	protected String switchToNewWindow() {
		startTime = DurationCalculation.getStartTime();
//		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		try {
//			JavascriptExecutor js = (JavascriptExecutor) driver;
			Set<String> windowHandles = driver.getWindowHandles();
			for (String windowHandle : windowHandles) {
				if (!windowHandle.isEmpty()) {
					driver.switchTo().window(windowHandle);
				} else {
//					String message="not able to switch to new window in "+screenShotName;
//					log.error(message);
//					Screenshot.addScreenShotToReport(driver, screenShotName, test, message);
					throw new Exception("New window could not be retrieved");
				}
			}
			endTime = DurationCalculation.getStartTime();
			String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
			return totalDuration;
		} catch (Exception e) {
			e.printStackTrace();
			endTime = DurationCalculation.getStartTime();
			String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
			return totalDuration;
		}
	}
	protected List<String> printSelectValues(By by, WaitStrategy waitStrategy) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);

		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		List<String> selOptions = new ArrayList();
		for (WebElement text : options) {

			String option = text.getText();
			selOptions.add(option);

		}

		return selOptions;

	}

	public static String selectElementByPartText(WebElement element, String partText) {
		startTime = DurationCalculation.getStartTime();
		Select select = new Select(element);
		String SelectedOption = null;
		boolean result = false;

		List<WebElement> allFlavourList = select.getOptions();
		for (WebElement option : allFlavourList) {
			String eachOption = option.getText();
			if (eachOption.contains(partText)) {
				select.selectByVisibleText(eachOption);
				SelectedOption = eachOption;
				endTime = DurationCalculation.getStartTime();
				result = true;

			}
		}
		if (result == false) {

			select.selectByIndex(1);
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			SelectedOption = firstSelectedOption.getText() + " as" + partText + " was not present";

		}
		String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
		return SelectedOption + " <br>" + totalDuration + " sec";
	}

	public static String selEleByVisbleText(WebElement selectDropDown, String visbleText) throws Exception {

		// WaitForTheElement(selectDropDown);
		startTime = DurationCalculation.getStartTime();
		Select sel = new Select(selectDropDown);
		sel.selectByVisibleText(visbleText);
		endTime = DurationCalculation.getStartTime();
		String totalDuration = DurationCalculation.totalDuration(startTime, endTime);
		return totalDuration;
	}

	protected void selectValueUsingText() {
		// TODO Auto-generated method stub

	}
}

