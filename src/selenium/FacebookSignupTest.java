package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignupTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://www.facebook.com/login.php/");
		
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _16jx _4jy6 _4jy2 selected _51sy']")).click();
		//driver.findElement(By.linkText("Create new account")).click();
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

	}
}


