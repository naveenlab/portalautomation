package qaportal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Base {
	public static WebDriver driver;
	public Properties prop;
	public String applicationurl;
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\navee\\AutomationFramework\\E2EProject\\src\\main\\resources\\data.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		applicationurl = prop.getProperty("url");
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\AutomationFramework\\E2EProject\\src\\main\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		return driver;
		
	}
	
	public  void getScreenshot(String result) throws IOException {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\navee\\AutomationFramework\\E2EProject\\src\\test\\resources\\Screenshot\\"+result+"screenshot.png"));
		
	}
}
