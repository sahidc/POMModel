package com.qa.SalesForce.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.qa.SalesForce.Util.TestUtil;
import com.qa.SalesForce.Util.WebEventListener;

public class TestBase {
	public static WebDriver d;
    public static Properties prop;
    public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\Mashuda\\eclipse-workspace\\SeleniumProject\\APIToolsTest\\src\\main\\java\\com\\qa\\SalesForce\\config\\config.properties");
			prop.load(fis);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void initialization() {
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
	        d=new ChromeDriver();}
	        else if(browser.equals("Firefox")){
	        	System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	            d=new FirefoxDriver();
	        }
		e_driver = new EventFiringWebDriver(d);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		d = e_driver;
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.manage().timeouts().implicitlyWait(TestUtil.Impicit_wait, TimeUnit.SECONDS);
		d.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_Time, TimeUnit.SECONDS);
		d.get(prop.getProperty("url"));
		}
		
	}


