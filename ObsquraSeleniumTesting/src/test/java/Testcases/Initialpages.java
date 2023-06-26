package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mvn.SeleniumMavenSetUp.WebDriverManage;

public class Initialpages {
	WebDriver driver;
    WebDriverManage objManage;
	public Initialpages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		 objManage=new WebDriverManage();
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//*[@id='collapsibleNavbar']/ul/li[2]/a")
	private WebElement inputForm;
     @FindBy(id="single-input-field")
	 private WebElement enterMessage;
     @FindBy(id="button-one")
     private WebElement showMessageButton;
     @FindBy(id="message-one")
     private WebElement  messageGet;
     @FindBy(id="value-a")
     private WebElement enterValueTextB1;
     @FindBy(id="value-b")
     private WebElement enterValueTextB2;
     @FindBy(id="button-two")
     private WebElement getTotalButton;
     @FindBy(id="message-two")
     private WebElement divTotal;
     @FindBy(tagName="a")
 	 private List<WebElement>link;
 	 public void inputFormclick()
    {
    	System.out.println(link.size());
 		List<WebElement> link1=driver.findElements(By.tagName("a"));
 		System.out.println(link1.size());
        objManage.clickelement(inputForm);
    }
   
    public void enterMessage() throws Exception
    {
    	objManage.enterText(enterMessage,"hello");
    	objManage.takeSnapShot(driver);
    }
    public void showMessageButton()
    {
    	objManage.clickelement(showMessageButton);
    }
  
    public String messageGet()
    {
    	String msg=objManage.returnText(messageGet);
    	String [] r = msg.split(":");
    	return r[1].trim();
    }
   
    public void enterValueTextB1()
    {
    	objManage.enterText( enterValueTextB1,"27");
    }
   
    public void enterValueText()
    {
    	objManage.enterText(enterValueTextB2,"77");	
    }
   
    public void getTotal()
    {
    	objManage.clickelement(getTotalButton);
    }
   
    public String divTotal()
    {
    	String sum=objManage.returnText(divTotal);
    	String s[]=sum.split(":");
    	return s[1].trim();
    
    }
}
