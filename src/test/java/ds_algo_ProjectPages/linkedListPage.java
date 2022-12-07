package ds_algo_ProjectPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class linkedListPage 
{
	WebDriver driver;
	
	public linkedListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (xpath="//div[@class='nav-item dropdown']/a") WebElement ddList;
	@FindBy (linkText="Linked List") WebElement linkList;
	@FindBy (xpath="//a[normalize-space()='Introduction']") WebElement Intro;
	@FindBy() WebElement create;
	@FindBy() WebElement typeList;
	@FindBy() WebElement ImpPython;
	@FindBy() WebElement traverse;
	@FindBy() WebElement insert;
	@FindBy() WebElement delete;
	@FindBy (xpath="//a[@class='btn btn-info']") WebElement tryLink;
	@FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement editor;
	@FindBy (xpath="//button[text() = 'Run']") WebElement runLink;
	
	public void LLClick()
	{
		ddList.click();
		linkList.click();
	}
	
	public void tryEditor()
	{
		tryLink.click();
	}

	public void typeCode()
	{
		editor.sendKeys("print('Hello World')");	
	}
	
	public void runClick()
	{
		runLink.click();
	}
	
	public void goBack()
	{
		driver.navigate().back();
	}

	public void listEltsClick() throws InterruptedException
	{
		List<WebElement> linkListElts=driver.findElements(By.xpath("//a[@class='list-group-item']"));
		int size=linkListElts.size();
		
		for(int i=0;i<size;i++)
		{
			Thread.sleep(200);
			System.out.println(linkListElts.get(i).getText());
			linkListElts.get(i).click();
			tryEditor();
			typeCode();
			runClick();
			driver.get("https://dsportalapp.herokuapp.com/linked-list/");
			linkListElts=driver.findElements(By.xpath("//a[@class='list-group-item']"));
		}
		
	}
	
	public void practiceQues()
	{
		driver.get("https://dsportalapp.herokuapp.com/linked-list/introduction/");
		WebElement PQ=driver.findElement(By.xpath("//div[@id='content']/a"));
		System.out.println(PQ.getText());
		PQ.click();
		driver.navigate().back();
	}
}
