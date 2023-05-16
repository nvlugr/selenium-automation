package locatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		
		// //tag[attribute='value']
		
		//Relative Xpath
		driver.findElement(By.xpath("//a[normalize-space()='Resources']")).click();
		
		//Absolute Xpath
		driver.findElement(By.xpath("/html[1]/body[1]/header[1]/nav[1]/div[1]/div[2]/ul[1]/li[6]/ul[1]/li[1]/a[1]")).click();
		
		//Xpath Methods
		
		//text() for static texts
		
		driver.findElement(By.xpath("//a[text()='Visit Website']")).click();
		
		// contain(text(), 'text') for dynamic texts-partial text
		
		driver.findElement(By.xpath("//a [contains(text(), 'Tools')]")).click();
		
		//start-with(text(),'Pragmatic')
		
		//More than one attribute: tagName[@attribute='value'][@attribute='value']
		//[@attribute='value' and @attribute='value']
		
		
		
		
		
		
		
	}
	
}    
