import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsPoint {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void operBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chrome exe for Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.manage().window().maximize();
	}
	
	@Test
	public void test()
	{
		System.out.println("verify title");
	  String title=driver.getTitle();
	  String expectedTitle="Online Tutorials Library";
	  Assert.assertEquals(expectedTitle, title);
	  //assertTrue(title.contains("Online Tutorials Library"));
	}
	
	
	@Test
	public void test2()
	{
		System.out.println("verify heading of webpage");
	  String ActualHeading=	driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div[1]/h1")).getText();
	  String ExpectedHeading="Simply Easy Learning at your fingertips";
	  
	  Assert.assertEquals(ExpectedHeading, ActualHeading);
	  
	}
	
	
	@AfterClass
	public static void closeBrowser()
	{
		driver.close();
		
	}
	


}
