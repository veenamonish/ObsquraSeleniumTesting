package Testcases;

import org.testng.annotations.Test;

import mvn.SeleniumMavenSetUp.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class RadioButton extends WebDriverManage {
	WebDriver driver;
	String browser="Chrome";
	String url="https://selenium.obsqurazone.com/index.php";
  @Test
  public void radiobutton() throws InterruptedException {
	  WebElement inputform=driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
	  inputform.click();
	  Thread.sleep(5000);   
	  WebElement radioButtonsDemo=driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/ul/li[3]/a"));
	  radioButtonsDemo.click();
	  Thread.sleep(5000);
	  WebElement radioFemale=driver.findElement(By.xpath("//*[@id=\"inlineRadio2\"]"));
	  Boolean R=radioFemale.isSelected();
	  Thread.sleep(5000);
	  if(R==false)
	  {
		  radioFemale.click();  
	  }
	  Thread.sleep(5000);
	  WebElement showSelectedValue=driver.findElement(By.id("button-one"));
	  showSelectedValue.click();
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
