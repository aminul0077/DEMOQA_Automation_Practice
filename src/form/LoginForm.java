package form;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginForm {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public LoginForm(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
	}
	
	private By userName = By.id("userName");
	private By uPassword = By.id("password");
	private By loginBtn = By.id("login");
	private By logoutBtn = By.id("submit");
	
	public void enterUserName(String uname) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(uname);
	}
	
	public void enterPassword(String upass) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(uPassword)).sendKeys(upass);
	}
	
	public void clickLogin() {
		WebElement btn = wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
		btn.click();
	}
	
	public WebElement getLogoutBtn() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(logoutBtn));
	}

}
