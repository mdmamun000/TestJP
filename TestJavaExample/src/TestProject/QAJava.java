package TestProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QAJava {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdmam\\Downloads\\chromedriver-124\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com/");
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println("the title is: "+title);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		System.out.println("dropdown elements printed below: **** ");
		List<WebElement> dropdown = driver.findElements(By.id("gh-cat"));
		for (WebElement dropele : dropdown) {
			System.out.println(dropele.getText());
		}
		Actions action = new Actions(driver);
		WebElement ele = driver.findElement(By.linkText("Home & Garden"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(ele));
		action.moveToElement(ele).perform();
		
		System.out.println("all lines are executed -->> testing pass");
		driver.close();

	}

}
