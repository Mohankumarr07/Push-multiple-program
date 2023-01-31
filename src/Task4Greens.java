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

public class Task4Greens {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mohan\\eclipse-workspace\\Selenium Day 7 Projecta\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.greenstechnologys.com/");
		
		Thread.sleep(2000);
		WebElement btnclick = driver.findElement(By.xpath("//button[@type='button']"));
		btnclick.click();
		
		
		WebElement scroolperumbbakam = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)",scroolperumbbakam);
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		
		File file = new File("E:\\screenshot\\ perumbbakamshot.jpeg");
		FileUtils.copyFile(screenshotAs, file);
		
		
		
		
		
	

}
}