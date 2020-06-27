package com.qa.SalesForce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.SalesForce.Base.TestBase;

public class MessagingPage extends TestBase {
	@FindBy(xpath="//span[contains(text(),'My Network')]")
	WebElement MyNetworkPageLink;
	
	@FindBy(xpath="//span[contains(text(),'Notifications')]")
	WebElement NotificationPageLink;
	
  public  MessagingPage() {
	  PageFactory.initElements(d,this);
  }
  
  public MyNetworkPage ClickOnMyNetworkPage() {
	  MyNetworkPageLink.click();
	  return new MyNetworkPage();
  }
  public NotificationPage ClickOnNotificationPage() {
	  NotificationPageLink.click();
	  return new NotificationPage();
  }
  public String validateTitle() {
	 return d.getTitle();
	
  }


}
