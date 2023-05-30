package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\QA\\SeleniumJars\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver(); //open Chrome

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("fchujsbhx");
		driver.findElement(By.name("pass")).sendKeys("dbsjvbk");
		driver.findElement(By.tagName("button")).click();

	}

}
