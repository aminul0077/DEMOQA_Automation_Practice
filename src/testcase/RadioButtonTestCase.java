package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import form.RadioButton;

public class RadioButtonTestCase {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		RadioButton uRadioButton = new RadioButton(driver);
		uRadioButton.AccessSite("https://demoqa.com/automation-practice-form");
		uRadioButton.FindMale();
	}

}
