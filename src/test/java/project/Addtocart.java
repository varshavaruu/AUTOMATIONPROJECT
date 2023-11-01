package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Addtocart {
	WebDriver driver;
	By arrivals=By.xpath("//*[@id=\"header\"]/div/div/div[2]/div/nav/div/ul/li[1]/a");
	//By slt=By.xpath("//*[@id=\"svg2\"]");
	By pic=By.xpath("//*[@id=\"shopify-section-collection-template\"]/section/div[3]/div/div[2]/div[2]/div/div/div[1]/div[1]/div/div/div[1]/div[1]/a/img");
	By add=By.xpath("//*[@id=\"AddToCartForm\"]/div[7]/button");
	By got=By.xpath("//button[contains(text(),'Go to cart')]");
	By cnt=By.xpath("//*[@id=\"shopify-section-page-cart\"]/section/div/div/div/form/div[2]/div[2]/a");
	//By check=By.xpath("//*[@id=\"path16\"]");
	//By Bck=By.xpath("//*[@id=\"Capa_1\"]");
	//By hme=By.xpath("//*[@id=\"header\"]/div/div/div[1]/div/div/a/img");
	public Addtocart (WebDriver driver) {
		this.driver=driver;	
	}
	public void srch()
	{
		driver.findElement(arrivals).click();
		//driver.findElement(slt).click();
		driver.findElement(pic).click();
	    driver.findElement(add).click();
		driver.findElement(got).click();
		driver.findElement(cnt).click();
		//driver.findElement(check).click();
		//driver.findElement(Bck).click();
		//driver.findElement(hme).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}

}
