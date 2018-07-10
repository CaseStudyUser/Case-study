package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.TestBaseSetup;

public class LoginPage extends TestBaseSetup{
	By emailBtn = By.id("email");
	By pwdBtn = By.id("pass");
	By logInBtn = By.xpath("//input[@value='Log In']");
	public By errorMessageForInvalidEmail = By
			.xpath("//div[@class='uiContextualLayer uiContextualLayerRight']/div/div");
	public String expectedErrorMsgForInvalidEmail = "The email address or phone number that you've entered doesn't match any account. Sign up for an account.";
	public String expectedErrorMsgForInvalidEmailAndPwd = "The email address or phone number that you've entered doesn't match any account";
	public String expectedErrorMsgForInvalidPwd = "The password that you've entered is incorrect. Forgotten password?";
	public By loginSuccesMsg = By.xpath("//h2[@class='uiHeaderTitle']");
	public String expectedLoginSuccessMsg = "Welcome to Facebook, NareshTest";
	public By signoutTab = By.id("userNavigationLabel");
	public By signoutBtn = By.xpath("//span[text(),'Log Out']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void signInWithValidCredentials() {
		driver.findElement(emailBtn).sendKeys("testsample434@gmail.com");
		driver.findElement(pwdBtn).sendKeys("naresh434");
		driver.findElement(logInBtn).click();
	}

	public void signInWithInValidEmail() {
		driver.findElement(emailBtn).sendKeys("invalid");
		driver.findElement(pwdBtn).sendKeys("naresh434");
		driver.findElement(logInBtn).click();
	}

	public void signInWithInValidPwd() {
		driver.findElement(emailBtn).sendKeys("testsample434@gmail.com");
		driver.findElement(pwdBtn).sendKeys("inavlid");
		driver.findElement(logInBtn).click();
	}

	public void signInWithInValidEmailAndPwd() {
		driver.findElement(emailBtn).sendKeys("inavlid@gmail.com");
		driver.findElement(pwdBtn).sendKeys("invalid");
		driver.findElement(logInBtn).click();
	}

	public void logOut() {
		driver.findElement(signoutTab).click();
		driver.findElement(signoutBtn).click();
	}

}
