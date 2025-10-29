package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScraping {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://books.toscrape.com/");

		List<WebElement> li = driver.findElements(By.xpath("//li//h3//a[@title]"));

		for (WebElement x : li) {
            String s = x.getAttribute("title");
            System.out.println(s);
            
		}
    
	}
        
}
