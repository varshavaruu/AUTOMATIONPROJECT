package test;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import project.Addtocart;
import project.Login1;
import project.Logo;
import project.Mousehvr;
import project.Screenshot;

import project.proceed;
@Test
public class test {

		WebDriver driver;
		@BeforeTest
		public void set()
		{
			driver=new ChromeDriver();	
		}
		@BeforeMethod
		public void urlldng()
		{
			driver.get("https://www.storeno6.com");
		}
	    @Test
		public void test1()
		{

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			driver.manage().window().maximize();
		    Login1 ob=new Login1(driver);
		    ob.lg();
		    ob.setvalues1("varsh123@gmail.com", "123456");
		    ob.lgn();
		}
	    @Test
		public void test2()
		{
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			driver.manage().window().maximize();
		    Mousehvr ob=new Mousehvr ();
		    
		}
	    @Test
		public void test3()
		{
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		    driver.manage().window().maximize();
		     Addtocart ob=new Addtocart(driver);
		    ob.srch();
		}
	    @Test
		public void test4()  
		{
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		    driver.manage().window().maximize();
		    proceed ob=new proceed(driver);
		    ob.topsearch("Tops", "varsh123@gmail.com");
		    ob.typing("varsha", "j", "panthaparambu", "palakkad","kerala" ,"678705" ,"9808907807" );
		    ob.enter2("vibin", "krish", "ppb", "europe", "678705" , "kerala", "9778389470" );
		    ob.payment();
		}
	    @Test
		public void test5()
		{
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			 driver.manage().window().maximize();
			 Logo ob=new Logo(driver);
			 ob.Logo();	
		}
	    @Test
		public void test6() throws Exception
		{
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
			driver.manage().window().maximize();
			Screenshot ob=new Screenshot(driver);
			ob.scrn();
		}
}	
		