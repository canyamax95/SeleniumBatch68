package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttributeTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://www.ebay.com/?PARM3_ID=GBH_168&FF11=GBH_168&kw=63792d144fb52900017d8601_15116&mkevt=1&mkcid=16&mkrid=711-155609-835623-2&ufes_redirect=true");
		
		String s = driver.findElement(By.id("gh-ac")).getAttribute("Search for anything");
		System.out.println(s); //print search for anything
		
		driver.findElement(By.id("gh-ac")).sendKeys("Iphone"); //typing Iphone in search box

	//Read what we entered in any input box - getAttribute("value")
		String p= driver.findElement(By.id("gh-ac")).getAttribute("value");
		System.out.println(p);
		
	
	}

}
