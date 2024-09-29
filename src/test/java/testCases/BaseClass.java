package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	WebDriver driver;

	@BeforeClass
	void setup() throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.wpeverest.com/user-registration/simple-registration-form/");

	}

	@AfterClass
	void tearDown() {
		driver.quit();

	}

	public String randomeString() {

		String genratedstring = RandomStringUtils.randomAlphabetic(7);
		return genratedstring;

	}

	public String randomeNumber() {

		String genratedNumber = RandomStringUtils.randomNumeric(10);
		return genratedNumber;

	}
}
