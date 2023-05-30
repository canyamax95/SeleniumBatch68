package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); //Max seconds (Implicit wait is for only Webelements
		
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(10000); //Fix seconds
		
		driver.findElement(By.name("lastname")).sendKeys("Test");
		driver.findElement(By.name("reg_email__")).sendKeys("Test123@abc.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Test");

		//Select July
				WebElement month = driver.findElement(By.id("month"));
				Select m = new Select(month);
				m.selectByVisibleText("Jul");
				
				//Select 10
				WebElement day = driver.findElement(By.id("day"));
				Select d = new Select(day);
				d.selectByValue("10");
				
				//select 2000
				WebElement year = driver.findElement(By.id("year"));
				Select y = new Select(year);
				y.selectByValue("2000");

				driver.findElement(By.name("websubmit")).click();

	}

}
