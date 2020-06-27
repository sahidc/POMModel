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

public class MyNetWorkPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	JobPage jobpage;
	TestUtil testUtil;
	MessagingPage messagingPage;
	MyNetworkPage mynetworkpage;
	NotificationPage notificationpage;
	
	public MyNetWorkPageTest() {
		super();
	}
	@BeforeMethod
    public void setUP() throws InterruptedException {
   	 initialization();
   	  loginPage=new LoginPage();
      mynetworkpage= new MyNetworkPage();
   	  homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
   	  homePage.ClickMyNetworkPage();
   	  Thread.sleep(3000);
   	 }
	@AfterMethod
    public void TearDown() {
   	 d.quit();
   	 
    }
	@Test(priority=1)
	public void validateMyNetworkPageTitleTest() {
		String Title3=mynetworkpage.validateMyNetworkPageTitle();
		Assert.assertEquals(Title3, TestUtil.ExpectedMyNetworkPagePageTitle);
	}
	@Test(priority=2)
	public void clickOnHomePageTest() {
		homePage=mynetworkpage.ClickOnHomePage();
		
	}
	@Test(priority=3)
	public void clickOnMessgingPageTest() {
		
		messagingPage=mynetworkpage.ClickOnMessgingPage();
		
	}

}
