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

}
