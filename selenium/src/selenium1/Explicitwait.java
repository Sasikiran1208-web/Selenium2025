package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(5000);
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(5000);
		mywait.until(ExpectedConditions.titleContains("OrangeHRM"));
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class='oxd-dropdown-menu']/li/a[text()='Logout']")));
	    driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li/a[text()='Logout']")).click();
	       
	       driver.quit();

	}

}
