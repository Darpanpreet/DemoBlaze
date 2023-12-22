package Genericlib;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebdriverCommonlib {

	public static WebDriver driver;

	public static void openBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"chrome driver path");
			// Add your chrome driver path
			
			System.setProperty("webdriver.http.factory", "jdk-http-client");
			driver = new ChromeDriver();
			System.out.println(browserName + "browser is up and running");

		} else if (browserName.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver",
					"Edge driver path");
			// Add your edge driver path
			
			driver = new EdgeDriver();
			System.out.println(browserName + "browser is up and running");

		} else {
			System.out.println("Unable to launch" + browserName + "browser" + ":- Invalid browerName");
		}
	}

	public static void GoogleLink() {
		driver.get("https://google.com");
	}

	public static void openBaseUrl() {
		try {
			driver.get("https://demoblaze.com/");
			System.out.println("Application is up and running");
		} catch (Exception e) {
			System.out.println("Unable to open Url" + e.getMessage());
		}
	}

	public static void navigateUrl(String Url) {
		try {
			// driver.navigate().to(Url);
			driver.get(Url);
			System.out.println("Application is up and running");
		} catch (Exception e) {
			System.out.println("Unable to open Url" + e.getMessage());
		}
	}

	public static void shutdown() {
		driver.quit();
		System.out.println("Shutting down the driver");
	}

	public static void waittime(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public static void urlValidation(String expectedurl) {
		String actualurl = driver.getCurrentUrl();
		System.out.println("Current Url is: " + actualurl);
		System.out.println("Expected Url is: " + expectedurl);
		boolean result = actualurl.equalsIgnoreCase(expectedurl);
		System.out.println("Validation result is: " + result);
	}

	public static void titleValidation(String expectedTitle) {
		String actualTitle = driver.getTitle();
		System.out.println("Current Title is: " + actualTitle);
		System.out.println("Expected Title is: " + expectedTitle);
		boolean result = actualTitle.equalsIgnoreCase(expectedTitle);
		System.out.println("Validated Title is: " + result);
	}

	public static void enterTxt(String locValue, String data) {
		try {
			driver.findElement(By.xpath(locValue)).clear();
			driver.findElement(By.xpath(locValue)).sendKeys(data);
			System.out.println("Entered the - " + data + "into the textbox having" + locValue);
		} catch (Exception e) {
			System.out.println("Unable to enter the data in the textbox having:" + locValue + e.getMessage());
		}
	}

	public static void enterTxt(WebElement element, String data) {
		try {
			element.clear();
			element.sendKeys(data);
			System.out.println("Entered the - " + data + "in the textbox having " + element);
		} catch (Exception e) {
			System.out.println("Unable to enter - " + data + "in the textbox having " + element);
		}
	}

	public static void enterTxt(By locValue, String Data) {
		try {
			driver.findElement(locValue).clear();
			driver.findElement(locValue).sendKeys(Data);
			System.out.println("Entered the - " + Data + "in the textbox having: " + locValue);
		} catch (Exception e) {
			System.out.println("Unable to enter -" + Data + "in the textbox having:" + locValue);
		}
	}

	public static void click(String locValue) {
		try {
			driver.findElement(By.xpath(locValue)).click();
			System.out.println("Clicked on the element having locValue" + locValue);
		} catch (Exception e) {
			System.out.println("Unable to locate click having locvalue" + e.getMessage());
		}
	}

	public static void click(By locValue) {
		try {
			driver.findElement(locValue).click();
			System.out.println("Clicked on the element having locValue" + locValue);
		} catch (Exception e) {
			System.out.println("Unable to locate click having locvalue" + e.getMessage());
		}
	}

	public static void click(WebElement element) {
		try {
			element.click();
			System.out.println("Clicked successfully on: " + element);
		} catch (Exception e) {
			System.out.println("Unable to click on: " + element);
		}
	}

	public static void select(By locName, String Data) {
		try {
			new Select(driver.findElement(locName)).selectByVisibleText(Data);
			System.out.println("Select the " + Data + "using:- " + locName);
		} catch (Exception e) {
			System.out.println("Unable to select the " + Data + "using:- " + locName);
		}
	}

	public static void select(By locName, int no) {
		try {
			new Select(driver.findElement(locName)).selectByIndex(no);
			System.out.println("Select the option having index position: " + no + "using" + locName);
		} catch (Exception e) {
			System.out.println(
					"Unable to select the option having index position: " + no + "using" + locName + e.getMessage());
		}
	}

	public static void alertAction(String action) {
		try {
			if (action.equalsIgnoreCase("ok")) {
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
			} else if (action.equalsIgnoreCase("cancel")) {
				driver.switchTo().alert().dismiss();
			}
		} catch (Exception e) {
			System.out.println("Error in performing action on alertbox " + action + e.getMessage());
		}
	}

	public static void maximize() {
		driver.manage().window().maximize();
	}

}
