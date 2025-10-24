package selenium1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']//span[@class='ui-button-text ui-c'][text()='Show']")).click();
		
		
		mywait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
