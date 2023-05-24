package checkboxesAndDropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownswithSelectTag {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drpdwnel=driver.findElement(By.xpath("//select[@class='custom-select']"));
		
		Select drpdwnobj = new Select(drpdwnel);
		
		drpdwnobj.selectByVisibleText("Norway"); //there are also selectbyvalue and selectbyindex options
		
		//Find total options in dropdown menu
		
		List <WebElement> options = drpdwnobj.getOptions();
		 
		System.out.println(options.size());
		
		for(int i=0; i<options.size(); i++) 
		{
			System.out.println(options.get(i).getText());
		}
		
		
		
		 
	}

}
