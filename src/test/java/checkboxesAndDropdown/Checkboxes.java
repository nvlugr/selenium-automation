package checkboxesAndDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));
		System.out.println(checkboxes.size());
		
		// for loop 
		for(int i=0; i<checkboxes.size(); i++ )
		{
		checkboxes.get(i).click();		
		}
		
		//enhanced for loop
		for(WebElement chckbx:checkboxes)
		{
			chckbx.click();
		}
		
		
		//select last 3 checkboxes size-  how many boxes selected 7-3=4
		for(int i=4; i<checkboxes.size(); i++ )
		{
		checkboxes.get(i).click();		
		}
		
		Thread.sleep(4000);
		
		for(int c=0; c<checkboxes.size();c++) 
		{
			if(checkboxes.get(c).isSelected()) 
			{
				checkboxes.get(c).click();
			}
		}
		
	}

}
