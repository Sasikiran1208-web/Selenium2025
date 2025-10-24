package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
        WebElement srh= driver.findElement(By.name("btnK"));
		System.out.println("Label on the button is "+srh.getAttribute("value"));
		
		WebElement Gp =driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		System.out.println("The ToolTip label is "+Gp.getAttribute("aria-label"));
		
		driver.quit();
	}
}
