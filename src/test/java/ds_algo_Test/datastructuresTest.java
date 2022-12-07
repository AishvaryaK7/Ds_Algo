package ds_algo_Test;

import org.testng.annotations.Test;

import ds_algo_ProjectPages.BaseClass;
import ds_algo_ProjectPages.datastructuresPage;

public class datastructuresTest extends BaseClass
{	
	@Test
	public void dsButton() throws InterruptedException
	{
		signInPageTest signObj=new signInPageTest();
		signObj.signInClick();
		datastructuresPage dsObject = new datastructuresPage(driver);
		dsObject.dslinkclick();
		dsObject.timeComplx();
		dsObject.tryEditor();
		dsObject.typeCode();
		dsObject.runClick();
		driver.navigate().back();
	}
	
}
