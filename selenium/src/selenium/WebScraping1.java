package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScraping1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://books.toscrape.com/");
		Thread.sleep(3000);

		for (int i = 1; i <= 20; i++) {
			
			String S ="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/ol[1]/li["+ i +"]/article[1]/h3[1]/a[1][@title]";

			WebElement b = driver.findElement(By.xpath(S));
			System.out.println( b.getAttribute("title"));
		}
		driver.quit();
	}
}
