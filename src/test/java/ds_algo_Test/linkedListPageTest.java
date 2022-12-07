package ds_algo_Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import ds_algo_ProjectPages.BaseClass;
import ds_algo_ProjectPages.linkedListPage;

public class linkedListPageTest extends BaseClass
{
	@Test
	public void LList() throws InterruptedException
	{
//		signInPageTest signObj=new signInPageTest();
//		signObj.signInClick();
		//WebDriver driver=null;
		linkedListPage listObject= new linkedListPage(driver);
		listObject.LLClick();
		listObject.listEltsClick();
		listObject.practiceQues();
	}

}
