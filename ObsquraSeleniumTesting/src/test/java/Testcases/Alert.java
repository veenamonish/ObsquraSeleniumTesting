package Testcases;

import org.testng.annotations.Test;

import mvn.SeleniumMavenSetUp.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Alert extends WebDriverManage {
	WebDriver driver;
	String browser="Chrome";
	String url="https://selenium.obsqurazone.com/index.php";
  @Test(priority=0,enabled=true)
  public void alertMethod() throws InterruptedException {
	  AlertPages objalertPages=new AlertPages(driver);
	  objalertPages.alertLinkClick();
	  Thread.sleep(5000);
	  objalertPages.javaScriptClick();
	  Thread.sleep(5000);
	  objalertPages.clickMeButtonClick();
	  Thread.sleep(5000);
	 
	  
  }
  @Test(priority=1,enabled=true)
  public void PromptBoxAlertClick() throws InterruptedException
  {
	AlertPages objalertPages=new AlertPages(driver);
	objalertPages.promptBoxClickclick();
	Thread.sleep(5000);
	objalertPages.promptMessage();
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
