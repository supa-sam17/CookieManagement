package Chrome.ESBCookies;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class baseTest {
	

		
		@Test
		public void scenario1() throws InterruptedException 
		{
			System.out.println("Strictly Necessary Cookies");
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Sam\\Documents\\Unified Functional Testing\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
			
			driver.manage().deleteAllCookies();//clears cookies and cache
			System.out.println("Cleared all cookies and cache");
			Thread.sleep(7000);
			driver.get("https://test.esbinternational.ie/#");//calls URL
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='onetrust-pc-btn-handler']")).click();
			driver.findElement(By.id("ot-header-id-C0001")).click();
			System.out.println(driver.findElement(By.xpath("//div[@class='ot-always-active']")).getText());
			//add checks Performance Cookies and Targeting Cookies
			driver.findElement(By.id("ot-header-id-C0002")).click();
			if (driver.findElement(By.id("ot-group-id-C0002")).getAttribute("aria-checked").contains("false"))
			{	
				System.out.println("Performance Cookies is Disabled!");
					Assert.assertTrue(true);
			}
			else
			{	
				System.out.println("Performance Cookies is Enabled!");
				Assert.assertTrue(false);
			}
			
			driver.findElement(By.id("ot-header-id-C0004")).click();
			if (driver.findElement(By.id("ot-group-id-C0004")).getAttribute("aria-checked").contains("false"))
			{	
				System.out.println("Targeting Cookies is Disabled!");
					Assert.assertTrue(true);
			}
			else
			{	
				System.out.println("Targeting Cookies is Enabled!");
				Assert.assertTrue(false);
			}
			
			
			driver.findElement(By.cssSelector("button[class='save-preference-btn-handler onetrust-close-btn-handler']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='heroBanner']//div//div//div//a")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='item1']//span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='logoheader']//a//img")).click();
			Thread.sleep(2000);
			driver.get("https://test.esbinternational.ie/#");//calls URL
			Thread.sleep(5000);
					
			driver.close();
			
		
		
		
	}

}
