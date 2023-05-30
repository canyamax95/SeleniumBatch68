package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://www.google.com/");
		
		//Using Web element we can not verify if element is present or not
		/*if(driver.findElement(By.linkText("About")).isDisplayed()) {
			System.out.println("Element present");
		}else {
			System.out.println("Element not present");
		}*/
		
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		if (element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}

	}

}
