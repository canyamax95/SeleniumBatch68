package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonHeaderTest {

	public static void main(String[] args) {
		
		//you won't get size and but text from header
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://www.amazon.ca/?tag=hydcaabkg-20&hvadid=317545724588&hvpos=&hvnetw=g&hvrand=18258270974280155695&hvpone=&hvptwo=&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9000874&hvtargid=kwd-296387478685&ref=pd_sl_5x1y8ilk72_e&hydadcr=20060_10818753&gclid=EAIaIQobChMI1afjoMe9-wIVxO7jBx1IIAv3EAAYASAAEgI2FfD_BwE");
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[contains(@id,'nav-xshop')]/a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size();i++) {
			System.out.println(allLinks.get(i).getText());
		}

	}

}