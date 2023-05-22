package methods;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		//Implicit Commands
		driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(10)));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();	
		
		
		
		//Explicit Wait
		//declare
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement profile= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[1]//a[1]//span[1]")));
		profile.click();
		
		//Navigation Commands
		driver.navigate().to("https://www.amazon.com.tr/?&tag=trtxtgoabkde-21&ref=pd_sl_7r6v9rntlw_e&adgrpid=119366379979&hvpone=&hvptwo=&hvadid=542862704348&hvpos=&hvnetw=g&hvrand=7704726470175378551&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1012782&hvtargid=kwd-10573980&hydadcr=12932_2246093&language=tr_TR");
		driver.navigate().to("https://prod-auth.cloud.utest.com/auth/realms/applause/protocol/openid-connect/auth/?client_id=tester-app&response_type=code&redirect_uri=https%3A%2F%2Fplatform.utest.com%2Faccount%2Fpayments&state=6qQVCycL1IQi6WOqURX9zFLOV9KorGdU");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		
		
		
	}

}
