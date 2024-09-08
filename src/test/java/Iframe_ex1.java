import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager; 

public class Iframe_ex1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//i[@class='fa fa-logo ws-hover-text-green']")).click();
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("/html/body/h1")).getText());
		
	}

}
