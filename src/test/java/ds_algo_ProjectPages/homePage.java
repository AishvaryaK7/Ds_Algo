package ds_algo_ProjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class homePage
{
	WebDriver driver;

	public homePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		driver.findElement(By.xpath("//button[@class='btn']")).click();
	}
	
}
