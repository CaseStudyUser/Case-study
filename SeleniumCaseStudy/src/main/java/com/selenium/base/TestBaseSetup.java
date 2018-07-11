package com.selenium.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBaseSetup {

	protected WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();
	static String chromeDriverPath = "";
	static String firefoxDriverPath = "";
	static String edgeDriverPath = "";

	public TestBaseSetup() {
		if (isWindows()) {
			chromeDriverPath = System.getProperty("user.dir") + "\\drivers\\" + "chromedriver.exe";
			firefoxDriverPath = System.getProperty("user.dir") + "\\drivers\\" + "geckodriver.exe";
			edgeDriverPath = System.getProperty("user.dir") + "\\drivers\\" + "MicrosoftWebDriver.exe";
		} else if (isMac()) {
			chromeDriverPath = System.getProperty("user.dir") + "/drivers/" + "chromedriver.exe";
			firefoxDriverPath = System.getProperty("user.dir") + "/drivers/" + "geckodriver.exe";
			edgeDriverPath = System.getProperty("user.dir") + "/drivers/" + "MicrosoftWebDriver.exe";
		} else {
			System.out.println("Your OS is not support!!");
		}
	}

	public WebDriver getDriver() {
		return driver;
	}

	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}

	public static boolean isMac() {
		return (OS.indexOf("mac") >= 0);
	}

	private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		case "edge":
			driver = initEdgeDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initEdgeDriver(String appURL) {
		System.out.println("Launching Edge browser..");
		System.setProperty("webdriver.edge.driver", edgeDriverPath);
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to(appURL);
		return driver;
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		setDriver(browserType, appURL);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		System.out.println("Closing browser");
	}
}