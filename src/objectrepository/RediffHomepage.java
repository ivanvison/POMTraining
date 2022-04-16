package objectrepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomepage {

	//Constructor is common for all test cases
	WebDriver driver;	
	public RediffHomepage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='srchword']")
	WebElement searchBox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement searchBtn;
	
	public WebElement Search() {
		return searchBox;
	}
	
	public WebElement Button() {
		return searchBtn;
	}
}
