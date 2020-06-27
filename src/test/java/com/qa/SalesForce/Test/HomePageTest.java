package com.qa.SalesForce.Test;

import static org.testng.Assert.assertEquals;

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

public class HomePageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	JobPage jobpage;
	MessagingPage messagingPage;
	MyNetworkPage mynetworkpage;
	NotificationPage notificationpage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
    public void setUP() throws InterruptedException {
   	 initialization();
   	  loginPage=new LoginPage();
   	  homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
   	  Thread.sleep(3000);
   	 }
	@Test(priority=1)
	public void varifyHomePageTitleTest() throws InterruptedException {
		String HomePagetitle=homePage.varifyHomePageTitle();
		Assert.assertEquals(HomePagetitle, TestUtil.ExpectedHomePageTitle);
		Thread.sleep(3000);
	}
	@Test(priority=2)
	public void ClickMyNetworkPageTest() throws InterruptedException {
		mynetworkpage=homePage.ClickMyNetworkPage();
		Thread.sleep(3000);
    }
	@Test(priority=3)
    public void ClickOnJobPageTest() throws InterruptedException {
		jobpage=homePage.ClickOnJobPage();
    	Thread.sleep(3000);
    }
	@Test(priority=4)
    public void ClickOnMessgaingPageTest() throws InterruptedException {
		messagingPage=homePage.ClickOnMessagingPage(); 
    	Thread.sleep(3000);
    }
	@Test(priority=5)
    public void ClickOnNotificationPageTest() throws InterruptedException {
		notificationpage=homePage.ClickOnNotificationPage();
    	Thread.sleep(3000);
    }
	
	@AfterMethod
    public void TearDown() {
   	 d.quit();
   	 
    }
}
