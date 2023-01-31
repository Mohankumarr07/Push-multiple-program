import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6Greenstech {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\eclipse-workspace\\Selenium Day 7 Projecta\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		WebElement scrolldown = driver.findElement(By.xpath("//h3[@title='Top Selenium Trends In 2020']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
		
		TakesScreenshot tc = (TakesScreenshot)driver;
		File screenshotAs = tc.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		Thread.sleep(2000);
		File file = new File("E:\\screenshot\\seleniumtrends.jpeg");
		FileUtils.copyFile(screenshotAs, file);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
