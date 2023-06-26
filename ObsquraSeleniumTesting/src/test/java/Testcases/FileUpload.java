package Testcases;

import org.testng.annotations.Test;

import mvn.SeleniumMavenSetUp.WebDriverManage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class FileUpload extends WebDriverManage{
	WebDriver driver;
	String browser="Chrome";
	String url=	"https://blueimp.github.io/jQuery-File-Upload/";
  @Test
  public void f() throws InterruptedException {
	// scroll to reach upload button
//    JavascriptExecutor j = (JavascriptExecutor)driver;
//    j.executeScript("scroll(0,500)");
	Thread.sleep(4000);
    driver.findElement(By.cssSelector(".btn.btn-success.fileinput-button")).click();
    //identify element and clickuploadFileWithRobot
  
    uploadFileWithRobot("C:\\Users\\Veena\\Desktop\\file.txt");
    
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
public static void main(String[] args) {
	
}

}
