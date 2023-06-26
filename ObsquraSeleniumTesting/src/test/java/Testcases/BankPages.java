package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import mvn.SeleniumMavenSetUp.WebDriverManage;

public class BankPages {
	WebDriver driver;
	WebDriverManage objManage;
	public BankPages(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements( driver,this);
	 objManage=new WebDriverManage ();
	 
	}
	@FindBy(xpath="//*[@id='leftPanel']/ul/li[1]/a")
	private WebElement openNAccout;
	@FindBy(xpath="//*[@id='type']")
	private WebElement dropDownSelect1;
	@FindBy(xpath="//*[@id='fromAccountId']")
	private WebElement dropDownSelect2;
	@FindBy(xpath="//*[@id='rightPanel']/div/div/p[1]")
	private WebElement oPen;
	@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div/form/div/input")
	private WebElement OpenNAccount;
	@FindBy(xpath="//*[@id=\"newAccountId\"]")
	private WebElement newAccId;
	@FindBy(xpath="//*[@id='month']")
	private WebElement month;
	@FindBy(xpath="//*[@id=\"transactionType\"]")
	private WebElement Type;
	@FindBy(xpath="//*[@id='rightPanel']/div/div[2]/form/table/tbody/tr[3]/td[2]/input")
	private WebElement Go;
	
	public void openNAccountClick()
	{
		objManage.clickelement(openNAccout);
	}
	public void DropDownselect()
	{ 
		objManage.selectDropdown(dropDownSelect1,"SAVINGS");
	}
	
	public void DropDownselect1()
	{
		objManage.selectDropdown(dropDownSelect2,"13677");
	}
	public String GetText()
	{
		String msg=objManage.returnText(oPen);
		String r[]=msg.split(":");
		return r[1].trim();
	}
	public void openNAClick()
	{
		objManage. clickelement(OpenNAccount);
		
	}
	public void accountNClick()
	{
		objManage. clickelement(newAccId);
	}
	public void DropDownselectt()
	{
		objManage.selectDropdown(month,"january");
	}
	public void DropDownselectt1()
	{
		objManage.selectDropdown(Type,"Credit");
	}
	
	public void goClick()
	{
		objManage.clickelement(Go);
	}
	
	

}
