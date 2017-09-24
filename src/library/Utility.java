package library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	
	
		public static void captureScreenShot(WebDriver driver, String screenShotName){
			//type casted the TakeScrrenshot Interface in driver instance
			TakesScreenshot ts=(TakesScreenshot)driver;
			//file is stored in memory/buffer
			File source=ts.getScreenshotAs(OutputType.FILE);
			try {
				//copied file from one location to other
				FileUtils.copyFile(source, new File ("./screnshots/"+screenShotName+".png"));
				
			} catch (Exception e) {
				
				System.out.println("Exception while taking screenshots"+e.getMessage());
			}
		}
}
