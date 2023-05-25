package alertsAndPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedAlerts {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

		String text = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();

		if (text.contains("Congratulations!")) {
			System.out.println("Test Passed.");
		} else {
			System.out.println("Test Failed!");
		}

	}

}
