package TestPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	ChromeDriver driver;
	String qatechhubUrl = "http://qatechhub.com";
	String facebookUrl = "https://www.facebook.com";
	
	@Test(priority=0)
	public void invokeBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get(qatechhubUrl);

		String titleOfThePage = driver.getTitle();
		
		Assert.assertEquals(titleOfThePage, "QA Automation Tools Trainings and Tutorials | QA Tech Hub");

	}

	@Test(priority= 1)
	public void navigateCommands() {
		driver.navigate().to(facebookUrl);

		String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL :: " + currentUrl);
		driver.navigate().back();

		driver.navigate().refresh();
		
		driver.close();
	}

  }
