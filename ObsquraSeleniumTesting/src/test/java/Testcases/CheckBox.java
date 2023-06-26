package Testcases;


import mvn.SeleniumMavenSetUp.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class CheckBox extends WebDriverManage {
 WebDriver driver;
 String browser="Chrome";
 String url="https://selenium.obsqurazone.com/index.php";
  @Test
  public void check() throws InterruptedException {
	checkboxPages objcheckPages=new checkboxPages(driver);
	objcheckPages.inputFormclick();
	Thread.sleep(2000);
	objcheckPages.checkBoxDemoclick();
	Thread.sleep(5000);
	objcheckPages. clickCheckBox();
	Thread.sleep(5000);
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
