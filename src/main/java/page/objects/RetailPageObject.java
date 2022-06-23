package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

public class RetailPageObject extends Base{
	 WebDriver driver;

	public  RetailPageObject() {
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAcountOption;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement LoginOption;
	public void clickOnMyAccount() {
		MyAcountOption.click();
	}
			
     public void clickOnLoginOption() {
    	 MyAcountOption.click();
    	 LoginOption.click();
     }
     public String getTitle() {
    	 return driver.getTitle();
     }
     @FindBy(xpath="//*[@id=\"input-email\"]")
    	 private WebElement Email;
    	 
     @FindBy(xpath = "//*[@id=\"input-password]")
     private WebElement passwordOption;
    	 
     @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
     private WebElement submitBtton;
      public void submitBtton() {
    	  submitBtton.click();
      }
     }
     
     



