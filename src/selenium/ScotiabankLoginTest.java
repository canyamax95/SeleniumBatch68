package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiabankLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\QA\\SeleniumJars\\geckodriver.exe");
		//Classname objectname=new Classname();
		
		FirefoxDriver driver= new FirefoxDriver(); //open firefox

		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=wgMfjs0l9lo&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJ1aV9sb2NhbGVzIjoiZW4tQ0EiLCJvYXV0aF9rZXkiOiJ3Z01manMwbDlsbyIsImNvbnNlbnRfcmVxdWlyZWQiOmZhbHNlLCJyZWRpcmVjdF91cmkiOiJodHRwczpcL1wvc2VjdXJlLnNjb3RpYWJhbmsuY29tXC9hdXRoXC9hdXRob3JpemF0aW9uIiwic3RhdGUiOiJleUp5WlhSMWNtNVZVa2tpT2lKb2RIUndjem92TDNObFkzVnlaUzV6WTI5MGFXRmlZVzVyTG1OdmJTOGlMQ0p2Y21sbmFXNWhiRkpsWm1WeVpYSWlPaUpvZEhSd2N6b3ZMM2QzZHk1elkyOTBhV0ZpWVc1ckxtTnZiUzhpTENKamJHbGxiblJKVUNJNmJuVnNiQ3dpWTNOeVpsUnZhMlZ1SWpvaVRtdzJaVWh3VlVFdFlWYzRiSEpMWlY4MFFtTjJOVFpwV1hoSE9XdGtURWxVT1VkakluMCUzRCIsImV4cCI6MTY2ODM3MzAzOSwiaWF0IjoxNjY4MzcxODM5LCJqdGkiOiI0YTY5NjU2Ny0zZDk4LTRhNDctYTdjMy0xMTc4Yjk1NDMwODIiLCJjbGllbnRfaWQiOiI0ZWNmN2UzOS1iZTU2LTRhNjYtODE2Yy0xM2NiOTRlNjJkYTUiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiTW9iaWxlIiwiQXBwbGljYXRpb25Db2RlIjoiSW1XQVAiLCJjdXN0b21lckFjdGl2aXR5Q2F0ZWdvcnkiOiJNMSIsImNoYW5uZWwiOiJNQiIsImFwcGxpY2F0aW9uIjoiTTEifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.aBMgIJV5cWRx_4hhbLninGMeMrnog2skHETkyGlNa30gpxjEkeiAG-gKJ10uQeh9TwrK5HU2Pxyev10hvPyXkerelTLVMpPGGCkXzEHDeT8TDh2dPZwoWjzBXDWhpXgumy2gsi8r5EcXjLpBfXpg8y7rx8m8lnow1Zs7HvFnxI4lRfuuYqTVHpvYvebMCR9msbuEcKaVGgvxHCNgn65nFoFXSDl-ahCkeaZaPB4nCLBZJQ6Js7UqGg434PuqE0m0fh5TKymIkquQYOPgj2RYDrR18OEA5E3GZKf5jPcnJz9jKmupjC6N2RSA3zJK8iH0hCaqEnXI8fOiEGswbXfT_w");

		driver.findElement(By.id("usernameInput-input")).sendKeys("asfgsdahaasdgsdfhdtjy@#$");
		driver.findElement(By.name("password")).sendKeys("sdgsdgdfgdfjh");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(2000);
		String expectedErr = "Please enter a username or card number without special characters.";
		String actualErr= driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
      
		System.out.println(actualErr);
		
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
		}
	}

}
