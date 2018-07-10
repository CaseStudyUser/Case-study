package com.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.base.TestBaseSetup;
import com.selenium.pages.XpathPage;

public class XpathTests extends TestBaseSetup{
	XpathPage xpathPageObj;

	@BeforeClass
	public void setUp() {
		xpathPageObj = new XpathPage(driver);
	}

	@Test(priority = 0)
	public void checkSignUp_OnlyEnteringFirstNameTest() {
		xpathPageObj.checkSignUp_OnlyEnteringFirstName();
		String actualErrMsg = driver.findElement(xpathPageObj.errMsgElemet).getText();
		String expectedErrMsg = xpathPageObj.errorMsg;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}
	
	@Test(priority = 1)
	public void checkSignUp_OnlyEnteringLastNameTest() {
		xpathPageObj.checkSignUp_OnlyEnteringLastName();
		String actualErrMsg = driver.findElement(xpathPageObj.errMsgElemet).getText();
		String expectedErrMsg = xpathPageObj.errorMsg;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}
	
	@Test(priority = 2)
	public void checkSignUp_OnlyEnteringEmailTest() {
		xpathPageObj.checkSignUp_OnlyEnteringEmail();
		String actualErrMsg = driver.findElement(xpathPageObj.errMsgElemet).getText();
		String expectedErrMsg = xpathPageObj.errorMsg;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}
	
	@Test(priority = 3)
	public void checkSignUp_OnlyEnteringPwdTest() {
		xpathPageObj.checkSignUp_OnlyEnteringPwd();
		String actualErrMsg = driver.findElement(xpathPageObj.errMsgElemet).getText();
		String expectedErrMsg = xpathPageObj.errorMsg;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}
	
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}

}
