package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(2000);
		
		Alert al = driver.switchTo().alert();
		
		//Alert Box
		System.out.println(al.getText());
		//al.dismiss(); // click on non-select button
		al.accept(); //click on Selected button
		
		//Prompt Box
		driver.findElement(By.name("B3")).click();
		Thread.sleep(2000);
		al.sendKeys("selenium");
		Thread.sleep(2000);
		al.accept();

	}

}
