package ds_algo_Test;


import org.testng.annotations.Test;

import ds_algo_ProjectPages.BaseClass;
import ds_algo_ProjectPages.homePage;

public class homePageTest extends BaseClass 
{

	@Test
	public void clickGetStarted()
	{
		homePage hpObject = new homePage(driver);

	}
	
}
