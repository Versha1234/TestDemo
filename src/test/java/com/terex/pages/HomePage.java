package com.terex.pages;

import org.openqa.selenium.By;

import com.terex.reports.ExtentLogger;
import com.terex.utility.BasePage;
import com.terex.utils.WaitStrategy;

public class HomePage extends BasePage{
	private final By home_loc = By.xpath("//a[@title='Home']");
	private final By sales_loc = By.xpath("//a[text()='Sales']");
	private final By opportunity_loc = By.xpath("(//a[text()='Opportunities'])[1]");
	
	public void clickHome() throws Exception {
		ExtentLogger.pass("Clicked on home successfully "+ "<br>"+ jsClick(home_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	
	public void clickSales() throws Exception {
		ExtentLogger.pass("Clicked on Sales successfully "+ "<br>"+ jsClick(sales_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	
	public void clickOpportunity() throws Exception {
		ExtentLogger.pass("Clicked on Opportunity successfully "+ "<br>"+ jsClick(opportunity_loc, WaitStrategy.VISIBLE) + " sec", true );
	}

}
