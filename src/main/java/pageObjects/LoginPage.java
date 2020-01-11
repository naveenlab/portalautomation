package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;

	By email=By.xpath("//input[@placeholder='Email']");
	By password=By.xpath("//input[@placeholder='Password']");
	By submitButton = By.cssSelector("button[class='btn btn-primary btn-lg btn-block loginbtn']");
	By cookiesGotitButton = By.xpath("//div[@id='cookyGotItBtnBox']/div/button[@aria-label='dismiss cookie message']");
	By logo = By.xpath("//div[@class='header-logo go-right']//a//img ");
	By homeTab = By.xpath("//a[contains(text(),'Home')]");
	By flightTab = By.xpath("//a[contains(text(),'Flights')]");
	By toursTab = By.xpath("//a[contains(text(),'Tours')]");
	By companyTab = By.xpath("//nav[@class='main-nav-menu main-menu-nav navbar-arrow']//li[@class='text-center']");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public WebElement emailtextbox() {
		return driver.findElement(email);
		
	}
	
	public WebElement passwordTextBox() {
		return driver.findElement(password);
		
	}
	
	public WebElement login() {
		return driver.findElement(submitButton);
	}
	
	public WebElement acceptcookies() {
		return driver.findElement(cookiesGotitButton);
	}
	
	public WebElement organisationLogo() {
		return driver.findElement(logo);
	}
	
	public WebElement homeTab() {
		return driver.findElement(homeTab);
	}
	
	public WebElement flightTab() {
		return driver.findElement(flightTab);
	}
	
	public WebElement tourTab() {
		return driver.findElement(toursTab);
	}
	
	public WebElement companytab() {
		return driver.findElement(companyTab);
	}
	


}
