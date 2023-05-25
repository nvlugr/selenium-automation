package alertsAndPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertswithInputBox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

		Alert alertwindow = driver.switchTo().alert();

		alertwindow.sendKeys("welcome");

		alertwindow.accept();

		String actualResult = driver.findElement(By.xpath("//p[@id='result']")).getText();
		String expectedResult = "You entered: welcome";

		if (actualResult.equals(expectedResult)) {
			System.out.println("Test Passed.");
		} else {
			System.out.println("Test Failed!");
		}

	}

}
