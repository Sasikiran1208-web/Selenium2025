package selenium1;

import java.io.File;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TestNgScreenshot {
	WebDriver driver;
	
	
	public void capturescreenshot(ITestResult result) throws Exception {
		if(ITestResult.FAILURE==result.getStatus()) {
			TakesScreenshot ts =(TakesScreenshot)driver;
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
			File destfolder = new File("./screenshots"+result.getName()+".png");
			FileUtils.copyFile(sourcefile, destfolder);
			System.out.println(result.getName()+"method() failed, screenshot captured");
		}
	}  

}
