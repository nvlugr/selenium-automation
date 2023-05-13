package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
			public static void main(String[] args) {
				
				WebDriver driver= new ChromeDriver();
				
				//Open the app
				
				driver.get("http://automationpractice.pl/index.php");
				 driver.manage().window().maximize();
				 
				 	//Search box
				 	driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
				 	
				 	//Search button
				 	driver.findElement(By.name("submit_search")).click();
				 	
				 	//LinkText and PartialLinkTest
				 	//driver.findElement(By.partialLinkText("Blouse")).click();
				 	driver.findElement(By.linkText("Blouse")).click();
				 		
				
				

			}

		}


	


