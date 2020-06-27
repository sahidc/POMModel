package com.qa.SalesForce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.SalesForce.Base.TestBase;

public class MyNetworkPage extends TestBase{
	@FindBy(xpath="//span[@id='feed-tab-icon']")
	WebElement HomePageLink;
	
	@FindBy(xpath="//span[@id='messaging-tab-icon']")
	WebElement MessaigingPageLink;
	
	@FindBy(xpath="//button[@id='ember690']")
	WebElement PendingInvitation3;
	
	@FindBy(xpath="//button[@id='ember766']")
	WebElement ConnectPeople1;
	
	@FindBy(xpath="//button[@id='ember832']")
	WebElement ConnectPeople2;
	
	@FindBy(xpath="//button[@id='ember892']")
	WebElement ConnectPeople3;
	
	@FindBy(xpath="//*[@id=\"ember695\"]/div/h2")
	WebElement ValidateText;
	
	public MyNetworkPage() {
		PageFactory.initElements(d,this);
	}
	public String validateMyNetworkPageTitle() {
		return d.getTitle();
	}
	public HomePage ClickOnHomePage() {
		HomePageLink.click();
		return new HomePage();
		
	}
	public MessagingPage ClickOnMessgingPage() {
		MessaigingPageLink.click();
		return new MessagingPage();
}
	

}
