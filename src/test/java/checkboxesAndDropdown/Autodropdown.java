package checkboxesAndDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autodropdown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='G43f7e']//li[contains(@class,'sbct')]"));
		
		System.out.println(options.size()); //size of the options
		
		for(WebElement x: options)  //print the options
		{
			String text = x.getText();
			if(text.equals("selenium")) 
			{
				x.click();
				break;
			}
		}
		

	}

}
