package model;

import org.openqa.selenium.WebDriver;

import form.LoginForm;

public class LoginModel {

	private WebDriver driver;
	private LoginForm form;
	
	
	public LoginModel(WebDriver driver) {
		this.driver = driver;
		this.form = new LoginForm(driver);
	}
	
	public void loginSite(String uname, String pass) {
		form.enterUserName(uname);
		form.enterPassword(pass);
		form.clickLogin();
	}
	
	public void validateLogin() {
		try {
			if(form.getLogoutBtn().isDisplayed()) {
				System.out.println("Login Successfull!!");
				form.getLogoutBtn().click();
				System.out.println("Log Out Successfull!!");
			}
		} catch (Exception e) {
			System.out.println("Login Failed. LogOut Button not Found!");
		}
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
