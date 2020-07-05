package com.qa.SalesForce.Test;

import com.beust.testng.TestNG;
import com.qa.SalesForce.ExtendReport.ExtentReporterNG;

public class RunnerClass {
    @SuppressWarnings("deprecation")
	public static TestNG testng;
	public static void main(String[] args) {
		testng=new  TestNG();
		ExtentReporterNG ext=new ExtentReporterNG();
		testng.setTestClasses(new Class[] {HomePageTest.class});
		testng.addListener(ext);
		testng.run();

	}

}
