package Testcases;


import org.testng.annotations.Test;
import mvn.SeleniumMavenSetUp.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
public class NewTest extends WebDriverManage {
	WebDriver driver;
	String url="https://selenium.obsqurazone.com/index.php";
	String browser="Chrome";
 
@Test(priority=0,enabled=true)
  public void a() throws Exception {
	Initialpages objInitial=new Initialpages(driver);
	objInitial.inputFormclick();
	Thread.sleep(2000);
	objInitial.enterMessage();
	Thread.sleep(2000);
	objInitial.showMessageButton();
	Thread.sleep(2000);
	Assert.assertEquals("hello", objInitial.messageGet());


  }
@Test(priority=1,enabled=true) 
public void b() throws InterruptedException {
	
	Initialpages objInitial=new Initialpages(driver);
	 objInitial.enterValueTextB1();
	Thread.sleep(5000);
	objInitial.enterValueText();
	Thread.sleep(5000);
	objInitial.getTotal();
	Thread.sleep(3000);
	
	Assert.assertEquals("104",objInitial.divTotal());
	Thread.sleep(2000);
	
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
