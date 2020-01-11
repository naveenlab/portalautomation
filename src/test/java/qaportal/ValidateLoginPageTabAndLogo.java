package qaportal;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import qaportal.Base;

public class ValidateLoginPageTabAndLogo extends Base {
	LoginPage login;
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void launchDriver() throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(applicationurl);
		log.info("Landing to Home page");
		
	}
	
	
	@Test
	public void validateLogo() throws IOException{
		//driver=initializeDriver();
		//driver.get("https://www.phptravels.net/login");
		login = new LoginPage(driver);
		boolean isDisplayedlogo = login.organisationLogo().isDisplayed();
		Assert.assertTrue(isDisplayedlogo);
		log.info("Logo is diaplayed in left corner of the application");
		
		}
	
	@Test
	public void validateHomeTab() throws IOException{
		login = new LoginPage(driver);
		boolean isDIsplayedHomeTab = login.homeTab().isDisplayed();
		Assert.assertTrue(isDIsplayedHomeTab);
		log.info("Home is displayed in navbar");
		}
	
	@Test
	public void validateTourTab() throws IOException{
		login = new LoginPage(driver);
		boolean isDIsplayedTourTab = login.tourTab().isDisplayed();
		Assert.assertTrue(isDIsplayedTourTab);
		log.info("Tour Tab is displayed in navbar");
		}
	
	@Test
	public void validateFlightTab() throws IOException{
		login = new LoginPage(driver);
		boolean isDIsplayedFlightTab = login.flightTab().isDisplayed();
		Assert.assertTrue(isDIsplayedFlightTab);
		log.info("Flight Tab is displayed in navbar");
		}
	
	@Test
	public void validateComapnyTab() throws IOException{
		login = new LoginPage(driver);
		boolean isDIsplayedFlightTab = login.companytab().isDisplayed();
		Assert.assertTrue(isDIsplayedFlightTab);
		log.info("Company Tab is displayed in navbar");
		}
	
	@AfterTest
	public void closeBrower() throws IOException{
		driver.close();
		driver=null;
		log.info("Driver is closed");
		
	}
	
	
	

}

