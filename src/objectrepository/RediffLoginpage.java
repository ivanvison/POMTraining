package objectrepository;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginpage {

	WebDriver driver;
	
	public RediffLoginpage(WebDriver driver) { 
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By button = By.xpath("//input[@name='proceed']");
	By home = By.xpath("//a[@class='f12']");
	
	public WebElement EmailID() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement Button() {
		return driver.findElement(button);
	}
	
	public WebElement Home() {
		return driver.findElement(home);
	}
}
