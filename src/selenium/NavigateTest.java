package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/"); // .get and .navigate are same
		
		//driver.navigate has different option available to direct the webpage 
        //driver.navigate().back();
        //driver.navigate().forward();
        //driver.navigate().refresh();
	}

}
