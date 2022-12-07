package ds_algo_ProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registerPage 
{
	WebDriver driver;
	@FindBy (xpath="//a[contains(text(),'Register')]") WebElement lpRegister;
	@FindBy (xpath="//input[@id='id_username']") WebElement userName;
	@FindBy (xpath= "//input[@id='id_password1']") WebElement password;
	@FindBy (xpath="//input[@id='id_password2']") WebElement passConfirm;
	@FindBy (xpath="//input[@value='Register']") WebElement register;
	@FindBy (xpath="//div[@class='alert alert-primary']") WebElement passwdMisMatch;
	
	public registerPage(WebDriver driver) throws InterruptedException
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		Thread.sleep(500);	
	}
	
	public void registerClick()
	{
		lpRegister.click();	
	}
	
	public void setUserName(String user)
	{
		userName.sendKeys(user);
	}
	
	public void setPassword(String passwd)
	{
		password.sendKeys(passwd);
	}
	
	public void setConfirmPass(String passwdConfirm)
	{
		passConfirm.sendKeys(passwdConfirm);
	}
	
	public void registerBtn()
	{
		register.click();
	}
	
	
}
