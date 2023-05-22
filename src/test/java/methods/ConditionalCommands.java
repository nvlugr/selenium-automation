package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		//Conditional Commands can be run via Web Elements and return true or false
		
		//isDisplayed()
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		
		//isEnabled()
		WebElement inputBox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(inputBox.isEnabled());
		
		//isSelected
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		WebElement male_btn = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_btn = driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//Before Selection
		System.out.println("Before selection ");
		System.out.println(male_btn.isSelected());
		System.out.println(female_btn.isSelected());
		//After male selection
		male_btn.click();
		System.out.println("After selection ");
		System.out.println(male_btn.isSelected());
		System.out.println(female_btn.isSelected());
		
	}
 
}
