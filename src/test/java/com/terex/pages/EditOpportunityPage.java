package com.terex.pages;

import org.openqa.selenium.By;

import com.terex.reports.ExtentLogger;
import com.terex.utility.BasePage;
import com.terex.utils.WaitStrategy;

public class EditOpportunityPage extends BasePage{
	private final By searchBar_loc=By.xpath("//input[@aria-label='Action bar  type a query or use the arrows to choose a suggested item.What would you like to do?']");
	private final By createQuote_loc=By.xpath("(//strong[text()='Create / Edit CPQ Quote'])[1]");
	private final By viewQuote_loc=By.xpath("//a[@title='View All Quotes (1)']");
	private final By QuoteId_loc=By.xpath("//div[text()='Quote ID']");
	
	public void searchCreateQuote(String searchType) throws Exception {
		ExtentLogger.pass("Clicked on search bar successfully "+ "<br>"+ clickBy(searchBar_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Entered Create/Edit CPQ Quote successfully "+ "<br>" + enterValues(searchBar_loc, WaitStrategy.VISIBLE,searchType)+ " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Clicked on Create/Edit CPQ Quote successfully "+ "<br>"+ jsClick(createQuote_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(15000);
	} 
	public void viewQuote() throws Exception  { 
		ExtentLogger.pass("scroll to Quote successfully "+ "<br>"+ scrollToElement(viewQuote_loc, WaitStrategy.VISIBLE) + " sec", true);
		Thread.sleep(2000);
		ExtentLogger.pass("Clicked on View All Quotes successfully "+ "<br>"+ clickBy(viewQuote_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
		ExtentLogger.pass("Validate Quote ID successfully "+ "<br>"+ clickBy(QuoteId_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
	}

}
