package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* TEST CASE
1) Launch browser
2) open url
	URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
3) Provide username  - admin@yourstore.com
4) Provide password  - admin
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : Dashboard / nopCommerce administration
7) Verify Dashboad

 */

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		
		
		//1. Launch Browser 
		
		WebDriver driver = new ChromeDriver();
		
		//2. Open URL
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//3. Provide Username
		
		//WebElement email = driver.findElement(By.name("Email"));
		// email.sendKeys("Admin");
		 
	  WebElement email= driver.findElement(By.name("Email"));
	  email.clear();
	  email.sendKeys("admin@yourstore.com");
	   
	   //4.Provide a password 
	   
	   WebElement id= driver.findElement(By.name("Password"));
	   id.clear();
	   id.sendKeys("admin");
	   
	   //5. Click on the login button
	   
	   driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button") ).click();
	   
	  /* //6. Verify the title of the page
	   
	  String act_title = driver.getTitle();

	  String expected_title ="Dashboard / nopCommerce administration";
	  
	  System.out.println(act_title);
	  
	  if(act_title.equals(expected_title))
	  {
		System.out.println("Test Passed");

	 } else
	 {
		 System.out.println("Test Failed! ");
	 }
 */
	   
	   //7. Validation after log_in
	   String act_label=null;
	   
	   try 
	   { 
		    act_label = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();	 
	   }
	   catch(NoSuchElementException e)
	   {
		    act_label ="";  
	   }
	   
	   String exp_label = "Dashboard";
	   
	   if(act_label.equals(exp_label)) 
	   {
		   System.out.println("Test passed.");
	   }else
	   {
		   System.out.println("Test is failed!");
	   }
	   
	 //8. Close the browser
	  
	  	// driver.close();
	  
	  driver.quit();	   
	  
	  
	  
}
	
	}
