package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DrahAndDropTest {

	public static void main(String[] args) {
    ChromeDriver driver= new ChromeDriver(); //open firefox
		
		driver.get("https://jqueryui.com/droppable/\r\n");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.switchTo().frame(0);
		WebElement DragMe = driver.findElement(By.id("draggable"));
		WebElement DropHere = driver.findElement(By.id("droppable"));
		
		System.out.println(DropHere.getText());

		Actions builder = new Actions(driver);
		builder.dragAndDrop(DragMe, DropHere).build().perform();
		
		wait.until(ExpectedConditions.textToBePresentInElement(DropHere, "Dropped!"));
		System.out.println(DropHere.getText());
		
		if(DropHere.getText().equals("Dropped!")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
