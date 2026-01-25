package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import form.CheckBox;

public class CheckBoxTestCase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		CheckBox uCheckBox = new CheckBox(driver);
		uCheckBox.AccessSite("https://demoqa.com/automation-practice-form");
		uCheckBox.ClickonCheckBox();

	}

}
