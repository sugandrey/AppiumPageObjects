package testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefortestcases.TestBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.HomeScreen;
import screens.LoginScreen;
import utilities.ScrollUtil;

public class TitleSectionTest extends TestBase{
	
	LoginScreen loginScreen;
	HomeScreen homeScreen;
	
	@BeforeTest
	public void initTest() {
		
		setUp();
		loginScreen = new LoginScreen(driver);
		homeScreen = new HomeScreen(driver);
	}
	
	@Test(priority=1)
	public void validateTitle() {
		
		loginScreen.clickGetStartedButton().chooseTopics(4).clickContinue().skipLogin();
		homeScreen.goToTitleSection(2);
		//takeScreenshot();
		ScrollUtil.scrollUp(2, (AndroidDriver<MobileElement>) driver);
	}
	
	@AfterTest
	public void quitDriver() {
		quit();
	}

}
