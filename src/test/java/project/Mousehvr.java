package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mousehvr {
	public class Mousehover {
		WebDriver driver;
		By women=By.xpath("//*[@id=\"header\"]/div/div/div[2]/div/nav/div/ul/li[2]/a");
		By saree=By.xpath("//*[@id=\"header\"]/div/div/div[2]/div/nav/div/ul/li[2]/div/div/ul/li[1]/a");
		//By hme=By.xpath("//*[@id=\"header\"]/div/div/div[2]/div/nav/div/ul/li[2]/div/div/ul/li[1]/a");
		
		public void test2() {
			WebElement mouse=driver.findElement(women);
			Actions  act=new Actions(driver);
			act.moveToElement(mouse).perform();
			driver.navigate().back();
			
		}

	}
}
