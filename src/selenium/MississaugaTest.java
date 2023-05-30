package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://www.mississauga.ca/");
		WebElement Organization = driver.findElement(By.xpath("//button[contains(text(),'Our organization')]"));
		Organization.click();
		Actions builder = new Actions(driver);
		builder.moveToElement(Organization).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='dropdown-menu nav-dropdown-menu show']/li/a"));
		// or we can use this xpath //ul[@class='main-nav-links']/li[3]//li for above line

		System.out.println(all.size());
		
		/*for(int i=0; i<all.size();i++) {
			System.out.println(all.get(i).getText());
		}*/
		
		for(WebElement a : all) {
			System.out.println(a.getText());  // both for loops are same. just different way of edit
		}

	}
		
		
	}




// get size and text from our organization