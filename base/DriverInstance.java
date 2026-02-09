package com.framework.selenium.api.base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.testng.AbstractTestNGCucumberTests;


public class DriverInstance  extends AbstractTestNGCucumberTests{

	private static final ThreadLocal<RemoteWebDriver> remoteWebdriver = new ThreadLocal<RemoteWebDriver>();// static WebDriver driver ;
	// preCondition {driver = new ChromeDriver()}
	private static final ThreadLocal<WebDriverWait> wait = new  ThreadLocal<WebDriverWait>(); //declaration

	public void setWait() {//setter
		wait.set(new WebDriverWait(getDriver(), Duration.ofSeconds(10)));// initialization--> new object
	}

	public WebDriverWait getWait() {//getter
		return wait.get();
	}

	public void setDriver(String browser, boolean headless) {	// initialization--> new object	
		switch (browser) {
		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized"); 
			options.addArguments("--disable-notifications"); 
			options.addArguments("--incognito");
			remoteWebdriver.set(new ChromeDriver(options));
			break;
		case "firefox":
			remoteWebdriver.set(new FirefoxDriver());
			break;
		case "edge":
			remoteWebdriver.set(new EdgeDriver());
			break;	
		case "ie":
			remoteWebdriver.set(new InternetExplorerDriver());
		default:
			break;
		}
	}
	public RemoteWebDriver  getDriver() {
		return remoteWebdriver.get();
	}
	
}
