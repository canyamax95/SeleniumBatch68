package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.name("email"));
		
		email.sendKeys("fchujsbhx");
		
		WebElement Password = driver.findElement(By.name("pass"));
		Password.sendKeys("dbsjvbk");
		
		WebElement Loginbutton = driver.findElement(By.tagName("button"));
		Loginbutton.click();
		
	
	}

}
