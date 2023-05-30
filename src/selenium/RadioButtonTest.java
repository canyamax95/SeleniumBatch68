package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> allRadios = driver.findElements(By.name("group1"));
		System.out.println(allRadios.size());
		
		for(int i=0; i<allRadios.size();i++) {
			if(allRadios.get(i).isSelected()) { // This line is from Homework
			System.out.println(allRadios.get(i).getAttribute("value")+"----"+allRadios.get(i).isSelected()); //using getAtribute will give you name of 3
		}
		}

		//driver.findElement(By.xpath("//input[@value='Cheese']")).click(); // this selects cheese
		allRadios.get(2).click(); //this will select on cheese as well
		System.out.println("----------------------");
		for(int i=0; i<allRadios.size();i++) { //This line is from Homework
			if(allRadios.get(i).isSelected()) {
			System.out.println(allRadios.get(i).getAttribute("value")+"----"+allRadios.get(i).isSelected()); //using getAtribute will give you name of 3
		}
		}
		

	}
}
//Homework
//print only if it is selected
//like Butter----true and Cheese-----true
