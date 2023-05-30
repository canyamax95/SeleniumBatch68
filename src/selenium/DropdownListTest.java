package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://www.ebay.com/");
		
		//List<WebElement> allLinks = driver.findElements(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList')]/li"));
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText()+"------"+allOptions.get(i).isSelected());
		}
		
		Select s = new Select(driver.findElement(By.id("gh-cat")));
		
		s.selectByIndex(2); //Select Art
		Thread.sleep(3000);
		
		s.selectByValue("2984"); //Select Baby
		Thread.sleep(3000);
		
		s.selectByVisibleText("Books"); //Select Book
		System.out.println("------------------------After selection----------------------------------------------");
		
		for(int i=0; i<allOptions.size();i++) {
			System.out.println(allOptions.get(i).getText()+"------"+allOptions.get(i).isSelected());
		}

}
}
