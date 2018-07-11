package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.base.TestBaseSetup;
import com.selenium.pages.LoginPage;

public class LoginTest extends TestBaseSetup {

	LoginPage loginPage;

	@BeforeClass
	public void setUp() {
		loginPage = new LoginPage(driver);
	}

	@Test(priority = 0)
	public void signInToFacebookWithInValidEmail() {
		loginPage.signInWithInValidEmail();
		String actualErrMsg = driver.findElement(loginPage.errorMessageForInvalidEmail).getText();
		String expectedErrMsg = loginPage.expectedErrorMsgForInvalidEmail;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}

	@Test(priority = 1)
	public void signInToFacebookWithInValidPwd() {
		driver.navigate().back();
		loginPage.signInWithInValidPwd();
		String actualErrMsg = driver.findElement(loginPage.errorMessageForInvalidEmail).getText();
		System.out.println(actualErrMsg);
		String expectedErrMsg = loginPage.expectedErrorMsgForInvalidEmail;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}

	@Test(priority = 2)
	public void signInToFacebookWithInValidEmailAndPwd() {
		driver.navigate().back();
		loginPage.signInWithInValidEmailAndPwd();
		String actualErrMsg = driver.findElement(loginPage.errorMessageForInvalidEmail).getText();
		System.out.println(actualErrMsg);
		String expectedErrMsg = loginPage.expectedErrorMsgForInvalidEmail;
		Assert.assertEquals(actualErrMsg, expectedErrMsg, "Expected and actual messages are not equal");
	}

	@Test(priority = 3)
	public void signInToFacebookWithValidEmailAndPwd() {
		driver.navigate().back();
		loginPage.signInWithValidCredentials();
		Assert.assertTrue(loginPage.isElementAvailable(driver, loginPage.signoutBtn), "Sign in to facebook is failed");
	}

	@Test(priority = 4)
	public void logoutFromFacebook() {
		loginPage.logOut();

	}

	@Test(priority = 5)
	public void closeBrowser() {
		driver.quit();
	}

}
