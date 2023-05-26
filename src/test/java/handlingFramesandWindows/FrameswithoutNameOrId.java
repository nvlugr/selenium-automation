package handlingFramesandWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameswithoutNameOrId {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Frame without id or name taken as WebElement
		
		WebElement frm1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frm1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hello");
		
		
		driver.switchTo().defaultContent();
		
		//Frame3
		
		WebElement frm3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frm3);
		
		driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("hi");
		
		//inner frame
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("div.AB7Lab")).click();
		
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
