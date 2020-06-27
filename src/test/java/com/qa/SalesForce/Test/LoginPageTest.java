package com.qa.SalesForce.Test;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.SalesForce.Base.TestBase;
import com.qa.SalesForce.Pages.HomePage;
import com.qa.SalesForce.Pages.LoginPage;
import com.qa.SalesForce.Util.TestUtil;
import com.qa.SalesForce.Util.TestUtil1;


public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
     @BeforeMethod
     public void setUP() {
    	 initialization();
    	  loginPage=new LoginPage();
    	 }
    @Test(priority=1)
     public void  validateLoginPageTitleTest() {
    	String Title= loginPage.validateLoginPageTitle();
    	Assert.assertEquals(Title, TestUtil.ExpectedTitle);
     }
    @Test(priority=2)

     public void validateLogoTest() {
    	boolean flag= loginPage.validateLogo();
    	Assert.assertTrue(flag);
     }
    @Test(priority=3)

     public void loginTest() {
    	 homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
     }
     @AfterMethod
     public void TearDown() {
    	 d.quit();
    	 
     }
     @DataProvider
 	public Iterator<Object[]>  myTestData(){
 		ArrayList<Object[]> data=TestUtil1.getDataFromExcel();
 		return data.iterator();
 		}
     @Test(priority=4,dataProvider="myTestData")
     public void DataDrivenTest(String UserId,String Password)throws InterruptedException  {
    	 loginPage.DataDriven();
    	 d.findElement(By.xpath("//input[@id='email-or-phone']")).sendKeys(UserId);
    	 Thread.sleep(3000);
    	 d.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
    	 Thread.sleep(3000);
         d.findElement(By.xpath("//button[@id='join-form-submit']")).click();
   	     Thread.sleep(3000);

     }
     
}
