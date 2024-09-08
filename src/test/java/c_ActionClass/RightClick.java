package c_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	Actions a= new Actions(driver);
	a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
	//build() ready to execute 
	}

}
