package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class proceed {
	WebDriver driver;
	By search=By.xpath("//*[@id=\"svg2\"]");
	By type=By.xpath("/html/body/div[2]/div/div[2]/div[1]/form/input[2]");
	By drs=By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[3]/div/div[1]/ul/li/a/img");
	By buy=By.xpath("//*[@id=\"AddToCartForm\"]/div[8]/div/div/div/button[1]");
	By email=By.xpath("//*[@id=\"email\"]");
	By name=By.xpath("//*[@id=\"TextField0\"]");
	By lastname=By.xpath("//*[@id=\"TextField1\"]");
	By adrs=By.xpath("//*[@id=\"shipping-address1\"]");
	By city=By.xpath("//*[@id=\"TextField2\"]");
	//By drp=By.xpath("//*[@id=\"Select10\"]");
	By state=By.xpath("//*[@id=\"Select1\"]");
	By pin=By.xpath("//*[@id=\"TextField3\"]");
	By phn=By.xpath("//*[@id=\"TextField4\"]");
	//By ship=By.xpath("//*[@id=\"save_shipping_information\"]");
	
	By name1=By.xpath("//*[@id=\"TextField6\"]");
	By lastname1=By.xpath("//*[@id=\"TextField7\"]");
	By adrs1=By.xpath("//*[@id=\"billing-address1\"]");
	By city1=By.xpath("//*[@id=\"TextField8\"]");
	//By drp1=By.xpath("//*[@id=\"Select12\"]");
	By state1=By.xpath("//*[@id=\"Select3\"]");
	By pin1=By.xpath("//*[@id=\"TextField9\"]");
	By phn1=By.xpath("//*[@id=\"TextField10\"]");
	
	By pay=By.xpath("//*[@id=\"pay-button-container\"]/div/div/button");
	//By cross=By.xpath("//body/div[3]/iframe[1]");
	//By cancel=By.xpath("//*[@id=\"positiveBtn\"]");
	//By hme=By.xpath("/html/body/div[2]/div/div[5]/div[1]/a/img");
	
	public proceed (WebDriver driver) {
		this.driver=driver;	
	}
	public void topsearch(String a,String ab)
	{
	  driver.findElement(search).click();
	  driver.findElement(type).click();
	  driver.findElement(type).sendKeys(a);
	  driver.findElement(drs).click();
	  driver.findElement(buy).click();
	  driver.findElement(email).sendKeys(ab);
	}
	public void typing(String b,String c,String d,String e,String f,String l,String m)
	{
	  driver.findElement(name).sendKeys(b);
	  driver.findElement(lastname).sendKeys(c);
	  driver.findElement(adrs).sendKeys(d);
	  driver.findElement(city).sendKeys(e);
	  //driver.findElement(drp).click();
	  driver.findElement(state).sendKeys(f);
	  driver.findElement(pin).sendKeys(l);
	  driver.findElement(phn).sendKeys(m);
	 // driver.findElement(ship).click();
	}
	public void enter2(String g,String h,String i,String j,String k,String m,String o)
	{
	  driver.findElement(name1).sendKeys(g);
	  driver.findElement(lastname1).sendKeys(h);
	  driver.findElement(adrs1).sendKeys(i);
	  driver.findElement(city1).sendKeys(j);
	  //driver.findElement(drp1).click();
	  driver.findElement(state1).click();
	  driver.findElement(state1).sendKeys(m);;
	  driver.findElement(pin1).sendKeys(k);
	  driver.findElement(phn1).sendKeys(o);
	}
	public void payment()
	{
	  driver.findElement(pay).click();
	  driver.navigate().back();
	  //driver.findElement(cross).click();
	  //driver.findElement(cancel).click();
	  //driver.findElement(hme).click();
	  driver.navigate().back();
	  driver.navigate().back();
	  
	  
	
		
	}
}
