package d_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex1_iframe {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
System.out.println(driver.findElements(By.tagName("iframe")));
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
WebElement source = driver.findElement(By.id("draggable"));
WebElement target = driver.findElement(By.id("droppable"));
Actions a= new Actions(driver);
a.dragAndDrop(source, target).build().perform();
driver.switchTo().defaultContent();
}
}
