package selenium;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
			//Classname objectname=new Classname();
			
			FirefoxDriver driver= new FirefoxDriver(); //open firefox
			
			driver.get("https://www.google.com/");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			driver.findElement(By.name("q")).sendKeys("canada");
			//Thread.sleep(3000);
			
			wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ul[@role='listbox']/li"), 10));

			List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
			System.out.println(allOptions.size());
			
			for(int i=0; i<allOptions.size(); i++) {
				System.out.println(allOptions.get(i).getText());
			}

	}

}
