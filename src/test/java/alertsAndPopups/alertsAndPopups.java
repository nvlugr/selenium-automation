package alertsAndPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertsAndPopups {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

		// driver.switchTo().alert().accept();

		// Alert alertwindow = driver.switchTo().alert();
		// alertwindow.dismiss();
		// alertwindow.accept();

		Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());

		System.out.println(alertwindow.getText());

		alertwindow.accept();

		// alertwindow.dismiss();

	}

}
