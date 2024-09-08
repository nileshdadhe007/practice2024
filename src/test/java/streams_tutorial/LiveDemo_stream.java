package streams_tutorial;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo_stream {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\nilesh software training\\selenium installation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();

		List<WebElement> elementList = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		List<String> originalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		List<WebElement> sortedList = elementList.stream().sorted().collect(Collectors.toList());
		
		Assert.assertTrue(originalList.equals(sortedList));
		
		List<String> price = elementList.stream().filter(s->s.getText().contains("Beans")).
		map(s->getPriceVeggies(s)).collect(Collectors.toList());
		price.forEach(a->System.out.println(a));

	}

	private static String getPriceVeggies(WebElement s) {
		String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return priceValue;
	}

}
