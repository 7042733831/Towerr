package com.towerhobbies.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase
{
	public WebDriver driver;
	public WebDriver getBrowser(String browser)
	{
	if(System.getProperty("os.name").contains("Window")){
	if(browser.equalsIgnoreCase("firefox")){
	//https://github.com/mozilla/geckodriver/releases
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
	driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome")){
	//https://chromedriver.storage.googleapis.com/index.html
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
	driver = new ChromeDriver();
	}
	}
	else if(System.getProperty("os.name").contains("Mac")){
	System.out.println(System.getProperty("os.name"));
	if(browser.equalsIgnoreCase("firefox")){
	System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver");
	driver = new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("chrome")){
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
	driver = new ChromeDriver();
	}
	}
	return driver;
	}
	
	public void Register()
	{
		
        driver.findElement(By.id("SignInLink")).click();
		
		driver.findElement(By.xpath("//*[@id=\"WC_AccountDisplay_div_24\"]/a")).click();
		
		
		
	}

}
