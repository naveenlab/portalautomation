package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public static WebDriver driver;
	By myacountdropdown = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab show']");
	By signin=By.xpath("//a[@class='dropdown-item active tr']");
	By cookiesGotitButton = By.xpath("//div[@id='cookyGotItBtnBox']/div/button[@aria-label='dismiss cookie message']");


	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}



	public WebElement getlogin() {

		return driver.findElement(signin);
	}
	
	public WebElement myaccountdropdown() {

		return driver.findElement(myacountdropdown);
	}
	
	public WebElement acceptcookies() {
		return driver.findElement(cookiesGotitButton);
	}


}
