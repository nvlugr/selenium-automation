package handlingFramesandWindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		driver.manage().window().maximize();

		driver.switchTo().frame("packageListFrame");

		driver.findElement(By.linkText("org.openqa.selenium")).click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("packageFrame");

		driver.findElement(By.linkText("WebDriver")).click();

		driver.switchTo().defaultContent();

		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Overview']")).click();

	}

}
