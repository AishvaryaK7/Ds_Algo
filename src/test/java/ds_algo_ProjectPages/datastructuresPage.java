package ds_algo_ProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class datastructuresPage
{
	WebDriver driver;

	//@FindBy (xpath="//div[@class='col'][1]//a") WebElement dsLink; 
	@FindBy(xpath = "//a[@href='data-structures-introduction']") WebElement dsLink; 
	@FindBy (xpath="//a[@class='list-group-item']") WebElement tcmplxLink;
	@FindBy (xpath="//a[@class='btn btn-info']") WebElement tryLink;
	@FindBy (xpath="//form[@id='answer_form']/div/div/div/textarea") WebElement editor;
	@FindBy (xpath="//button[text() = 'Run']") WebElement runLink;
	
	public datastructuresPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		System.out.println("Inside DS");
	}
	
	public void dslinkclick() 
	{
		System.out.println("Before DS Link Click");
		dsLink.click();
		System.out.println("After DS Link Click");
	}
	
	public void timeComplx()
	{
		tcmplxLink.click();
	}

	public void tryEditor()
	{
		tryLink.click();
	}

	public void typeCode()
	{
		editor.sendKeys("print('Hello World')");	
		System.out.println("Code Entered");
	}
	
	public void runClick()
	{
		runLink.click();
		System.out.println("After Run Click");
	}
}
