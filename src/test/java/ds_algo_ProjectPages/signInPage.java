package ds_algo_ProjectPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signInPage
{
	WebDriver driver;
	
	@FindBy (xpath="//a[contains(text(),'Sign in')]") WebElement lpSignIn;
	@FindBy (xpath="//input[@id='id_username']") WebElement userNameSignIn;
	@FindBy (xpath="//input[@id='id_password']") WebElement passwordSignIn;
	@FindBy (xpath="//input[@value='Login']") WebElement login;
	
	public signInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		System.out.println("Sign In Landing Page Click");
	}
	
	public void signInClick()
	{
		lpSignIn.click();
	}
	
	public void setUserName(String user)
	{
		userNameSignIn.sendKeys(user);
	}
	
	public void setPassword(String passwd)
	{
		passwordSignIn.sendKeys(passwd);
	}
	
	public void signInBtn()
	{
		login.click();
	}

}
