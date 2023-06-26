package Testcases;

import org.testng.annotations.Test;

import mvn.SeleniumMavenSetUp.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DropDown extends WebDriverManage {
 WebDriver driver;
 String browser="Chrome";
 String url="https://selenium.obsqurazone.com/index.php";
  @Test(priority=0,enabled=true)
  public void dropDownScenario() throws InterruptedException {
	WebElement inputform=driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
	inputform.click();
	Thread.sleep(5000); 
	WebElement selectInput=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[4]/a"));
	selectInput.click();
	WebElement dropDown=driver.findElement(By.id("single-input-field"));
	Select objselect=new Select(dropDown);
	objselect.selectByValue("Yellow");
	Thread.sleep(5000); 
	objselect.selectByIndex(2);
	Thread.sleep(5000); 
	objselect.selectByVisibleText("Red");
	Thread.sleep(5000); 
  }
@Test(priority=1,enabled=true)	
  public void dropDownMultiColor() throws InterruptedException
  {
   WebElement multidropdown=driver.findElement(By.id("multi-select-field"));
   Select obj1select=new Select(multidropdown); 
   obj1select.selectByValue("Yellow");
   Thread.sleep(5000);
   obj1select.selectByIndex(0);
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
