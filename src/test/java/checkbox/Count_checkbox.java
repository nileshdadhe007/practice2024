package checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_checkbox {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	List<WebElement> count = driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println("no of webelement in the webpage:"+count.size());
	for(WebElement count1:count)
	{
		System.out.println(count1.isDisplayed());
	}
	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
	System.out.println(	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

}
}
