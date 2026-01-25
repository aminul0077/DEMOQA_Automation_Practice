package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import form.DropDown;

public class DropDownTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		DropDown uDropDown = new DropDown(driver);
		uDropDown.AccessSite("https://demoqa.com/select-menu");
		uDropDown.ClickByVisibleText();
		uDropDown.ClickBySelectOne();
		uDropDown.FinalSelectedByIndex();

	}

}
