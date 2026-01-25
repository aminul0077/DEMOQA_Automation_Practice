package form;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DropDown {
	
	WebDriver driver;
	String url, Text, Text1, Text2;

	public DropDown(WebDriver driver) {
		this.driver = driver;
	}
	
	public void AccessSite(String url) {
		this.url = url;
		driver.get(url);
	}
	
	public void ClickByVisibleText() {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".css-yk16xz-control")));
		dropdown.click();
		
		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'option') and text()='Group 1, option 1']")));
		option.click();
	}
	
	public void ClickBySelectOne() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("selectOne")));
		dropdown.click();
		
		List<WebElement> options = 
				driver.findElements(By.xpath("//div[@role='option' or contains(@class, 'option')]"));
		
		if(options.size() == 0) {
			System.out.println("No options etected. UI locator wrong.");
			return;
		}
		
		options.get(0).click();
	}
	
	public void FinalSelectedByIndex() {
		Select uSelect = new Select(driver.findElement(By.xpath("//select[contains(@id,'oldSelectMenu')]")));
		uSelect.selectByIndex(4);
	}

}
