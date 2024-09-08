package interview_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_without_method {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.yatra.com/");
		// click using sendkeys
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Hotels']")).sendKeys(Keys.ENTER);
		
		//using javaScriptExecutor 1st method
		Thread.sleep(5000);
		WebElement holiday = driver.findElement(By.id("booking_engine_holidays"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", holiday);
		
		//using javaScriptExecutor 2st method
		Thread.sleep(5000);
		js.executeScript("document.getElementById(\"booking_engine_buses\").click()");

		
	}

}
