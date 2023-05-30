package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1811750190%3A1668891936774581&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=ARgdvAuQGmJXFl28AO8Cz_0U8n4v_Fdo720EV3cN5O3dzLj_L437PcSYHd0OsBgL_DrUI9jVC-A2pw");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("sdvsaasvcavasdvsvvds");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		Thread.sleep(4000);
		String expectedErr = "Couldn’t find your Google Account";
		String actualErr= driver.findElement(By.xpath("//div[@class='o6cuMc']")).getText();
      
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
		
		

	}

}
