package ds_algo_Test;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotTest 
{
	public static void takeScreenshot() throws IOException
	{
	WebDriver driver= new ChromeDriver();
	TakesScreenshot screenshot= (TakesScreenshot)driver;
	File srcFile= screenshot.getScreenshotAs(OutputType.FILE);
	
	Timestamp ts1 = new Timestamp(System.currentTimeMillis());
	
	String path = "C:/Users/arvin/eclipse-workspace/ds_algoProject/src/test/resources/ScreenShots/screenshot."+ts1+".png";
	File destFile=new File(path);
	FileUtils.copyFile(srcFile, destFile);
	}
	
	public void main(String [] args) throws IOException
	{
		takeScreenshot();
	}
}
