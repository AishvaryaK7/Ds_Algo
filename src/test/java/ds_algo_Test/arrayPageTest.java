package ds_algo_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ds_algo_ProjectPages.BaseClass;
import ds_algo_ProjectPages.arrayPages;

public class arrayPageTest extends BaseClass
{
	@Test
	public void arrayBtn() throws InterruptedException 
	{
		//signInPageTest signObj=new signInPageTest();
		//signObj.signInClick();
		arrayPages arrObject=new arrayPages(driver);
		arrObject.itemClick();
		arrObject.arrEltClick();
		arrObject.practiceQues();
		arrObject.goBack();
	}
}
