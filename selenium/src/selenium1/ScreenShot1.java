package selenium1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenShot1 {
	TestNgScreenshot t1 = new TestNgScreenshot();
	
	@Test 
	public void Dologin(){
		t1.driver = new ChromeDriver();
	    t1.driver.manage().window().maximize();
	    t1.driver.get("https://www.facebook.com/");
	    t1.driver.findElement(By.id("wrong_email")).click();
	}
	@AfterMethod
	public void TakeScreenshot(ITestResult result2) throws Exception {
		t1.capturescreenshot(result2);
	}

}
