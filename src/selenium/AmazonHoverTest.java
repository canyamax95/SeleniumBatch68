package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
		//you won't get size and but text from header
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://www.amazon.ca/");
		WebElement SignIn = driver.findElement(By.id("nav-link-accountList"));
		Actions builder = new Actions(driver);
		builder.moveToElement(SignIn).build().perform();
		
		Thread.sleep(2000);
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(all.size());
		
		/*for(int i=0; i<all.size();i++) {
			System.out.println(all.get(i).getText());
		}*/
		
		for(WebElement a : all) {
			System.out.println(a.getText());  // both for loops are same. just different way of edit
		}

	}
		
		
	}


