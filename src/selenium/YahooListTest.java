package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");

		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://ca.yahoo.com/");
		
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bd']//a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
		System.out.println(allLinks.get(i).getText());
		}


	}

}

//check for trending now 10 links size and text