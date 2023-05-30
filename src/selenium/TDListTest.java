package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TDListTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://www.td.com/ca/en/personal-banking/");
		
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='td-footer-links td-copy-align-centre td-copy-white']/a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
		System.out.println(allLinks.get(i).getText());
		}


	}



}

// get size and text from footer