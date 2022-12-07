
package ds_algo_ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import ds_algo_ConfigProperties.configProperties;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void initializeDriver() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		driver.get(configProperties.url);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[@class='btn']")).click();
	}

}
