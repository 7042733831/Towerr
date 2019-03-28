package com.towerhobbies.HomePage;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.towerhobbies.TestBase.TestBase;


public class RegistrationPage extends TestBase
{
	WebDriver driver;
	
	
	@FindBy(id="SignInLink")
	public WebElement uiSignInRegisterLink;
	
	@FindBy(xpath="//*[@id=\"WC_AccountDisplay_div_24\"]/a")
	public WebElement uiRegisterButton;

	@FindBy(name="logonId")
	public WebElement uiEmailIdImput;
	
	@FindBy(id="WC_UserRegistrationAddForm_FormInput_logonPassword_In_Register_1")
	public WebElement uiPasswordInput;
	
	@FindBy(name="logonPasswordVerify")
	public WebElement uiPasswordVerifyInput;
	
	@FindBy(name="firstName")
	public WebElement uiFirstNameInput;
	
	@FindBy(name="lastName")
	public WebElement uiLastNameInput;
	
	@FindBy(name="address1")
	public WebElement uiAddressInput;
	
	@FindBy(name="city")
	public WebElement uiCityInput;
	
	@FindBy(name="zipCode")
	public WebElement uiZipcodeInput;
	
	@FindBy(name="phone1")
	public WebElement uiPhoneInput;
	
	@FindBy(id="WC_UserRegistrationAddForm_AddressEntryForm_FormInput_country_1")
	public WebElement uiCountryDropDown;
	
	@FindBy(id="WC_UserRegistrationUpdateForm_FormInput_enrollInRewards_In_Register_1")
	public WebElement uiRewardEnrollCheckBox;
	
	@FindBy(name="birth_month")
	public WebElement uiBirthMonthDropDown;
	
	@FindBy(name="birth_date")
	public WebElement uiBirthDateDropDown;
	
	@FindBy(name="birth_year")
	public WebElement uiBirthYearDropdown;
	
	@FindBy(id="WC_UserRegistrationAddForm_links_1")
	public WebElement uiSubmitButton;
	
	@FindBy(id="WC_UserRegistrationAddForm_links_2")
	public WebElement uiCancelButton;
	
	@FindBy(name="logonId")
	public WebElement uiSignInIdInput;
	
	@FindBy(name="logonPassword")
	public WebElement uiSignInPasswordInput;
	
	@FindBy(id="WC_AccountDisplay_links_2")
	public WebElement uiSignInButton;
	
	@FindBy(id="SimpleSearchForm_SearchTerm")
	public WebElement uiSearchTextBox;
	
	@FindBy(id="addToShoppingList")
	public WebElement uiAddToWishlistLink;
	
	@FindBy(id="ShoppingListLink_0")
	public WebElement uiCreateAWishlistLink;
	
	@FindBy(id="newListName")
    public WebElement uiNewWishListTextBox;	
	
	@FindBy(id="CreateShoppingListPopup_div_create_save")
	public WebElement uiWishlistSaveButton;
	
    @FindBy(xpath = "//*[contains(@id, 'shoppingListCreateSuccessPopup')]")
    public WebElement uiContinueShoppingButton;
    
    @FindBy(id="shoppingListCreateSuccessPopup_close")
    public WebElement uiWishlistPopupClose;
    
    @FindBy(id="ShoppingListDisplayLink")
    public WebElement uiWishlistButton;
    
    @FindBy(linkText="Weiter einkaufen")
    public WebElement uiContinueShoppingText;
    
    @FindBy(id="quantity_297559")
    public WebElement uiQuantityTextBox;
    
    @FindBy(linkText="In den Warenkorb")
    public WebElement uiAddToCartButton;
    
    @FindBy(className="close")
    public WebElement uiMiniCartCloseLink;
    
    @FindBy(id="shareIconLink")
    public WebElement uiShareIconLink;
    
    @FindBy(id="shareDialoguePopup_close")
    public WebElement uiShareDialoguePopuoCloseLink;
    
    @FindBy(id="PrintIconLink")
    public WebElement uiPrintIconLink;
    
    @FindBy(linkText="abbrechen")
    public WebElement uiPrintCancelButton;
    
    @FindBy(id="tab_specs")
    public WebElement uiSpecificationTab;
    
    @FindBy(id="tab_parts")
    public WebElement uiPartsTab;
    
    @FindBy(id="tab_support")
    public WebElement uiSupportTab;
    
	
	
	
	public RegistrationPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	public void _register()
	{
		
		this.uiSignInRegisterLink.click();
	    this.uiRegisterButton.click();
		this.uiEmailIdImput.sendKeys("adam.john4@gmx.com");
		this.uiPasswordInput.sendKeys("ankur123");
		this.uiPasswordVerifyInput.sendKeys("ankur123");
		this.uiFirstNameInput.sendKeys("Adam");
		this.uiLastNameInput.sendKeys("john");
		this.uiAddressInput.sendKeys("H67");
		this.uiCityInput.sendKeys("City");
		this.uiZipcodeInput.sendKeys("122001");
		this.uiPhoneInput.sendKeys("4087912345");
		
		Select days = new Select(this.uiBirthDateDropDown);
		days.selectByIndex(5);
		
		Select months = new Select(this.uiBirthMonthDropDown);
		months.selectByIndex(7);
		
		Select years = new Select(this.uiBirthYearDropdown);
		years.selectByValue("1990");
		
		this.uiSubmitButton.click();
			
		
	}
	
	public void _signIn()
	{
		
		this.uiSignInRegisterLink.click();
		this.uiSignInIdInput.sendKeys("adam.john4@gmx.com");
		this.uiSignInPasswordInput.sendKeys("ankur123");
		this.uiSignInButton.click();
		
	}
	
	public void _wishList()
	{
		
		this.uiSearchTextBox.sendKeys("BLH4000");
		this.uiSearchTextBox.sendKeys(Keys.ENTER);
		this.uiAddToWishlistLink.click();
		this.uiCreateAWishlistLink.click();
		this.uiNewWishListTextBox.sendKeys("Test001");
		this.uiWishlistSaveButton.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    this.uiContinueShoppingText.click();
	
	}
	
	 public void _quickInfo() 
	 {
	
		 this.uiSearchTextBox.sendKeys("RTF");
		 this.uiSearchTextBox.sendKeys(Keys.ENTER);
		 Actions action = new Actions(driver);
		 action.moveToElement(driver.findElement(By.className("product_image"))).build().perform();
		 driver.findElement(By.className("quick_info_toggle")).click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.findElement(By.linkText("In den Warenkorb")).click();
		 driver.findElement(By.linkText("Zum Einkaufskorb gehen")).click();
		 
		 String s = driver.getTitle();
		 Assert.assertEquals(s,"Einkaufskrb","Title is correct");
		
		 
		 
		//Control Getting back to Parent window by closing child window
			/*String parentWindow = driver.getWindowHandle();
			Set<String> handles =  driver.getWindowHandles();
			   for(String windowHandle  : handles)
			       {
			       if(!windowHandle.equals(parentWindow))
			          {
			          driver.switchTo().window(windowHandle);
			          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			          driver.findElement(By.id("add2CartBtn")).click();
			          driver.findElement(By.id("QuickInfoaddToShoppingList")).click();
	   		         driver.close(); //closing child window
			         driver.switchTo().window(parentWindow); //cntrl to parent window
			          }
			       }*/
		// driver.findElement(By.id("add2CartBtn")).click();
		//driver.findElement(By.className("button btnAddToCart expand")).click();
		
		 
	 }
	 
	 public void _productPage()
	 
	 {
		 this.uiSearchTextBox.sendKeys("HAN4540");
		 this.uiSearchTextBox.sendKeys(Keys.ENTER);
		 this.uiShareIconLink.click();
		 this.uiShareDialoguePopuoCloseLink.click();
		 this.uiPrintIconLink.click();
		 this.uiPrintCancelButton.click();
		 this.uiQuantityTextBox.clear();
		 this.uiQuantityTextBox.sendKeys("2");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 this.uiAddToCartButton.click();
		 this.uiMiniCartCloseLink.click();
		 this.uiAddToWishlistLink.click();
		 this.uiSpecificationTab.click();
		 this.uiPartsTab.click();
	     this.uiSupportTab.click();
		
		 
		 
	 }
	 
	 public void _twoSeperateWindow()
	 {
		
		 driver.get("https://www.horizonhobby.com");
		 ((JavascriptExecutor)driver).executeScript("window.open()");
		 ((JavascriptExecutor)driver).executeScript("window.open()");
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 driver.get("http://google.com");
		 driver.findElement(By.id("q")).sendKeys("Horizonhobby");
		 Reporter.log("passed");
		 
		 
		 
		 
		 
	 }
   
}
