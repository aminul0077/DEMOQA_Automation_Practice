package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {
	
	WebDriver driver;
	String url;

	public CheckBox(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void AccessSite(String url) {
		this.url = url;
		driver.get(url);
	}
	
	public void ClickonCheckBox() {
		WebElement element = driver.findElement(By.id("hobbies-checkbox-1"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
		System.out.println("Sports Checkbox is Clicked Successfully.");
	}
}
