package ObjectRepository;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rediffloginpage {

	WebDriver driver;
	public Rediffloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*By username=By.xpath("//*[@id='login1']");
	By passwrd=By.xpath("//*[@id='password']");*/ //page object pattern
	
           /* By go=By.xpath("//*[@name='proceed']");
            By Home=By.linkText("Home");*/
	@FindBy(xpath="//*[@id='login1']")
	WebElement username;
	//page factory by find
	@FindBy(xpath="//*[@id='password']")
	WebElement passwrd;
	@FindBy(xpath="//*[@name='proceed']")
	WebElement go;
	@FindBy(linkText="Home")
	WebElement Home;
            
            
           /* public WebElement Emailid()
            {
            	return driver.findElement(username);
            	
            }
            public WebElement Password()
            {
            	return driver.findElement(passwrd);
            }
            
			public WebElement Submit() {
				// TODO Auto-generated method stub
				return driver.findElement(go);
			}
			public WebElement HOME()
			{
				return driver.findElement(Home);
			}*/
	
	public WebElement Emailid()
    {
    	return username;
    	
    }
    public WebElement Password()
    {
    	return passwrd;
    }
    
	public WebElement Submit() {
		// TODO Auto-generated method stub
		return go;
	}
	public WebElement HOME()
	{
		return Home;
	}	
	
	
}