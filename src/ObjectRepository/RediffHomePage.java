package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage {
	
		WebDriver driver;
		
		public RediffHomePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		/*By text=By.id("srchword");
		By Search=By.className("newsrchbtn");
		public WebElement SEARCH()
		{
			return driver.findElement(text);
		}
		public WebElement SubmitSearch()
		{
			return driver.findElement(Search);
		}*/
		@FindBy(id="srchword")
		WebElement text;
		@FindBy(className="newsrchbtn")
		WebElement Search;
		public WebElement SEARCH()
		{
			return text;
		}
		public WebElement SubmitSearch()
		{
			return Search;
		}
		
            }

