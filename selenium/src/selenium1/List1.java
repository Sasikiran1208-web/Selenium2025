package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/MEDA/Desktop/Mahesh%20Selenium/checkboxes.html");
		List<WebElement> wl = driver.findElements(By.tagName("input"));

		for (WebElement x : wl) {
			x.click();
		}
	}

}
