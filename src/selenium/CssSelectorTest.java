package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://www.facebook.com/");

		driver.findElement(By.cssSelector("#email")).sendKeys("fchujsbhx");
		
		//password
		driver.findElement(By.cssSelector("#pass")).sendKeys("dbsjvbk");
		
		//login
		driver.findElement(By.cssSelector("button[name='login']")).click();
		

	}

}
