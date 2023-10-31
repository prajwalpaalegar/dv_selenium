package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_scripts.BasePage;

public class Pom1 extends BasePage{
	
	@FindBy(name="email")
	private WebElement uName;
	@FindBy(name="pass")
	private WebElement pWord;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	public Pom1(WebDriver driver)
	{
		super(driver);
	}
	
	public void passUn(String un)
	{
		uName.sendKeys(un);
	}
	public void passPwd(String pwd)
	{
		pWord.sendKeys(pwd);
	}
	public void clickBtn()
	{
		loginBtn.click();
	}
}
