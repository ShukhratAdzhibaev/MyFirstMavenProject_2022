package page.objects;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import TestWithPageObjectModel.CheapOAir_pageFactoryModel;

public class CheapOAirDemoTest {

	private String practiceURL = "https://www.cheapoair.com/";
	private WebDriver driver;
	private int numberofSeniors = 2;
	private CheapOAir_pageFactoryModel cheapOAir_pageFactoryModel;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(-1200, 0));
		driver.manage().window().maximize();
		cheapOAir_pageFactoryModel = new CheapOAir_pageFactoryModel(driver);
		driver.get(practiceURL);
	}

	@Test
	public void testFromBox() {

		cheapOAir_pageFactoryModel.clearFromBox();
		cheapOAir_pageFactoryModel.clickFromBox();
		cheapOAir_pageFactoryModel.insertIntoFromBox("JFK");
		cheapOAir_pageFactoryModel.arrowdownOnFromBox();
		cheapOAir_pageFactoryModel.pressEnterOnFromBox();
		cheapOAir_pageFactoryModel.cleartoBox();
		cheapOAir_pageFactoryModel.clicktoBox();
		cheapOAir_pageFactoryModel.insertIntoToBox("TAS");
		//cheapOAir_pageFactoryModel.arrowdownOnToBox();
		cheapOAir_pageFactoryModel.pressEnterOnToBox();
		cheapOAir_pageFactoryModel.selectDepartureDate();
		cheapOAir_pageFactoryModel.selectReturningDate();

	}

	

}