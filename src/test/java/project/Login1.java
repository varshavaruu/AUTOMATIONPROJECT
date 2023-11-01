package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login1 {
	WebDriver driver;
	By log=By.xpath("//header/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]/*[1]");
	By email=By.xpath("//body/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]");
	By psswrd=By.xpath("//body/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]");
	By login=By.xpath("//body/div[2]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/button[1]");
	//By rtn=By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");

	public Login1 (WebDriver driver) {
		this.driver=driver;	
	}
    public void lg()
    {
    	driver.findElement(log).click();
    }
	public void setvalues1(String ee,String pp) {
		driver.findElement(email).sendKeys(ee);
		driver.findElement(psswrd).sendKeys(pp);
	}
	public void lgn()
	 {
		 driver.findElement(login).click();
		//driver.findElement(rtn).click();
		driver.navigate().back();
	}


}
