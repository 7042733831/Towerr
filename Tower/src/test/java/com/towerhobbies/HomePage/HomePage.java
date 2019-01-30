package com.towerhobbies.HomePage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.towerhobbies.TestBase.TestBase;


public class HomePage extends TestBase
{
	//RegistrationPage registration = new RegistrationPage(driver);
	
	/*@BeforeTest
	public void beforeTest()
	{
		getBrowser("chrome");
		driver.get("https://www-dev.towerhobbies.de");
		driver.manage().window().maximize();
	}*/
	
	@Test(priority = 0)
	public void Registration()
	{
		getBrowser("chrome");
		driver.get("https://www-dev.towerhobbies.de");
		driver.manage().window().maximize();
		RegistrationPage registration = new RegistrationPage(driver);
		registration._register();
		
	}
	
	@Test(priority = 1)
	public void SignIn()
	{
		getBrowser("chrome");
		driver.get("https://www-dev.towerhobbies.de");
		driver.manage().window().maximize();
		RegistrationPage registration = new RegistrationPage(driver);
		registration._signIn();
	}

	
}
