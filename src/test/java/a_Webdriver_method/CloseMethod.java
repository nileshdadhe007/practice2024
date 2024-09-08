package a_Webdriver_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		 
		 ChromeDriver driver =new ChromeDriver();
		 driver.close();
		
		
	}

}