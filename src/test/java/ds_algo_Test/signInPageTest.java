package ds_algo_Test;

import org.testng.annotations.Test;

import ds_algo_ConfigProperties.configProperties;
import ds_algo_ProjectPages.BaseClass;
import ds_algo_ProjectPages.signInPage;

public class signInPageTest extends BaseClass
{
	
	@Test
	public void signInClick()
	{		
		signInPage signinObj = new signInPage(driver);
		signinObj.signInClick();
		signinObj.setUserName(configProperties.userName);
		signinObj.setPassword(configProperties.passwd);
		signinObj.signInBtn();
		
	}

}
