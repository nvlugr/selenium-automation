package handlingFramesandWindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Handling 2 windows

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();

		Set<String> windowids = driver.getWindowHandles();

		/*
		 * List <String> windowidlist = new ArrayList(windowids);
		 * 
		 * String parentid = windowidlist.get(0);
		 * String childid = windowidlist.get(1);
		 * 
		 * driver.switchTo().window(childid);
		 * 
		 * driver.findElement(By.
		 * xpath("//a[@href='/en/hris-hr-software-demo/']//button[@class='btn btn-ohrm btn-contact-sales']"
		 * )).click();
		 */

		// Handling more than 2 windows
		for (String id : windowids) {
			String title = driver.switchTo().window(id).getTitle();
			// .out.println(title);
			if (title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM")) {
				driver.close();
			}
		}

	}

}
