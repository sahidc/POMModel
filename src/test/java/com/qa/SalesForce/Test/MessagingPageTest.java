package com.qa.SalesForce.Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.SalesForce.Base.TestBase;
import com.qa.SalesForce.Pages.HomePage;
import com.qa.SalesForce.Pages.JobPage;
import com.qa.SalesForce.Pages.LoginPage;
import com.qa.SalesForce.Pages.MessagingPage;
import com.qa.SalesForce.Pages.MyNetworkPage;
import com.qa.SalesForce.Pages.NotificationPage;
import com.qa.SalesForce.Util.TestUtil;

public class MessagingPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	JobPage jobpage;
	MessagingPage messagingPage;
	MyNetworkPage mynetworkpage;
	NotificationPage notificationpage;
	
	public MessagingPageTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage=new LoginPage();
		messagingPage=new MessagingPage();
		homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		homePage.ClickOnMessagingPage();
	   	Thread.sleep(3000);
	}
	@AfterMethod
	public void TearDown() {
		d.quit();
	}
	@Test(priority=2)
	public void ValidateTitleTest() {
		String Title=messagingPage.validateTitle();
		Assert.assertEquals(Title,TestUtil.ExpectedMessagingPageTitle);
	}
	@Test(priority=1)
	public void ClickOnMyNetworkPageTest() {
		messagingPage.ClickOnMyNetworkPage();
	}
	@Test(priority=3)
	public void ClickOnNotificationPage() {
		messagingPage.ClickOnNotificationPage();
	}
	
}
