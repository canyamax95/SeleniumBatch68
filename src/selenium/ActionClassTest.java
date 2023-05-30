package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		ChromeDriver driver= new ChromeDriver(); //open firefox
		
		driver.get("https://www.ebay.com/");

		
		WebElement Electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Electronics).build().perform();
		
		Thread.sleep(1500);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[1]/li"));
		System.out.println(allLinks.size());
		
		Thread.sleep(2000);
		
		for(int i=0; i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		}

	}
		
		
	}


