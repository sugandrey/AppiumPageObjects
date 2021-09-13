package testcases;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import basefortestcases.TestBase;
import screens.ChooseTopicsScreen;
import screens.LoginScreen;

public class FlipboardLoginTest extends TestBase {
	
	LoginScreen loginScreen;
	ChooseTopicsScreen topicScreen;
	
	@BeforeTest
	public void initDriver() {
		
		setUp();
		loginScreen = new LoginScreen(driver);
		topicScreen = new ChooseTopicsScreen(driver);
	}
	
	@Test(priority=1)
	public void validateGetStartedButton() {
		
		loginScreen.clickGetStartedButton();
		Assert.fail("The test is failed");
		
	}
	
	
	@Test(priority=2)
	public void chooseTopicsTest() {
		
		topicScreen.chooseTopics(4).clickContinue();
		
		
	}
	
	@AfterTest
	public void quitDriver() {
		quit();
	}

}
