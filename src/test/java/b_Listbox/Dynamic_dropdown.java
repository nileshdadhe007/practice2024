package b_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_dropdown {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//dynamic dropdown is change base on the user input
	
		driver.findElement(By.xpath("//div[text()='Agra']")).click();
	}

}
