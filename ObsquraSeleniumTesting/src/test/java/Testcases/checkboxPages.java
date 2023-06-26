package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkboxPages {
	WebDriver driver;

	public checkboxPages(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//*[@id='collapsibleNavbar']/ul/li[2]/a ")
	private WebElement inputForm;
	@FindBy(xpath="/html/body/section/div/div/div[1]/div/div/ul/li[2]/a")
	private WebElement checkBoxDemo;
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/label")
	private WebElement clickCheckBox;
	public void inputFormclick()
	{
		inputForm.click();
	}
	
	public void checkBoxDemoclick()
	{
		checkBoxDemo.click();
	}
	
	public void clickCheckBox()
	{
		boolean c=clickCheckBox.isSelected();
	      if(c==false)
	      {
	    	  clickCheckBox.click();  
	      }
	}
	
}
