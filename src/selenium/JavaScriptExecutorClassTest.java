package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorClassTest {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		ChromeDriver driver= new ChromeDriver(); //open firefox
		
		driver.get("https://www.adidas.ca/en");
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;		
		WebElement careers = driver.findElement(By.linkText("Careers"));
		//Option 1 : Scroll by x and y coordinate
		//System.out.println(careers.getLocation());
		//jse.executeScript("window.scrollBy(0,5000)");
		//careers.click();
		
		//option 2 - Scroll until the element is in the view
		//jse.executeScript("arguments[0].scrollIntoView(true);", careers);
		//careers.click();
		
		//Option 3 - direct click
				jse.executeScript("arguments[0].click();", careers);



	}

}
