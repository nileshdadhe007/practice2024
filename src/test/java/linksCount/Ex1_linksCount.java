package linksCount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_linksCount {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
List<WebElement> linkCount = driver.findElements(By.tagName("a"));
System.out.println(linkCount.size());
//links from footer section
WebElement footerDriver = driver.findElement(By.className("footer_top_agile_w3ls"));//limiting webdriver scope
System.out.println("no of webelement in footer are: "+footerDriver.findElements(By.tagName("a")).size());
}
}
