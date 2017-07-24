/**
 *
 */
package sample;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author datanaka
 *
 */
public class SampleScript2 {
	private WebDriver driver;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testSuccess01() {
		driver.get("http://example.selenium.jp/reserveApp");
		assertThat(driver.getTitle(), is("予約情報入力"));
	}

	@Test
	public void testFailure01() {
		driver.get("http://example.selenium.jp/reserveApp");
		assertThat(driver.getTitle(), not("予約情報"));
	}

}
