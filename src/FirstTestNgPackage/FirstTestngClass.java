package FirstTestNgPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestngClass{
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "D:\\chromedriver.exe";
    public WebDriver driver ; 
     
 // @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching chrome browser"); 
      System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
  @BeforeTest
  public void Test() {
	  System.out.println("Before test");
  }
  @AfterTest
  public void Test1() {
	  System.out.println("After test");
  }
  @BeforeMethod
  public void test3() {
	  System.out.println("Before method");
  }
  @AfterMethod
  public void test4() {
	  System.out.println("After method");
  }
  @Test(priority = 3,alwaysRun = true)
  public void a_test() {
	  System.out.println("a test");
  }
  @Test(priority = 2)
  public void c_test() {
	  System.out.println("c test");
  }
  @Test(priority = 1)
  public void b_test() {
	  System.out.println("b test");
	  
  }
  
	  
  
}
