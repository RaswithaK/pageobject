package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.Rediffloginpage;
import ObjectRepository.RediffHomePage;

public class loginapplication {

	@Test
	public void Login() {

	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_1\\DRIVERS\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
    driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
    Rediffloginpage rd=new Rediffloginpage(driver);
    rd.Emailid().sendKeys("hello");
    rd.Password().sendKeys("12345");
    rd.Submit().click();
    rd.HOME().click();
    RediffHomePage rh=new RediffHomePage(driver);		
   rh.SEARCH().sendKeys("rediff");
   rh.SubmitSearch().click();
    
	}

}
