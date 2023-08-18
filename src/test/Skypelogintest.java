package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Skypeloginpage;

public class Skypelogintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.skype.com");
	}
	@Test
	public void testlogin()
	{
		Skypeloginpage ob=new Skypeloginpage(driver);
		ob.setvalues("tkvismaya123@gmail.com","Vichu@123");
				ob.login();
	}

}
