package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/MEDA/Downloads/dropdown.html");

		List<WebElement> Wl = driver.findElements(By.xpath("//select/option"));
		int count = Wl.size();

		Select S1 = new Select(driver.findElement(By.xpath("//select")));
		S1.selectByIndex(count - 2);
		driver.quit();

	}

}
