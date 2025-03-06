package com.terex.pages;

import org.openqa.selenium.By;

import com.terex.reports.ExtentLogger;
import com.terex.utility.BasePage;
import com.terex.utils.WaitStrategy;

public class OpportunityPage extends BasePage{
	private final By createOppportunity_loc = By.xpath("(//span[text()='Create Opportunity'])[1]");
	private final By opportunityName_loc=By.xpath("(//input[@type='text'])[4]");
	private final By Account_loc=By.xpath("(//input[@role='combobox'])[3]");
	private final By industry_loc=By.xpath("(//input[@role='combobox'])[7]");
	private final By opportunityType_loc=By.xpath("(//input[@role='combobox'])[9]");
//	private final By type_loc=By.xpath("(//input[@role='combobox'])[7]");
	private final By brand_loc=By.xpath("(//input[@role='combobox'])[15]");
	private final By calender_loc=By.xpath("(//span[@title='Select Date.'])[2]");
	private final By date_loc=By.xpath("//a[text()='26']");
	private final By arrow_loc=By.xpath("//a[@aria-label='Next']");
	private final By dealLikelihood_loc=By.xpath("(//input[@role='combobox'])[25]");
	private final By accountValue_loc=By.xpath("(//div[text()='BOOM LOGISTICS LTD'])[1]");
	private final By brandValue_loc=By.xpath("(//span[text()='Franna'])[1]");
	private final By valueDeal_loc=By.xpath("(//span[text()='10'])[1]");
	private final By opportunityTypeValue_loc=By.xpath("//span[text()='Dealer Stock']");
	private final By industryValue_loc=By.xpath("//span[text()='Agriculture']");
	private final By create_loc=By.xpath("(//span[text()='Create'])[1]");
	private final By brandValue1_loc=By.xpath("//span[text()='RT Cranes']");
	private final By brandValue2_loc=By.xpath("//span[text()='ProAll']");
	
	public void clickCreateOpportunity() throws Exception {
		ExtentLogger.pass("Clicked on Create Opportunity successfully "+ "<br>"+ jsClick(createOppportunity_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(7000);
	}
	
	public void enterOpportunityName(String oppName) throws Exception {
//		ExtentLogger.pass("Clicked on Opportunity Name successfully "+ "<br>"+ clickBy(opportunityName_loc, WaitStrategy.VISIBLE) + " sec", true );
//		Thread.sleep(5000);
		ExtentLogger.pass("Entered Opportunity Name successfully "+ "<br>" + enterValues(opportunityName_loc, WaitStrategy.VISIBLE,oppName)+ " sec", true );
		Thread.sleep(3000);
	}

	public void enterAccount(String account) throws Exception {
		ExtentLogger.pass("Clicked on Account successfully "+ "<br>"+ clickBy(Account_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(7000);
//		ExtentLogger.pass("Entered Account successfully "+ "<br>" + enterValues(Account_loc, WaitStrategy.VISIBLE,account)+ " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Clicked on Account value successfully "+ "<br>"+ jsClick(accountValue_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(7000);
	}
	
	public void enterBrand() throws Exception {
		ExtentLogger.pass("scroll to brand button successfully "+ "<br>"+ scrollToElement(brand_loc, WaitStrategy.VISIBLE) + " sec", true);
		Thread.sleep(2000);
		ExtentLogger.pass("Clicked on brand successfully "+ "<br>"+ clickBy(brand_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Selected brand successfully "+ "<br>"+ clickBy(brandValue_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(5000);
	}
   public void enterIndustry() throws Exception {
		ExtentLogger.pass("Clicked on Industry successfully "+ "<br>"+ clickBy(industry_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Selected Industry successfully "+ "<br>"+ jsClick(industryValue_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
	}
	
	public void enterDeal() throws Exception  {
		ExtentLogger.pass("scroll to deal button successfully "+ "<br>"+ scrollToElement(dealLikelihood_loc, WaitStrategy.VISIBLE) + " sec", true);
		Thread.sleep(2000);
		ExtentLogger.pass("Clicked on Deal successfully "+ "<br>"+ clickBy(dealLikelihood_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Selected Deal successfully "+ "<br>"+ jsClick(valueDeal_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
	}
	
	public void enterOpportunityType() throws Exception  {
		ExtentLogger.pass("Clicked on opportunity type successfully "+ "<br>"+ clickBy(opportunityType_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Selected opportunity type successfully "+ "<br>"+ jsClick(opportunityTypeValue_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(5000);
	}
	public void selectDate() throws Exception  {
		ExtentLogger.pass("Clicked on calendar successfully "+ "<br>"+ clickBy(calender_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(2000);
		ExtentLogger.pass("Clicked on next successfully "+ "<br>"+ clickBy(arrow_loc, WaitStrategy.VISIBLE) + " sec", true );
		ExtentLogger.pass("Clicked on next successfully "+ "<br>"+ clickBy(arrow_loc, WaitStrategy.VISIBLE) + " sec", true );
		ExtentLogger.pass("Clicked on next successfully "+ "<br>"+ clickBy(arrow_loc, WaitStrategy.VISIBLE) + " sec", true );
		ExtentLogger.pass("Clicked on next successfully "+ "<br>"+ clickBy(arrow_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(2000);
		ExtentLogger.pass("Selected date successfully "+ "<br>"+ clickBy(date_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(5000);
	}
	public void enterBrand1() throws Exception {
		ExtentLogger.pass("scroll to brand button successfully "+ "<br>"+ scrollToElement(brand_loc, WaitStrategy.VISIBLE) + " sec", true);
		Thread.sleep(2000);
		ExtentLogger.pass("Clicked on brand successfully "+ "<br>"+ clickBy(brand_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Selected brand successfully "+ "<br>"+ clickBy(brandValue1_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(5000);
	}
	public void enterBrand2() throws Exception {
		ExtentLogger.pass("scroll to brand button successfully "+ "<br>"+ scrollToElement(brand_loc, WaitStrategy.VISIBLE) + " sec", true);
		Thread.sleep(2000);
		ExtentLogger.pass("Clicked on brand successfully "+ "<br>"+ clickBy(brand_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Selected brand successfully "+ "<br>"+ clickBy(brandValue2_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(5000);
	}

	public void clickCreate() throws Exception{
//		ExtentLogger.pass("scroll to create button successfully "+ "<br>"+ scrollToElement(create_loc, WaitStrategy.VISIBLE) + " sec", true);
//		
		ExtentLogger.pass("Clicked on Create successfully "+ "<br>"+ clickBy(create_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(20000);
//		ExtentLogger.pass("Clicked on Create successfully "+ "<br>"+ jsClick(create_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
}
