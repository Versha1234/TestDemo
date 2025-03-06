package com.terex.tests;

import java.util.Map;

import org.testng.annotations.Test;

import com.terex.pages.EditOpportunityPage;
import com.terex.pages.HomePage;
import com.terex.pages.LoginPage;
import com.terex.pages.OpportunityPage;
import com.terex.pages.QuotePage;
import com.terex.utils.DataProviderUtils;

public class IntegrationScenario  extends BaseTests{
	@Test(dataProvider = "getData", dataProviderClass = DataProviderUtils.class, description = "End to End Quote Creation")
	public void EndToEndQuoteCreation(Map<String, String> map) throws Exception {

		launchBrowser(map.get("browser"), map.get("scenarioName"));
		LoginPage loginPage = new LoginPage();
		HomePage homePage=new HomePage();
		OpportunityPage opportunityPage=new OpportunityPage();
		EditOpportunityPage editOpportunity=new EditOpportunityPage();
		QuotePage quotePage=new QuotePage();

		// LoginPage
		loginPage.clickSSO();
		loginPage.enterUserName(map.get("strUsername"));
		loginPage.enterPassword(map.get("strPassword"));
		loginPage.clickSignIn();
		
		//homePage
		homePage.clickHome();
		homePage.clickSales();
		homePage.clickOpportunity();
		
		//opportunityPage
		opportunityPage.clickCreateOpportunity();
		opportunityPage.enterAccount(map.get("Account"));
		opportunityPage.enterOpportunityName(map.get("Description"));
		opportunityPage.enterIndustry();
		opportunityPage.enterOpportunityType();
		opportunityPage.enterBrand();
		opportunityPage.selectDate();
		opportunityPage.enterDeal();
		opportunityPage.clickCreate();
		
		//editOpportunity
		editOpportunity.searchCreateQuote(map.get("SearchType"));
		
		//quotePage
		quotePage.clickConfigureModel();
		quotePage.selectModel();
		quotePage.clickReflectiveTape();
//		quotePage.selectReflectiveTape();
		quotePage.clickUpdate();
		quotePage.clickAddToQuote();
		quotePage.clickCustomerInfo();
		quotePage.selectIncotermMethods();
		quotePage.selectIncotermAddress();
		quotePage.clickSave();
		quotePage.clickApprovalTab();
		quotePage.clickSubmitForApproval();
		quotePage.clickCustomerInfo();
		quotePage.enterABN(map.get("SalesOrderNumber"));
		quotePage.clickApprovalTab();
		quotePage.clickGenerateProposal();
		quotePage.clickSentToCustomer();
		quotePage.clickAcceptedByCustomer();
		quotePage.enterSalesOrderNo(map.get("SalesOrderNumber"));
		quotePage.clickSalesOrder();
		quotePage.clickReturnToOpp();
		
		//editOpportunity
//		editOpportunity.viewQuote();
	}
	@Test(dataProvider = "getData", dataProviderClass = DataProviderUtils.class, description = "End to End Quote Creation")
	public void EndToEndQuoteCreationForRTCranes(Map<String, String> map) throws Exception {

		launchBrowser(map.get("browser"), map.get("scenarioName"));
		LoginPage loginPage = new LoginPage();
		HomePage homePage=new HomePage();
		OpportunityPage opportunityPage=new OpportunityPage();
		EditOpportunityPage editOpportunity=new EditOpportunityPage();
		QuotePage quotePage=new QuotePage();

		// LoginPage
		loginPage.clickSSO();
		loginPage.enterUserName(map.get("strUsername"));
		loginPage.enterPassword(map.get("strPassword"));
		loginPage.clickSignIn();
		
		//homePage
		homePage.clickHome();
		homePage.clickSales();
		homePage.clickOpportunity();
		
		//opportunityPage
		opportunityPage.clickCreateOpportunity();
		opportunityPage.enterAccount(map.get("Account"));
		opportunityPage.enterOpportunityName(map.get("Description"));
		opportunityPage.enterIndustry();
		opportunityPage.enterOpportunityType();
		opportunityPage.enterBrand1();
		opportunityPage.selectDate();
		opportunityPage.enterDeal();
		opportunityPage.clickCreate();
		
		//editOpportunity
		editOpportunity.searchCreateQuote(map.get("SearchType"));
		
		//quotePage
		quotePage.clickConfigureModel();
		quotePage.selectModel1();
		quotePage.clickUpdate();
		quotePage.clickAddToQuote();
		quotePage.clickSave();
		quotePage.clickApprovalTab();
		quotePage.clickGenerateProposal();
		quotePage.clickSentToCustomer();
		quotePage.clickAcceptedByCustomer();
		quotePage.enterSalesOrderNo(map.get("SalesOrderNumber"));
		quotePage.clickSalesOrder();
		quotePage.clickReturnToOpp();
		
		//editOpportunity
		editOpportunity.viewQuote();
	}
	@Test(dataProvider = "getData", dataProviderClass = DataProviderUtils.class, description = "End to End Quote Creation")
	public void EndToEndQuoteCreationForRTCranesRejected(Map<String, String> map) throws Exception {

		launchBrowser(map.get("browser"), map.get("scenarioName"));
		LoginPage loginPage = new LoginPage();
		HomePage homePage=new HomePage();
		OpportunityPage opportunityPage=new OpportunityPage();
		EditOpportunityPage editOpportunity=new EditOpportunityPage();
		QuotePage quotePage=new QuotePage();

		// LoginPage
		loginPage.clickSSO();
		loginPage.enterUserName(map.get("strUsername"));
		loginPage.enterPassword(map.get("strPassword"));
		loginPage.clickSignIn();
		
		//homePage
		homePage.clickHome();
		homePage.clickSales();
		homePage.clickOpportunity();
		
		//opportunityPage
		opportunityPage.clickCreateOpportunity();
		opportunityPage.enterAccount(map.get("Account"));
		opportunityPage.enterOpportunityName(map.get("Description"));
		opportunityPage.enterIndustry();
		opportunityPage.enterOpportunityType();
		opportunityPage.enterBrand1();
		opportunityPage.selectDate();
		opportunityPage.enterDeal();
		opportunityPage.clickCreate();
		
		//editOpportunity
		editOpportunity.searchCreateQuote(map.get("SearchType"));
		
		//quotePage
		quotePage.clickConfigureModel();
		quotePage.selectModel1();
		quotePage.clickUpdate();
		quotePage.clickAddToQuote();
		quotePage.clickSave();
		quotePage.clickApprovalTab();
		quotePage.clickGenerateProposal();
		quotePage.clickSentToCustomer();
		quotePage.clickRejectedByCustomer();
		quotePage.selectRejectedReason();
		quotePage.clickRejectedByCustomer();
		quotePage.clickReturnToOpp();
		
		//editOpportunity
		editOpportunity.viewQuote();
	}
	@Test(dataProvider = "getData", dataProviderClass = DataProviderUtils.class, description = "End to End Quote Creation")
	public void EndToEndQuoteCreationForProAll(Map<String, String> map) throws Exception {

		launchBrowser(map.get("browser"), map.get("scenarioName"));
		LoginPage loginPage = new LoginPage();
		HomePage homePage=new HomePage();
		OpportunityPage opportunityPage=new OpportunityPage();
		EditOpportunityPage editOpportunity=new EditOpportunityPage();
		QuotePage quotePage=new QuotePage();

		// LoginPage
		loginPage.clickSSO();
		loginPage.enterUserName(map.get("strUsername"));
		loginPage.enterPassword(map.get("strPassword"));
		loginPage.clickSignIn();
		
		//homePage
		homePage.clickHome();
		homePage.clickSales();
		homePage.clickOpportunity();
		
		//opportunityPage
		opportunityPage.clickCreateOpportunity();
		opportunityPage.enterAccount(map.get("Account"));
		opportunityPage.enterOpportunityName(map.get("Description"));
		opportunityPage.enterIndustry();
		opportunityPage.enterOpportunityType();
		opportunityPage.enterBrand2();
		opportunityPage.selectDate();
		opportunityPage.enterDeal();
		opportunityPage.clickCreate();
		
		//editOpportunity
		editOpportunity.searchCreateQuote(map.get("SearchType"));
		
		//quotePage
		quotePage.clickConfigureModel();
		quotePage.selectModel2();
		quotePage.clickUpdate();
		quotePage.clickAddToQuote();
		quotePage.clickSave();
		quotePage.clickApprovalTab();
		quotePage.clickSubmitForApproval();
		quotePage.clickGenerateProposal();
		quotePage.clickSentToCustomer();
		quotePage.clickAcceptedByCustomer();
		quotePage.clickSubmitForSOAApproval();
		quotePage.clickSentToProduction();
		quotePage.enterSalesOrderNo(map.get("SalesOrderNumber"));
		quotePage.clickSalesOrder();
		quotePage.clickReturnToOpp();
		
		//editOpportunity
		editOpportunity.viewQuote();
	}


}
