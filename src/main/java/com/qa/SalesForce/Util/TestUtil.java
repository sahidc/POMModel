package com.qa.SalesForce.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.SalesForce.Base.TestBase;

public class TestUtil extends TestBase{
public static long Page_Load_Time=20; 
public static long Impicit_wait=30;
public static String ExpectedTitle="LinkedIn Login, Sign in | LinkedIn";
public static String ExpectedHomePageTitle="LinkedIn";
public static String ExpectedMyNetworkPagePageTitle="LinkedIn";
public static String ExpectedMessagingPageTitle="Messaging | LinkedIn";

public static void switchToFrame() {
	d.switchTo().frame(d.findElement(By.xpath("//*[@id=\"ember83\"]/iframe")));
}
public static void takeScreenshotAtEndOfTest() throws IOException {
	File scrFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
}
}
