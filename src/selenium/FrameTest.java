package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://jqueryui.com/droppable/");

		List<WebElement> Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if (Sortable.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
		List<WebElement> draggable = driver.findElements(By.id("droppable"));
		System.out.println(draggable.size());
		
		if (draggable.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
		driver.switchTo().frame(0); //index
		//driver.switchTo().frame("demo-free");  //only for name or ID, in this case we don;t have id or name, so can;t use this option
		//driver.switchTo().frame(driver.findElement(By.className("demo-free"))); // switch by Webelement
		
		System.out.println("---------------After switching to frame---------------------");
		 Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if (Sortable.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
		draggable = driver.findElements(By.id("droppable"));
		System.out.println(draggable.size());
		
		if (draggable.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element not Present");
		}
		
		System.out.println("--------------Switching back to main page-------");
		driver.switchTo().defaultContent();
		
		Sortable = driver.findElements(By.linkText("Sortable"));
			System.out.println(Sortable.size());
			
			if (Sortable.size()>0) {
				System.out.println("Element Present");
			}else {
				System.out.println("Element not Present");
			}
			
			draggable = driver.findElements(By.id("droppable"));
			System.out.println(draggable.size());
			
			if (draggable.size()>0) {
				System.out.println("Element Present");
			}else {
				System.out.println("Element not Present");
			}
		
	}

}

