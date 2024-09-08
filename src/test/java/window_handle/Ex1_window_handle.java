package window_handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_window_handle {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	driver.findElement(By.className("blinkingText")).click();
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	String parentWindow = it.next();
	String childWindow = it.next();
	driver.switchTo().window(childWindow);	
System.out.println(	driver.findElement(By.xpath("//p[@class='im-para red']")).getText());	
String emailID = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
System.out.println(emailID);
//tocheck and write code in runtime need to add breakpoint and rightclick on the expression and select watch 
driver.switchTo().window(parentWindow);
driver.findElement(By.id("username")).sendKeys(emailID);

}

}
