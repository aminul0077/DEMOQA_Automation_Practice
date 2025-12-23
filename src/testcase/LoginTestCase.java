package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import model.LoginModel;

public class LoginTestCase {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		
		LoginModel ulogin = new LoginModel(driver);
		ulogin.loginSite("testuser", "Password@123");
		ulogin.validateLogin();
		ulogin.closeBrowser();

	}

}
