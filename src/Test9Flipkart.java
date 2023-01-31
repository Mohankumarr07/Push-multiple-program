import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9Flipkart {
public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\eclipse-workspace\\Selenium Day 7 Projecta\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.flipkart.com/");
		WebElement btnclick = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclick.click();
		
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.click();
		search.sendKeys("Applephone13");
		
		WebElement submint = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		submint.click();
		
		Thread.sleep(2000);
		TakesScreenshot tc =(TakesScreenshot)driver;
		File screenshotAs = tc.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		File file = new File("E:\\screenshot\\applephone.jpeg");
		FileUtils.copyFile(screenshotAs, file);
		
				
		

}
}
