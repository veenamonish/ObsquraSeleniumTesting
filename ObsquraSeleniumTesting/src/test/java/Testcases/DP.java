package Testcases;

import org.testng.annotations.Test;

import mvn.SeleniumMavenSetUp.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class DP extends WebDriverManage {
	WebDriver driver;
	String browser="Chrome";
    String url="https://www.toolsqa.com/testng/testng-dataproviders/";
  
 
      @DataProvider (name = "data-provider")
       public Object[][] dpMethod(){
  	 return new Object[][] {{"First-Value"}, {"Second-Value"}};
       }
  	
      @Test (dataProvider = "data-provider")
      public void myTest (String val) {
          System.out.println("Passed Parameter Is : " + val);
      }
  
  @BeforeTest
  public void beforeTest() {
	
	  browserLaunch(browser,url);
	  this.driver=super.driver;
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
