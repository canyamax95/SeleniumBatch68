package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://www.facebook.com/");

		//1.ClassName (For class attribute) // this option will not work if we have space in className
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("vfijcxkxkivx");
		
		//2. cssSelector - Needs to learn syntaxes
		//driver.findElement(By.cssSelector(null))
		
		//3.id - id attribute - Working

	//driver.findElement(By.id("email")).sendKeys("bsdvbxkbcsakl");
		
		//4. LinkText - only for links
		//driver.findElement(By.linkText(null))
		
		//5. name- name attribute - working
		driver.findElement(By.name("email")).sendKeys("fchujsbhx");
		
		//6. partialLinkTest - only for links 
		//driver.findElement(By.partialLinkText(null));
		
		//7.tagName - not unique
		//driver.findElement(By.tagName("input")).sendKeys("dsdjibckbk");
		
		//8.xpath - needs to learn syntaxes
		//driver.findElement(By.xpath(null));
		
		//password
		driver.findElement(By.name("pass")).sendKeys("dbsjvbk");
		
		//login
		driver.findElement(By.tagName("button")).click();
		
	

	}

}
