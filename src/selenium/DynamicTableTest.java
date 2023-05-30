package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTableTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://www.w3schools.com/html/html_tables.asp");
               
		List<WebElement> Row = driver.findElements(By.xpath("//table[@id='customers']//tr"));
      System.out.println(Row.size());
      
      List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
      System.out.println(cols.size());
      
      for(int i=2; i<=Row.size(); i++) {
    	  
    	  for(int j=1; j<=cols.size(); j++) {
    		System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
    		  
    		/*String first = "//table[@id='customers']//tr[";
				String second = "]/td[";
				String third = "]";
				System.out.println(driver.findElement(By.xpath(first+i+second+j+third)).getText());*/
            
    		System.out.print(" | ");
    	  }
    	  
    	  System.out.println();
      }
	}

}
