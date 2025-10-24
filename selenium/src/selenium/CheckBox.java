package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/MEDA/Downloads/checkboxes.html");

		WebElement dd = driver.findElement(By.xpath("//input[@value = 'bike']"));

		

		for (int i = 0;i<=10; i++) {
			
			dd.click();
			if (dd.isSelected()==true) {
				System.out.println("checkbox is selected");
				
			} else {
				System.out.println("checkbox is not selecteddd");
				
			}
		}
		driver.quit();

	}

}
