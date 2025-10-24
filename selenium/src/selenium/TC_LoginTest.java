package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

class TC_LoginTest {
		ChromeDriver driver;
		
		public TC_LoginTest() {
			driver = new ChromeDriver();
		}
		
		
		
		void enterCredentials(String S2,String S3){
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.findElement(By.name("username")).sendKeys(S2);
			driver.findElement(By.id("password")).sendKeys(S3);
		}
		
		void clickLoginButton() {
			driver.findElement(By.id("submit")).click();
			
		}
		
		void verifyUrlChange() {
			
			String current_url = driver.getCurrentUrl();
			
			
			if(current_url.contains("logged-in-successfully")) {
				System.out.println("Test passed..");
			}
			else {
				System.out.println("Test Failed..");
			}
			
		}
		
		void tearDown() {
			driver.quit();
		}
	
	public static void main(String[] args) {
		TC_LoginTest ob = new TC_LoginTest();
	
		ob.enterCredentials("student", "Password123");
		
		ob.clickLoginButton();
		
		ob.verifyUrlChange();
		
		ob.tearDown();

	}

}
