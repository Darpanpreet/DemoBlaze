package PageObjectRepolib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Genericlib.WebdriverCommonlib;

public class Login extends WebdriverCommonlib {

	public static By login = By.id("login2");
	public static By username = By.id("loginusername");
	public static By password = By.id("loginpassword");
	public static By LogInButton = By.xpath("//button[text()='Log in']");
	public static By Signup = By.xpath("//a[@id='signin2']");
	public static By SignupUser = By.id("sign-username");
	public static By SignUpPass = By.id("sign-password");
	public static By SignUpButton = By.xpath("//button[text()='Sign up']");
	public static By SignUpText = By.xpath("//h5[@id='signInModalLabel']");
	public static By google = By.className("gLFyf");
	public static By searchBtn = By.xpath("//div[@class='CcAdNb']");

	public static void clicklogin() {
		click(login);
	}
	public static void Username(String user_name) {
		WebElement user = driver.findElement(username);
		user.clear();
		user.sendKeys(user_name);
	}
	public static void password(String Password) {
		WebElement pass = driver.findElement(password);
		pass.clear();
		pass.sendKeys(Password);
	}
	public static void loginbtn() {
		click(LogInButton);
	}
	public static void Signup() {
		click(Signup);
	}
	public static void SignupUsername(String user_name) {
		WebElement username = driver.findElement(SignupUser);
		username.clear();
		username.sendKeys(user_name);
	}
	public static void SignupPassword(String Password) {
		WebElement pass = driver.findElement(SignUpPass);
		pass.clear();
		pass.sendKeys(Password);
	}
	public static void SignUpBtn() {
		click(SignUpButton);
	}
	public static void Signuptext() {
		WebElement text = driver.findElement(SignUpText);
		text.getText();
	}
	public static void google(String url) {
		WebElement text = driver.findElement(google);
		text.clear();
		text.sendKeys(url);
	}
	
	public static void GoogleSrchBtn() {
		click(searchBtn);
	}
	public static void links() {
		List <WebElement> links = driver.findElements(By.tagName("h3"));
		System.out.println("List of links are : " + links);
	}
	
}

