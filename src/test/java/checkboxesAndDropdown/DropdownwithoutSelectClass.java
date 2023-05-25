package checkboxesAndDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownwithoutSelectClass {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> days=driver.findElements(By.xpath("//input[contains(@class,'form-check-input')][contains(@type, 'checkbox')]"));
		
		for(WebElement x:days) 
		{
			x.click();
			
			System.out.println(x.getAttribute("id"));
				
		}
	}

}
