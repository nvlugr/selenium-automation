package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectors {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.pl/index.php");
		driver.manage().window().maximize();
		
		//CSS Selectors tag-id
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Blouse");
		
		//tag-class
		//driver.findElement(By.cssSelector("input.inputNew")).sendKeys("abc@gmail.com");
		
		//tag-attribute
		//driver.findElement(By.cssSelector("input[type='text']")).sendKeys("T-shirts");
		
		//tag-class-attribute
		driver.findElement(By.cssSelector("input.search_query[name='search_query']")).sendKeys("Jeans");
		
	}

}