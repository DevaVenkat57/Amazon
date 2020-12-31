package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	 public static WebDriver driver;

	public WebDriver getDriver() {

		WebDriverManager.chromedriver().setup();
		if (driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}

	public void loadUrl(String url) {
		driver.get(url);

	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public WebElement findElementByid(String data) {
		return driver.findElement(By.id(data));

	}

	public void clear(WebElement element) {
		element.clear();

	}

	public WebElement findElementByxPath(String data) {
		return driver.findElement(By.xpath(data));
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public boolean isSelected(WebElement element) {
		return element.isSelected();
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public void type(WebElement element, String data) {
		if (isDisplayed(element) && isEnabled(element) && data != null)
			element.sendKeys(data);
	}

	public void click(WebElement element) {
		element.click();

	}

	public void clickJS(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);

	}

	public void typeJS(WebElement element, String data) {
		((JavascriptExecutor) driver).executeScript("arguments[0].setAtrribute('value','" + data + "')", element);

	}

	public void selectByValue(WebElement element, String data) {
		new Select(element).selectByValue(data);

	}

	public String getAttribute(WebElement element) {

		return element.getAttribute("value");

	}

	public String getText(WebElement element) {
		return element.getText();

	}

	public void selectByVisibleText(WebElement element, String data) {
		new Select(element).selectByVisibleText(data);

	}

	public void selectByIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);

	}

	public void quitBrowser() {
		driver.quit();

	}

	public void closeBrowser() {
		driver.close();

	}
	
	private void greens() {
		// TODO Auto-generated method stub

	}



}
