package com.qa.SalesForce.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.SalesForce.Base.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath="//input[@id='username']")
	WebElement username;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	WebElement SignIN;
	@FindBy(xpath="//a[contains(text(),'Join now')]")
	WebElement SignUp;
	@FindBy(xpath="//h1[contains(text(),'Welcome Back')]")
	WebElement WelcomeBackText;
	public LoginPage() {
		PageFactory.initElements(d, this);
	}
	public String validateLoginPageTitle() {
		return d.getTitle();
	}
	public boolean validateLogo() {
		 return WelcomeBackText.isDisplayed();	
	}
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		SignIN.click();
		return new HomePage();
	}
	public void DataDriven() {
		SignUp.click();
	}
}
