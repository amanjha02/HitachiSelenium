package Parallelruning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeFirstSession {
  @Test
 public void LaunchBrowserfirstSession() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  WebDriver  driver=new ChromeDriver();
	    driver.manage().window().maximize();
	   
	   
		driver.get("http://www.demo.guru99.com/V4");
  }
  @Test
  public void LaunchBrowserfirstSession1() {
 	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
 	  WebDriver  driver=new ChromeDriver();
 	    driver.manage().window().maximize();
 	   
 	   
 		driver.get("http://www.demo.guru99.com/V4");
   }
}
