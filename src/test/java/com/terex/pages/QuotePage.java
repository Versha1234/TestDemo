package com.terex.pages;

import org.openqa.selenium.By;

import com.terex.reports.ExtentLogger;
import com.terex.utility.BasePage;
import com.terex.utils.WaitStrategy;

public class QuotePage extends BasePage{
	private final By model_loc=By.xpath("(//span[text()='Configure a New Model'])[1]");
	private final By modelName_loc=By.xpath("//a[text()='AT40']");
	private final By update_loc=By.xpath("//span[text()='Update']");
	private final By ref_loc=By.xpath("//td[text()='REFLECTIVE TAPE OPTION']");
	private final By selectRef_loc=By.xpath("//input[@value='REFLECTIVE TAPE YELLOW']");
	private final By addToQuote_loc=By.xpath("//span[text()=' Add to Quote']");
	private final By customerTab_loc=By.xpath("//span[text()='Customer Information']");
	private final By incotermMethod_loc=By.xpath("//input[@id='oj-searchselect-filter-MP_shippingMethods_t|input']");
	private final By selectIncotermMethod_loc=By.xpath("//span[text()='FCA (Incoterms 2020)']");
	private final By incotermAddress_loc=By.xpath("//input[@id='MP_shipFromAddress_t|input']");
	private final By selectIncotermAddress_loc=By.xpath("//span[text()='FCA TEREX BRISBANE EAGLE FARM']");
	private final By save_loc=By.xpath("//span[text()='Save']");
	private final By approvalTab_loc=By.xpath("//span[text()='Approval & Document Generation']");
	private final By submitForApproval_loc=By.xpath("//span[text()='Submit for Approval']");
	private final By abn_loc=By.xpath("//input[@id='MP_aBNNumber_t|input']");
	private final By generateProposal_loc=By.xpath("//span[text()='Generate Proposal']");
	private final By sentToCustomer_loc=By.xpath("(//span[text()='Sent to Customer'])[2]");
	private final By accepted_loc=By.xpath("(//span[text()='Accepted by Customer'])[2]");
	private final By salesOrderNo_loc=By.xpath("//input[@id='MP_salesOrderNumber_c|input']");
	private final By salesOrder_loc=By.xpath("//span[text()='Sales Order']");
	private final By returnToOpportunity_loc=By.xpath("//span[text()='Return To Opportunity']");
	private final By model1_loc=By.xpath("//a[text()='TRT 90']");
	private final By model2_loc=By.xpath("//a[text()='P50']");
//	private final By view_loc=By.xpath("(//span[@class='oj-button-icon oj-end oj-component-icon oj-button-menu-dropdown-icon'])[4]");
//	private final By expand_loc=By.xpath("//span[text()='Expand All']");
	private final By rejected_loc=By.xpath("//span[text()='Rejected by customer']");
	private final By rejectionReason_loc=By.xpath("(//a[@class='oj-searchselect-arrow oj-searchselect-open-icon oj-searchselect-icon oj-component-icon oj-clickable-icon-nocontext'])[5]");
	private final By selectRejectionReason_loc=By.xpath("//span[text()='Configuration']");
	private final By submitForSOA_loc=By.xpath("//span[text()='Submit for SOA Approval']");
	private final By sentToProduction_loc=By.xpath("//span[text()='Send to Production']");
	
	public void clickConfigureModel() throws Exception {
		ExtentLogger.pass("Clicked on Configure a New Model successfully "+ "<br>"+ clickBy(model_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void selectModel() throws Exception {
		ExtentLogger.pass("Selected Model successfully "+ "<br>"+ clickBy(modelName_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void selectModel1() throws Exception {
		ExtentLogger.pass("Selected Model successfully "+ "<br>"+ clickBy(model1_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void selectModel2() throws Exception {
		ExtentLogger.pass("Selected Model successfully "+ "<br>"+ clickBy(model2_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(10000);
	}
	public void clickReflectiveTape() throws Exception {
		ExtentLogger.pass("Scrolled to Reflective Tape Option successfully "+ "<br>"+ scrollToElement(ref_loc, WaitStrategy.VISIBLE) + " sec", true );
		ExtentLogger.pass("Clicked on Reflective Tape Option successfully "+ "<br>"+ clickBy(ref_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void selectReflectiveTape() throws Exception {
		ExtentLogger.pass("Selected Reflective Tape successfully "+ "<br>"+ clickBy(selectRef_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void clickUpdate() throws Exception {
		ExtentLogger.pass("Clicked on Update successfully "+ "<br>"+ clickBy(update_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
	}
	public void clickAddToQuote() throws Exception {
		ExtentLogger.pass("Clicked on Add to Quote successfully "+ "<br>"+ clickBy(addToQuote_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void clickCustomerInfo() throws Exception {
		ExtentLogger.pass("Clicked on customer information tab successfully "+ "<br>"+ clickBy(customerTab_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void selectIncotermMethods() throws Exception {
		ExtentLogger.pass("Clicked on Incoterm Methods successfully "+ "<br>"+ clickBy(incotermMethod_loc, WaitStrategy.VISIBLE) + " sec", true );
		ExtentLogger.pass("Selected Incoterm Methods successfully "+ "<br>"+ clickBy(selectIncotermMethod_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void selectIncotermAddress() throws Exception {
		ExtentLogger.pass("Clicked on Incoterm Address successfully "+ "<br>"+ clickBy(incotermAddress_loc, WaitStrategy.VISIBLE) + " sec", true );
		ExtentLogger.pass("Selected Incoterm Address successfully "+ "<br>"+ clickBy(selectIncotermAddress_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void clickSave() throws Exception {
		ExtentLogger.pass("Clicked on Save successfully "+ "<br>"+ clickBy(save_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(4000);
	}
	public void clickApprovalTab() throws Exception {
		ExtentLogger.pass("Clicked on Approval & Document Generation tab successfully "+ "<br>"+ clickBy(approvalTab_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void clickSubmitForApproval() throws Exception {
		ExtentLogger.pass("Clicked on Submit for approval successfully "+ "<br>"+ clickBy(submitForApproval_loc, WaitStrategy.VISIBLE) + " sec", true );
	}
	public void clickSubmitForSOAApproval() throws Exception {
		ExtentLogger.pass("Clicked on Submit for SOA approval successfully "+ "<br>"+ clickBy(submitForSOA_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(25000);
	}
	public void clickSentToProduction() throws Exception {
		ExtentLogger.pass("Clicked on Sent To Production successfully "+ "<br>"+ clickBy(sentToProduction_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(5000);
	}
	public void enterABN(String abnNo) throws Exception {
		ExtentLogger.pass("Entered ABN number successfully "+ "<br>"+ enterValues(abn_loc, WaitStrategy.VISIBLE,abnNo) + " sec", true );
		Thread.sleep(2000);
	}
	public void clickGenerateProposal() throws Exception {
		ExtentLogger.pass("Clicked on Generate Proposal successfully "+ "<br>"+ clickBy(generateProposal_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(7000);
	}
	public void clickSentToCustomer() throws Exception {
		ExtentLogger.pass("Clicked on Sent To Customer successfully "+ "<br>"+ clickBy(sentToCustomer_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(25000);
	}
	public void clickAcceptedByCustomer() throws Exception {
		ExtentLogger.pass("Clicked on Accepted By Customer successfully "+ "<br>"+ clickBy(accepted_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(7000);
	}
	public void enterSalesOrderNo(String SalesOrderNo) throws Exception {
		ExtentLogger.pass("Entered Sales Order Number successfully "+ "<br>"+ enterValues(salesOrderNo_loc, WaitStrategy.VISIBLE,SalesOrderNo) + " sec", true );
		Thread.sleep(2000);
	}
	public void clickSalesOrder() throws Exception {
		ExtentLogger.pass("Clicked on Sales Order successfully "+ "<br>"+ clickBy(salesOrder_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(3000);
	}
	public void clickRejectedByCustomer() throws Exception {
		ExtentLogger.pass("Clicked on Rejected By Customer successfully "+ "<br>"+ clickBy(rejected_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(2000);
	}
	public void selectRejectedReason() throws Exception {
//		ExtentLogger.pass("Clicked on Rejected Reason successfully "+ "<br>"+ clickBy(rejectionReason_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(2000);
		ExtentLogger.pass("Selected Rejected Reason successfully "+ "<br>"+ clickBy(selectRejectionReason_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(2000);
	}
	public void clickReturnToOpp() throws Exception {
		ExtentLogger.pass("Clicked on Return to opportunity successfully "+ "<br>"+ clickBy(returnToOpportunity_loc, WaitStrategy.VISIBLE) + " sec", true );
		Thread.sleep(70000);
	}
	
	

}
