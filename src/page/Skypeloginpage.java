package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Skypeloginpage {
	WebDriver driver;
	By skypeemail = By.id("email");
	By skypepassword = By.id("pass");
	By skypelogin = By.name("login");
	
	
	public Skypeloginpage(WebDriver driver) {
		this.driver = driver; 	
		}
	public void setvalues(String email, String password)
	{
		driver.findElement(skypeemail).sendKeys(email);
		driver.findElement(skypepassword).sendKeys(password);
	}
	public void login() {
		driver.findElement(skypelogin).click();
		
	}
	
	
	

}
