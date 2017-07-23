package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://example.selenium.jp/reserveApp");
		driver.findElement(By.id("guestname")).sendKeys("サンプルユーザ");
		driver.findElement(By.id("goto_next")).click();
		driver.quit();
	}

}
