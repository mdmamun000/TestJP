package TestProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QAJava {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdmam\\Downloads\\chromedriver-124\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com/");
		
		String title = driver.getTitle();
		System.out.println("the title is: "+title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
			
		}
		
		driver.close();

	}

}
