package com.qa.SalesForce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.SalesForce.Base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//div[contains(text(),'Welcome, Parvej!')]")
	WebElement NameLogo;
	
	@FindBy(xpath="//span[contains(text(),'My Network')]")
	WebElement MyNetworkPage;
	
	@FindBy(xpath="//span[@id='jobs-tab-icon']")
	WebElement JobPage;
	
	@FindBy(xpath="//span[@id='messaging-tab-icon']")
	WebElement MessagingPage;
	
	@FindBy(xpath="//span[@id='notifications-tab-icon']")
	WebElement NotificationPage;
	
	public  HomePage() {
		PageFactory.initElements(d,this);
	}
	public String varifyHomePageTitle() {
		return d.getTitle();
		}
	public MyNetworkPage ClickMyNetworkPage() {
		MyNetworkPage.click();
		return new MyNetworkPage();
	}
	public JobPage ClickOnJobPage() {
		JobPage.click();
		return new JobPage();
	}
	public MessagingPage ClickOnMessagingPage() {
		MessagingPage.click();
		return new MessagingPage();
	}
	public NotificationPage ClickOnNotificationPage() {
		NotificationPage.click();
		return new NotificationPage();
	}
	
	public boolean Getting_Started_Text() {
		return NameLogo.isDisplayed();
	}
	
}
