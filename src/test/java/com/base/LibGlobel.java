package com.base;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobel {
	public static WebDriver driver;

	 public static final String AUTOMATE_USERNAME = "lathanaidu1";
	  public static final String AUTOMATE_ACCESS_KEY = "HtC96AkaXeq1RitGvTJT";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static WebDriver getDriverCloud() throws MalformedURLException {
		if (driver == null) {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("os_version", "10");
			caps.setCapability("resolution", "1920x1080");
			caps.setCapability("browser", "Chrome");
			caps.setCapability("browser_version", "86.0 beta");
			caps.setCapability("os", "Windows");
			driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		}
		return driver;
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-workspace\\Cucu\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

		return driver;
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();

	}

	public static void loadUrl(String data) {
		driver.get(data);
	}

	public static void type(WebElement s, String data) {
		s.sendKeys(data);

	}

	public static void btnClick(WebElement w) {
		w.click();
	}

	public static void quite() {
		driver.quit();

	}

	public static void selectDataBytext(WebElement element, String data) {
		Select s = new Select(element);
		s.selectByVisibleText(data);
	}

	public static void getTxet(WebElement element) {
		String name = element.getAttribute("value");
		System.out.println("order number is" + name);
	}

	public static void getops(WebElement element, String data) {

		Select se = new Select(element);
		List<WebElement> list = se.getOptions();
		for (int i = 0; i < list.size(); i++) {
			WebElement we = list.get(i);
			String name = we.getText();
			System.out.println(name);
			String name1 = we.getAttribute(data);
			System.out.println(name1);
		}

	}
}
