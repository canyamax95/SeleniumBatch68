package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest1 {

	public static void main(String[] args) throws IOException {
	
		FileInputStream f = new FileInputStream("C:\\QA\\Selenium_Workspace\\XLS_Project67\\src\\prop.properties");
        Properties prop=new Properties();
        prop.load(f);
        
        System.out.println(prop.getProperty("browser"));
		String browser = prop.getProperty("browser"); //Firefox, Chrome, Safari // In future we read value from data file,like Excel or Properties
		WebDriver driver;
		
		if(browser.equals("Firefox")) {
			 driver = new FirefoxDriver();
		}else if (browser.equals("Chrome")) {
			 driver= new ChromeDriver();
		}else {
			driver=new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("fchujsbhx");
		driver.findElement(By.name("pass")).sendKeys("dbsjvbk");
		driver.findElement(By.tagName("button")).click();

	}

}

