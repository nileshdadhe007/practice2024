package a_Locator;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locator_id__name_classname_rahulShetty {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("nilesh123");
		driver.findElement(By.className("submit")).click();
		//when class name include spaces then there are 2 classes
		//cssSelector
		//Class name-->tagname.classname
		//id-->tagname#id
		//tagname[attribute='value'];
		String errorCode=driver.findElement(By.cssSelector("p.error")).getText();	
	System.out.println(errorCode);	
	driver.findElement(By.linkText("Forgot your password?")).click();	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("john");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
	//driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("9623218871");
	driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	System.out.println(	driver.findElement(By.xpath("//form/p")).getText()); 
}

}
