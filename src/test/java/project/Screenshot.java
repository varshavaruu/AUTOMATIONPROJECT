package project;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class Screenshot {
	WebDriver driver;
	public Screenshot (WebDriver driver) {
		this.driver=driver;	
	}
	public void scrn() throws Exception
	{
		driver.get("https://www.storeno6.com");
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("D:\\sternio.png"));
	}

	}
	
	
	


