package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logo {
	WebDriver driver;
	public Logo (WebDriver driver){
		this.driver=driver;
	}
	private boolean Logo;
	public void Logo() {
		boolean Logo=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[1]/div/div/a/img")).isDisplayed();
		if(Logo)
		{
			System.out.println("logo is display");
		}
		else
		{
			 System.out.println("logo is not display");
		}
	}
	
	

}
