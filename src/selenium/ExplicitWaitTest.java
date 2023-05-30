package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

driver.get("https://echoecho.com/javascript4.htm");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // ImplicitWait
		
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.findElement(By.name("B2")).click();
		//Thread.sleep(2000);
		
		wait.until(ExpectedConditions.alertIsPresent()); // ExplicitWait 
		Alert al = driver.switchTo().alert();
		
		// only difference is implicit wait is for web elements and generic and explicit is specific for special conditions only

		//Alert Box
		System.out.println(al.getText());
		//al.dismiss(); // click on non-select button
		al.accept(); //click on Selected button

	}

}

// for fluent wait use this link https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/support/ui/FluentWait.html

