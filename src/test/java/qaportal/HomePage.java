package qaportal;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import qaportal.Base;

public class HomePage extends Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@Test(dataProvider = "getdata")
	public void basePageNavigation(String username, String password) throws IOException {
		driver=initializeDriver();
		log.info("Driver is initialized");
		driver.get(applicationurl);
		log.info("Landing to Home page");
		
		//LandingPage lp = new LandingPage(driver);
		//lp.acceptcookies().click();
		//lp.myaccountdropdown().click();
		//lp.getlogin().click();
		LoginPage login = new LoginPage(driver);
		login.emailtextbox().sendKeys(username);
		login.passwordTextBox().sendKeys(password);
		login.acceptcookies().click();
		login.login().click();
		driver.close();
		log.info("Driver closed");
		}
	
	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[1][2];
		data[0][0] = "user@phptravels.com";
		data[0][1] = "demouser";
		return data;
		}
	
	

}
