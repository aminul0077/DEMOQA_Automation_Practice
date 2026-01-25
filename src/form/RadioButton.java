package form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {
	
	WebDriver driver;
	String url;

	public RadioButton(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	public void AccessSite(String url) {
		this.url = url;
		driver.get(url);
	}
	
	public void FindMale() {
		WebElement element = driver.findElement(By.id("gender-radio-1"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();
	}

}
