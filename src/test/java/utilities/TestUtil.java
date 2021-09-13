package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basefortestcases.TestBase;
import screenbase.ScreenBaseClass;

public class TestUtil extends TestBase {

//	public void takeScreenshot() {
//		
//		Date d = new Date();
//		String fileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
//		File srcFile = ((TakesScreenshot) ScreenBaseClass.driver).getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\reports\\" + fileName));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
}
