package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://www.facebook.com/");
		
		//add Commons.io jar to the project
		
		File screenshotFile = driver.getScreenshotAs(OutputType.FILE); //This is for firefox, chrome or any class driver
		//File scrFile = (TakesScreenShot)driver).getScreenshotAs(OutputType.FILE); //This line is for Webdriver
		FileUtils.copyFile(screenshotFile,new File("C:\\QA\\Testing\\screenshot.png"));


	}

}
