package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) {
	
		String browser = "Chrome"; //Firefox, Chrome, Safari // In future we will use from Excel and properties
		WebDriver driver;
		
		if(browser.equals("Firefox")) {
			 driver = new FirefoxDriver();
		}else if (browser.equals("Chrome")) {
			 driver= new ChromeDriver();
		}else {
			driver=new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("fchujsbhx");
		driver.findElement(By.name("pass")).sendKeys("dbsjvbk");
		driver.findElement(By.tagName("button")).click();

	}

}

