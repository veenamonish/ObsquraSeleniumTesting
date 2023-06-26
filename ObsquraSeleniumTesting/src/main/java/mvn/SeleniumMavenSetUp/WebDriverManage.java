package mvn.SeleniumMavenSetUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import java.awt.datatransfer.StringSelection;
import java.util.Date;

public class WebDriverManage{
	public WebDriver driver;
	public void browserLaunch(String browser,String url) {
		if(browser.equalsIgnoreCase("Chrome"))
		{
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		  
	      driver=new ChromeDriver();
	      driver.get(url);
	      driver.manage().window().maximize();
		}
	}
public void clickelement(WebElement element)
{
	element.click();
}
public void enterText(WebElement element,String value)
{
	element.sendKeys(value);
}
public String returnText(WebElement element)
{
	return element.getText();
}
public void selectDropdown(WebElement element ,String value)
{
    Select objSelect=new Select(element);
    objSelect.selectByValue("value");
}
public void alert(WebDriver driver)
{
  Alert objalert=driver.switchTo().alert();	
  objalert.accept();
}

public  void takeSnapShot(WebDriver webdriver) throws Exception{
	
	Date d = new Date();
	String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".png";

	//Convert web driver object to TakeScreenshot
	TakesScreenshot scrShot =((TakesScreenshot)webdriver);
	//Call getScreenshotAs method to create image file
	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	//Move image file to new destination
	File DestFile = new File("C:\\Users\\Veena\\Documents\\selenium\\ObsquraSeleniumTesting\\src\\main\\resources\\screenshots"+FileName.toString());
	//Copy file at destination
	Files.copy(SrcFile, DestFile);

    	}

//File upload by Robot Class
public void uploadFileWithRobot(String imagePath)throws InterruptedException
{
	StringSelection stringSelection = new StringSelection(imagePath);
    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    clipboard.setContents(stringSelection, null);
    Robot robot = null;
    try {
        robot = new Robot();
    } catch (AWTException e) {
        e.printStackTrace();
    }
    robot.delay(250);
    Thread.sleep(3000);
    robot.keyPress(KeyEvent.VK_ENTER);
    robot.keyRelease(KeyEvent.VK_ENTER);
    robot.keyPress(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_V);
    robot.keyRelease(KeyEvent.VK_CONTROL);
    robot.keyPress(KeyEvent.VK_ENTER);
    Thread.sleep(3000);
    robot.delay(150);
    robot.keyRelease(KeyEvent.VK_ENTER);
}

}

