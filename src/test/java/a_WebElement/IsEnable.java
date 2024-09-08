package a_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IsEnable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
{
	System.out.println("its enabled");
	
}
//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
//if inabled not working then we can use changing attribute of the attribute value
}

}
