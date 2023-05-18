package methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();

		//get("url")
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		//getTitle()		
		 
		 String title = driver.getTitle();
		 System.out.println("Title of the webpage: "+ title );
		 
		 //getCurrentUrl()
		 
		 String currentUrl= driver.getCurrentUrl();
		 System.out.println("The URL of the webpage: "+ currentUrl );
		 
		 //getPageSource()

		 String pageSource = driver.getPageSource();
		 System.out.println("Page Source of the webpage: "+ pageSource );
		 
		 //getWindowHandle() getWindowHandles()
		 String windowID = driver.getWindowHandle();
		 System.out.println(windowID);
		 driver.findElement(By.linkText("OrangeHRM, Inc")).click();		 
		 Set<String> windowIDs = driver.getWindowHandles();
		 for(String wind:windowIDs)
		 {
			 System.out.println("WindowId is " +wind);
		 }
	}

}
