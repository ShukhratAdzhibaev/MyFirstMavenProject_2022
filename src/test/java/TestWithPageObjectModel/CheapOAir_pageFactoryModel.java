package TestWithPageObjectModel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheapOAir_pageFactoryModel {
	private WebDriver driver;

	// Locators
	@FindBy(xpath = "//input[@id='from0']")
	WebElement frombox;

	@FindBy(xpath = "//input[@id='to0']")
	WebElement toBox;

	@FindBy(xpath = "//a[@class=' month-date is--today']")
	WebElement Departure_currentDate;

	@FindBy(xpath = "(//a[@class=' month-date'])[15]")
	WebElement twoWeekInFutureDate;

	// Constructor
	public CheapOAir_pageFactoryModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void clearFromBox() {
		frombox.clear();
	}

	public void clickFromBox() {
		frombox.click();
	}

	public void insertIntoFromBox(String DepatureCity) {
		frombox.sendKeys(DepatureCity);
	}

	public void pressEnterOnFromBox() {
		frombox.sendKeys(Keys.ENTER);
	}

	public void arrowdownOnFromBox() {
		frombox.sendKeys(Keys.ARROW_DOWN);
	}

	public void cleartoBox() {
		toBox.clear();
	}

	public void clicktoBox() {
		toBox.click();
	}

	public void insertIntoToBox(String destinationCity) {
		toBox.sendKeys(destinationCity);
	}

	//public void arrowdownOnToBox() {
	//	toBox.sendKeys(Keys.ARROW_DOWN);
	//}

	public void pressEnterOnToBox() {
		toBox.sendKeys(Keys.ENTER);
	}

	public void selectDepartureDate() {
		Departure_currentDate.click();
	}

	public void selectReturningDate() {
		twoWeekInFutureDate.click();
	}
}
