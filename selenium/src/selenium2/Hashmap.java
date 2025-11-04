package selenium2;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashmap {
	public static HashMap<String, String> getCredentialsMap() {
		HashMap<String, String> userMap = new HashMap<String, String>();

		userMap.put("customer", "mahesh@mahesh");
		userMap.put("admin", "Neeraj@Neeraj");
		userMap.put("seller", "Amit@Amit");
		userMap.put("distributor", "suresh@suresh");
		userMap.put("delivery girl", "Huma@Huma");
		userMap.put("customer", "Raj@Raj");

		
		return userMap;
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		HashMap<String, String> userMap = getCredentialsMap();

		for (Map.Entry<String, String> entry : userMap.entrySet()) {
			String role = entry.getKey();
			String credentials = entry.getValue();

			String[] st = credentials.split("@");
			String username = st[0];
			String password = st[1];

			System.out.println("Role: " + role);
			System.out.println("Username: " + username);
			System.out.println("Password: " + password);
			System.out.println("-------------------------");

			driver.manage().window().maximize();
			driver.get("https://classic.freecrm.com/index.html");

			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//input[@value='Login']")).click();

		}
		    driver.quit();
	}
}
