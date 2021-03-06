package com.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.base.TestBaseSetup;

public class XpathPage extends TestBaseSetup {
	By firstNameBtn = By.xpath("//input[@name='firstname']");
	By lastNameBtn = By.xpath("//input[@name='lastname']");
	By emailBtn = By.xpath("//input[@name='reg_email__']");
	By pwdBtn = By.xpath("//input[@name='reg_passwd__']");
	By signupBtn = By.xpath("//button[@name='websubmit']");
	By signUpLink=By.xpath("//a[text()='Sign up for Facebook']");
	public By errMsgElement=By.xpath("//div[@class='uiContextualLayer uiContextualLayerLeft']/div/div");
	public By errMsgElementForEnteringFirstNameOnly=By.xpath("//div[@class='uiContextualLayer uiContextualLayerBelowLeft']/div/div");
	public String errorMsg="What's your name?";
	
	public XpathPage(WebDriver driver) {
		this.driver = driver;
	}

	public void checkSignUp_OnlyEnteringFirstName() {
		/*driver.navigate().to("https://www.facebook.com/login/");
		driver.findElement(signUpLink).click();*/
		driver.findElement(firstNameBtn).sendKeys("Sample first name");
		driver.findElement(signupBtn).click();
	}

	public void checkSignUp_OnlyEnteringLastName() {
		driver.findElement(firstNameBtn).clear();
		driver.findElement(lastNameBtn).sendKeys("Sample last name");
		driver.findElement(signupBtn).click();
	}
	
	public void checkSignUp_OnlyEnteringEmail(){
		driver.findElement(lastNameBtn).clear();
		driver.findElement(emailBtn).sendKeys("samplemail@gmail.com");
		driver.findElement(signupBtn).click();
	}
	
	public void checkSignUp_OnlyEnteringPwd(){
		driver.findElement(emailBtn).clear();
		driver.findElement(pwdBtn).sendKeys("samplemail@gmail.com");
		driver.findElement(signupBtn).click();
	}

}
