package com.terex.factories;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.terex.utility.BasePage;
import com.terex.utils.WaitStrategy;

public class ExplicitWaitFactory extends BasePage {

	public static WebElement performExplicitWait(WaitStrategy waitStrategy, By by) {
		WebElement element = null;
		try {
			if (waitStrategy == WaitStrategy.CLICKABLE) {
				element = new WebDriverWait(driver, 60).until(ExpectedConditions.elementToBeClickable(by));
			} else if (waitStrategy == waitStrategy.PRESENCE) {
				element = new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(by));
			} else if (waitStrategy == waitStrategy.VISIBLE) {
				element = new WebDriverWait(driver, 60).until(ExpectedConditions.visibilityOfElementLocated(by));
			} else if (waitStrategy == waitStrategy.NONE) {
				element = driver.findElement(by);
			}
		} catch (ElementClickInterceptedException e) {
			element = driver.findElement(by);
		}

		return element;
		// TODO Auto-generated method stub

	}

	public static void loadingWait(WebDriver driver, By loader) throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(loader)); // wait for loader to disappear
	}

}

