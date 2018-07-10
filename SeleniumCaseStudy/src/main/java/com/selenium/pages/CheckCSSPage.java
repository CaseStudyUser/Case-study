package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;

import com.selenium.base.TestBaseSetup;

public class CheckCSSPage extends TestBaseSetup {
	By singnUpBtn = By.xpath("//button[text()='Sign Up']");
	By loginBtn = By.xpath("//input[@value='Log In']/parent::label");
	By emailbtn = By.xpath("//input[@id='email']");
	By pwdBtn = By.xpath("//input[@id='pass']");
	String expectedFontSize = "19px";
	String expectedBackGroundColor = "#4267b2";

	public CheckCSSPage(WebDriver driver) {
		this.driver = driver;
	}

	public void checkFontSizeForsingnUpBtn() {
		WebElement element = driver.findElement(singnUpBtn);
		String fontSize = element.getCssValue("font-size");
		Assert.assertEquals(expectedFontSize, fontSize,
				"Expecetd and actual font size is not matched for the signup button");
	}

	public void checkclourForLogInButton() {
		WebElement element = driver.findElement(loginBtn);
		String backgroundColor = element.getCssValue("background-color");
		String hexValueForColor = Color.fromString(backgroundColor).asHex();
		Assert.assertEquals(expectedBackGroundColor, hexValueForColor,
				"Expecetd and actual background color is not matched for the Login button");
	}

	public void checkEmailAndPwdAreHorizontallyAlligned() {
		int emailbtnX = driver.findElement(emailbtn).getLocation().y;
		int pwdBtnX = driver.findElement(pwdBtn).getLocation().y;
		Assert.assertEquals(emailbtnX, pwdBtnX, "Email and Pwd text fields are not in allignment");
	}

}
