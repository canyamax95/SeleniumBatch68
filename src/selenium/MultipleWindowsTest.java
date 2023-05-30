package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1811750190%3A1668891936774581&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAuQGmJXFl28AO8Cz_0U8n4v_Fdo720EV3cN5O3dzLj_L437PcSYHd0OsBgL_DrUI9jVC-A2pw");

		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String parentWindow = iter.next();
		String ChildWindow = iter.next();
		System.out.println(parentWindow);
		System.out.println(ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle()); // title for help page
		driver.close(); // will close one window
		Thread.sleep(4000);
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle()); //title for gmail page
		driver.quit(); //close all windows and kills driver
		
	}

}
