package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.TestBaseSetup;

public class AbsoluteXpathPages extends TestBaseSetup {
	By firstNameBtn = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
	By lastNameBtn = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
	By emailBtn = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]");
	By pwdBtn = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[5]/div[1]/div[1]/input[1]");
	By signupBtn = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[9]/button[1]");
	By signUpLink = By.xpath("//a[text()='Sign up for Facebook']");
	By reenterEmailBtn=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
	public By errMsgElementForInvalidMobileNumber = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[1]");
	public String errorMsg = "Please enter a valid mobile number or email address.";
	public By errMsgElementForEmptyReenterEamil=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[1]/div[1]");
	public String errMsgEmptyReenterEmail="Please re-enter your email address.";
	public By errMsgElementForInvalidPwdCombination=By.xpath("/html[1]/body[1]/div[1]/div[3]/div[6]/div[1]/div[1]/div[1]");
	public String errMsgForInvalidPwdCombination="Enter a combination of at least six numbers, letters and punctuation marks (like ! and &).";
	
	public AbsoluteXpathPages(WebDriver driver) {
		this.driver = driver;
	}

	public void checkSignUp_EnteringMobileNumberAsInvalidFormat() {
		driver.navigate().to("https://www.facebook.com/login/");
		driver.findElement(signUpLink).click();
		driver.findElement(firstNameBtn).sendKeys("Sample first name");
		driver.findElement(lastNameBtn).sendKeys("Sample last name");
		driver.findElement(signupBtn).click();
	}

	public void checkSignUp_EnteringPwdAsEmpty() {
		driver.findElement(firstNameBtn).sendKeys("Sample first name");
		driver.findElement(lastNameBtn).sendKeys("Sample last name");
		driver.findElement(emailBtn).sendKeys("samplemail@gmail.com");
		driver.findElement(signupBtn).click();
	}

	public void checkSignUp_EnteringPwdAsInvalidCombination() {
		driver.findElement(firstNameBtn).sendKeys("Sample first name");
		driver.findElement(lastNameBtn).sendKeys("Sample last name");
		driver.findElement(emailBtn).sendKeys("samplemail@gmail.com");
		driver.findElement(pwdBtn).sendKeys("12334556");
		driver.findElement(signupBtn).click();
	}

}
