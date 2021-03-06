package com.towerhobbies.HomePage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import com.towerhobbies.TestBase.TestBase;


public class HomePage extends TestBase
{
	
	
	@BeforeTest
	public void beforeTest()
	{
		getBrowser("chrome");
		driver.get("https://www-stg.towerhobbies.de");
		driver.manage().window().maximize();
		
	}
	
	/*@Test(priority = 0)
	public void Registration()
	{
		RegistrationPage registration = new RegistrationPage(driver);
		registration._register();
		
	}
	
	@Test(priority = 1)
	public void SignIn()
	{   
		RegistrationPage registration = new RegistrationPage(driver);
		registration._signIn();
	}

	@Test
	public void WishList()
	{
		RegistrationPage registration = new RegistrationPage(driver);
		registration._signIn();
		registration._wishList();
		
		
	}*/
	
	@Test
	public void QuickInfo()
	{
		RegistrationPage registration = new RegistrationPage(driver);
		registration._quickInfo();
	}
	
	/*@Test
	public void ProductPage()
	{
		RegistrationPage registration = new RegistrationPage(driver);
		registration._productPage();
	}*/
	
	/*@Test
	public void TwoSeperateWindow()
	{
		RegistrationPage registration = new RegistrationPage(driver);
		registration._twoSeperateWindow();
		
	}*/
}
