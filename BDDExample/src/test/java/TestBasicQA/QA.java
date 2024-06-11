package TestBasicQA;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QA {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://ebay.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String actitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		//Assert.assertTrue(actitle, false);
		
		
		driver.close();

	}

}
