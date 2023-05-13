
package locatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		//Open the app
		
		driver.get("http://automationpractice.pl/index.php");
		 driver.manage().window().maximize();
		 
		 //Finding the number of the sliders
		 List <WebElement> sliders = driver.findElements(By.className("homeslider-container"));
		 System.out.println("The number of the sliders is " + sliders.size());
		 
		 //Finding the total number of images on the home page
		 List <WebElement> images = driver.findElements(By.tagName("img"));
		 System.out.println("The total number of the images on the home page is "+images.size());
		 
		//Find the total number of links
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		 
		 driver.close();
		 driver.quit(); 
		 
		 
		
		  
		 	
		
 
	}

}

