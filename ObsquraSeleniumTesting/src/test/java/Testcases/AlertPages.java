package Testcases;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPages {
	WebDriver driver;

	public AlertPages(WebDriver driver) {
		this.driver=driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id='alert-modal']")
	private WebElement alertLink;
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[5]/a")
	private WebElement javaScript;
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[1]/div/div[2]/button")
	private WebElement clickMeButton;
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[3]/div/div[2]/button")
	private WebElement promptBoxClick;
	@FindBy(xpath="//*[@id='prompt-demo']")
	private WebElement promptMessage;
	public void alertLinkClick()
	{
		  alertLink.click();	
	}
	
	public void javaScriptClick()
	{
		javaScript.click();
	}
	
	public void  clickMeButtonClick()
	{
		 clickMeButton.click();
		 org.openqa.selenium.Alert objalert=driver.switchTo().alert();
		  objalert.accept();
	}
	
	public void promptBoxClickclick()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",promptBoxClick );
		promptBoxClick.click();
		org.openqa.selenium.Alert objalert= driver.switchTo().alert();
		objalert.sendKeys("Unique");
		objalert.accept();
		
	}
	
	public void promptMessage()
	{
		String msg=promptMessage.getText();
		Assert.assertEquals("You have entered 'Unique' !",msg);	
	}

}
