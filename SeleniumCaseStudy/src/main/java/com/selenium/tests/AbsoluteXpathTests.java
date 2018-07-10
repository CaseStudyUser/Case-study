package com.selenium.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.base.TestBaseSetup;
import com.selenium.pages.AbsoluteXpathPages;

public class AbsoluteXpathTests extends TestBaseSetup {
	AbsoluteXpathPages xpathPageObj;

	@BeforeClass
	public void setUp() {
		xpathPageObj = new AbsoluteXpathPages(driver);
	}

	@Test(priority = 0)
	public void checkSignUp_EnteringMobileNumberAsInvalidFormatTest() {
		xpathPageObj.checkSignUp_EnteringMobileNumberAsInvalidFormat();
		String actualErrMsg = driver.findElement(xpathPageObj.errMsgElementForInvalidMobileNumber).getText();
		String expectedErrMsg = xpathPageObj.errorMsg;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}

	@Test(priority = 1)
	public void checkSignUp_EnteringPwdAsEmptyTest() {
		xpathPageObj.checkSignUp_EnteringPwdAsEmpty();
		String actualErrMsg = driver.findElement(xpathPageObj.errMsgElementForInvalidPwdCombination).getText();
		String expectedErrMsg = xpathPageObj.errMsgForInvalidPwdCombination;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}

	@Test(priority = 2)
	public void checkSignUp_EnteringPwdAsInvalidCombinationTest() {
		xpathPageObj.checkSignUp_EnteringPwdAsInvalidCombination();
		String actualErrMsg = driver.findElement(xpathPageObj.errMsgElementForInvalidPwdCombination).getText();
		String expectedErrMsg = xpathPageObj.errMsgForInvalidPwdCombination;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}
	
	@Test(priority = 4)
	public void closeBrowser() {
		driver.quit();
	}
}
