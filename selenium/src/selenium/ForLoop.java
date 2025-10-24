package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForLoop {
	ChromeDriver driver;
	
	public ForLoop() {
		driver = new ChromeDriver();
	}
	
	void url(){
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/MEDA/Downloads/checkboxes.html");

		
	}
	
	void forloop() {
		WebElement d = driver.findElement(By.xpath("//input[@value = 'bike']"));

		d.click();
		
		for (int i = 0;i<=10; i++) {
			if (d.isSelected()==true) {
				System.out.println("checkbox is selected");
				d.click();
			} else {
				System.out.println("checkbox is not selected");
				d.click();
			}
		}
		driver.quit();
	}

	public static void main(String[] args) {
		ForLoop f = new ForLoop();
		
		f.url();
		f.forloop();

	}

}
