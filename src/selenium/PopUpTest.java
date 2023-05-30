package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://www.aliexpress.com/");
		
		Thread.sleep(5000);
		
		List<WebElement> popUp1 = driver.findElements(By.className("_24EHh"));
		System.out.println(popUp1.size());
		
		if (popUp1.size()>0) {
			System.out.println("popUp1 Present");
			driver.findElement(By.className("_24EHh")).click();
		}
 
		List<WebElement> popUp2 = driver.findElements(By.xpath("//img[@class='close-btn']"));
		System.out.println(popUp2.size());
		
		if (popUp2.size()>0) {
			System.out.println("popUp2 Present");
			popUp2.get(0).click();
		}
		
		Thread.sleep(6000);
		driver.findElement(By.id("search-key")).sendKeys("computer");
		
		

		//if you get pop-up ---close pop up --type computer in search box
		// if you don't get pop-up --- type computer in search box
	}

}
