package TestWithPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.objects.LetsKodeIt;

public class PageObjectModelDemo1 {

	private String url = "https://courses.letskodeit.com/practice";
	private WebDriver driver;
	private LetsKodeIt LetsKodeIt;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(-1200, 0));
		driver.manage().window().maximize();
		LetsKodeIt = new LetsKodeIt(driver); // creating new object 'objectlist' from class name 'LetsKodeIt' while
												// creating an object it will pass driver object

	}

	//@Test
	public void testPOM() {
		driver.get(url);

		// BMW radio button
		//driver.findElement(By.id("bmwradio")).click();
		LetsKodeIt.clickBMWRadioButton();
		LetsKodeIt.clickOpenWindowButton(); // please see LetsKodeIt.class
		LetsKodeIt.searchBoxInsername("Shurik");
		LetsKodeIt.clickHondaStaticDropDown();

	}
	
	@Test
	public void testPageFactory() {
		
		LetsKodeItPageFactoryModel letsKodeItPageFactoryModel =new LetsKodeItPageFactoryModel(driver);
		driver.get(url);
		letsKodeItPageFactoryModel.clickBMWRadioButton();
		
	}
	
	
}
