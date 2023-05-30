package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://www.google.com/");
		
driver.manage().window().maximize(); // this will maximize the pop-up google window
	}

}
