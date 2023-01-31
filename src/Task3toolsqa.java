import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3toolsqa {
	
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\eclipse-workspace\\Selenium Day 7 Projecta\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://toolsqa.com/");
		WebElement btnscroll = driver.findElement(By.xpath("//div[text()='Checkout what our Students say about us!']"));
		WebElement btnclick = driver.findElement(By.id("accept-cookie-policy"));
		btnclick.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",btnscroll);
		String text = btnscroll.getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
