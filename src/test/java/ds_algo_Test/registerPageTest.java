package ds_algo_Test;

import org.testng.annotations.Test;

import ds_algo_ConfigProperties.configProperties;
import ds_algo_ProjectPages.BaseClass;
import ds_algo_ProjectPages.registerPage;

public class registerPageTest extends BaseClass
{

	@Test(priority=1)
	public void registerClick() throws InterruptedException
	{
		registerPage registerObj = new registerPage(driver);
		registerObj.registerClick();
		registerObj.setUserName(configProperties.userName);
		registerObj.setPassword(configProperties.passwd);
		registerObj.setConfirmPass(configProperties.passwd);
		registerObj.registerBtn();
		System.out.println("Registeration Sucess");
	}
	
	@Test(priority=2)
	public void regPassMismatch() throws InterruptedException
	{
		registerPage registerObj = new registerPage(driver);
		registerObj.registerClick();
		registerObj.setUserName(configProperties.userName);
		registerObj.setPassword(configProperties.passwd);
		registerObj.setConfirmPass("1111aaaa");
		registerObj.registerBtn();
		System.out.println("Password Mismatch");
	}
	
	@Test(priority=3)
	public void regPassEmpty() throws InterruptedException
	{
		registerPage registerObj = new registerPage(driver);
		registerObj.registerClick();
		registerObj.setUserName(configProperties.userName);
		registerObj.setPassword("");
		registerObj.setConfirmPass("");
		registerObj.registerBtn();
		System.out.println("Password Empty");
	}
	
	

}
