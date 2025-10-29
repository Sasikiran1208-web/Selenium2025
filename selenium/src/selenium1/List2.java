package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/MEDA/Desktop/Mahesh%20Selenium/Welcome.html");
		List<WebElement> li = driver.findElements(By.xpath("//form/input"));
        
		for (WebElement x : li) {
			x.sendKeys("Sasi Kirannnn");
		}
		System.out.println("Hello child branchss");
	}

}
