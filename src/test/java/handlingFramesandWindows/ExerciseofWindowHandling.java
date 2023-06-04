package handlingFramesandWindows;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseofWindowHandling {

	public static void main(String[] args) {
		
		/*Search, Opening links, switch to browser windows, capture titles, close all browser windows
		https://testautomationpractice.blogspot.com/

		iframe:
		http://the-internet.herokuapp.com/iframe*/
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
		driver.findElement(By.xpath("//input[@class='wikipedia-search-input']")).sendKeys("cats");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> options =driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']//a"));
		System.out.println(options.size());
		
		for(WebElement x:options)
		{
			String text = x.getText();
			System.out.println(text);
			
			if(text.equals("Cat"))
			{
				x.click();
				break;
			}
			
		};
		
		Set <String> ids = driver.getWindowHandles();
		
		for(String windowid:ids ) 
		{
			String title = driver.switchTo().window(windowid).getTitle();

			if(title.equals("Cat - Wikipedia")) 
			{
				System.out.println("nice job");
				driver.close();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
