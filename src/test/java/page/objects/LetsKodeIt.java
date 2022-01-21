package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;

public class LetsKodeIt {

	private  WebDriver driver;
	//========================Locators==============================================================
	
	// 1.step is keeping all locators of Webelements.We are using 'By' object from Selenium to store all locators
	By bmwRaadioButton=By.id("bmwradio");
	By openWindowButton=By.id("openwindow");
	By searchBox =By.id("name");
	By staticDropDown= By.xpath("//select[@id='carselect']//option[@value='honda']");
	//we can add other object locators here.
	
	
	
	
	//2.step Constructor --> We need a constructor. Our test case will be reading from here and it should use driver object in here.this page is extension page from our testcase
	//In this case 
	
	public LetsKodeIt (WebDriver driver) {
		this.driver=driver;
	};
	
	//3.step Actions
	
	public void clickBMWRadioButton()
	{
		driver.findElement(bmwRaadioButton).click();
	}
	
	public void clickOpenWindowButton() {
		driver.findElement(openWindowButton).click();
	}
	
	public void searchBoxInsername(String name) {
		
		driver.findElement(searchBox).sendKeys(name);;
	}
	
public void clickHondaStaticDropDown () {
		
		driver.findElement(staticDropDown).click();
		
	}	}
