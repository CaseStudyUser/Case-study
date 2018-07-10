package com.selenium.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.selenium.base.TestBaseSetup;
import com.selenium.pages.CheckCSSPage;

public class CheckCSSTest extends TestBaseSetup {
	CheckCSSPage cssPage;

	@BeforeClass
	public void setUp() {
		cssPage = new CheckCSSPage(driver);
	}
	
	@Test(priority = 0)
	public void checkFontSizeForsingnUpBtnTest() {
		cssPage.checkFontSizeForsingnUpBtn();
	}
	
	@Test(priority = 1)
	public void checkclourForLogInButtonTest() {
		cssPage.checkclourForLogInButton();
	}
	
	@Test(priority = 2)
	public void checkEmailAndPwdAreHorizontallyAllignedTest() {
		cssPage.checkEmailAndPwdAreHorizontallyAlligned();
	}
	
	@Test(priority = 3)
	public void closeBrowser() {
		driver.quit();
	}

}
