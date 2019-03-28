package com.towerhobbies.MavenProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartMavenTest {
	
	@Test
	public void Start()
	{
        System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.horizonhobby.com");
		
		driver.manage().window().maximize();
	}

}
