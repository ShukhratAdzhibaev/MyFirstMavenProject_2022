package TestWithPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsKodeItPageFactoryModel {

	private WebDriver driver;

	// Locators:

	@FindBy(id = "bmwradio")
	WebElement bmwRaadioButton;

	// Constructor

	public LetsKodeItPageFactoryModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //initializing page factory 

	}

	//Actions
	
	public void clickBMWRadioButton() {
		
	bmwRaadioButton.click();	
	}
	
}
