package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
	


	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
		
	@FindBy(xpath="//p[text()='login']/parent::button")
	
	public WebElement loginButton;
	
	@FindBy(xpath="//input[@id=':r0:']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id=':r1:']")
	public WebElement password;
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signin;
	
	public void clickloginButton()
	{
		loginButton.click();
	}
	public void enterEmail()
	
	{
		
		email.sendKeys("pgeetha859@gmail.com");
	}
	
 
public void password()
{
	
	password.sendKeys("geethageetha16");
}

	

public void clicksignin()
{
	signin.click();
}
	
}



