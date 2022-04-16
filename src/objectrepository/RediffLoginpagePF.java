package objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginpagePF {

	WebDriver driver;
	
	public RediffLoginpagePF(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("//input[@id='password']");
	By button = By.xpath("//input[@name='proceed']");
	By home = By.xpath("//a[@class='f12']");*/
	
	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='proceed']")
	WebElement button;
	
	@FindBy(xpath = "//a[@class='f12']")
	WebElement home;	
	
	public WebElement EmailID() {
		return username;
	}

	public WebElement Password() {
		return password;
	}

	public WebElement Button() {
		return button;
	}
	
	public WebElement Home() {
		return home;
	}
}
