package handlingFramesandWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseofFrameHnadling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://the-internet.herokuapp.com/iframe");
	
		
		driver.switchTo().frame("mce_0_ifr");
		
		driver.findElement(By.xpath("//body[@class='mce-content-body ']")).clear();
		
		driver.findElement(By.xpath("//body[@class='mce-content-body ']")).sendKeys("neval");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[@title='Bold']")).click();
		
		
		

	}

}
