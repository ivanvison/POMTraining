package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.RediffLoginpage;

public class LoginApplication {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ivan\\Desktop\\QA Path\\Projects-Eclipse\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginpage rd = new RediffLoginpage(driver);
		
		rd.EmailID().sendKeys("hello");
		rd.Password().sendKeys("1234");
		rd.Button().click();
		rd.Home().click();
		
		RediffHomepage rh = new RediffHomepage(driver);
		rh.Search().sendKeys("Ivan");
		rh.Button().click();
		
	}
	
}