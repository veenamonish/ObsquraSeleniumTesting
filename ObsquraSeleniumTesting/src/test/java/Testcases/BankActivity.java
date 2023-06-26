package Testcases;

import org.testng.annotations.Test;

import mvn.SeleniumMavenSetUp.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class BankActivity extends WebDriverManage{
	WebDriver driver;
	String browser="Chrome";
	String url="https://parabank.parasoft.com/parabank/activity.htm?id=14454";
  @Test
  public void Bank() throws InterruptedException {
	  BankPages objPages=new BankPages(driver);
	  objPages.openNAccountClick();
	  Thread.sleep(5000);
	  objPages.DropDownselect();
	  Thread.sleep(5000);
	  objPages.DropDownselect1();
	  Thread.sleep(5000);
	  Assert.assertEquals("Congratulations, your account is now open",objPages.GetText());
	  Thread.sleep(5000);
	  objPages.openNAClick();
	  Thread.sleep(5000);
	  objPages.accountNClick();
	  Thread.sleep(5000);
	  objPages.DropDownselectt();
	  Thread.sleep(5000);
	  objPages.DropDownselectt1();
	  Thread.sleep(5000);
	  objPages. goClick();
	  
	  }
  @BeforeTest
  public void beforeTest() {
	  browserLaunch( browser,url);
	  this.driver=super.driver;
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
