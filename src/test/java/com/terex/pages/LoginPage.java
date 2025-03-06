package com.terex.pages;

import org.openqa.selenium.By;

import com.terex.reports.ExtentLogger;
import com.terex.utils.WaitStrategy;
import com.terex.utility.BasePage;

public class LoginPage extends BasePage{

	private final By sso_loc=By.xpath("//button[contains(text(),'Company Single Sign-On')]");
	private final By username_loc=By.xpath("//input[@id='idcs-signin-basic-signin-form-username']");
	private final By password_loc=By.xpath("//input[@id='idcs-signin-basic-signin-form-password|input']");
	private final By signIn_loc=By.xpath("//span[text()='Sign In']");
	
	
	public void clickSSO() throws Exception {
		ExtentLogger.pass("Clicked on company single sign on successfully "+ "<br>"+ jsClick(sso_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void enterUserName(String username) throws Exception {
		ExtentLogger.pass("Entered username successfully "+ "<br>" + enterValues(username_loc, WaitStrategy.VISIBLE,username)+ " sec", true );
	}
	public void enterPassword(String password) throws Exception {
		ExtentLogger.pass("Entered password successfully "+ "<br>" + enterValues(password_loc, WaitStrategy.VISIBLE,password)+ " sec", true );
	}
	public void clickSignIn() throws Exception {
		ExtentLogger.pass("Clicked on Sign In successfully "+ "<br>"+ jsClick(signIn_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
}

