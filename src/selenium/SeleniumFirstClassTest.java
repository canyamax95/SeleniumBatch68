package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClassTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("fchujsbhx");
		driver.findElement(By.name("pass")).sendKeys("dbsjvbk");
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		
	}

}
