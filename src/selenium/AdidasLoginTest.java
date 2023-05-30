package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://www.adidas.ca/en/account-login");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-email")).sendKeys("fvdbujxbksbvksdxcnkkvsdk@hcdh.com");
		//enter valid email
		driver.findElement(By.id("login-password")).sendKeys("sdvvbcdhsncb");
		//enter valid password
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//click on sign in button
		Thread.sleep(3000);
		
		String ActualErr =driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']\"\r\n"
				+ "")).getText();
		String expectedErr="Your request timed out – please retry";
		System.out.println(ActualErr);
		
		if (expectedErr.equals(ActualErr)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		//verify error message
		//Expected Err - Timeout error


	}

}
