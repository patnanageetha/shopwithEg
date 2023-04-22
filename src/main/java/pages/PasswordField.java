package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.DriverFactory;

public class PasswordField extends DriverFactory{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	public PasswordField(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
		
	}
@FindBy(xpath="//input[@name='password']/parent::div")
public WebElement password;
		public void enterpassword()
		{
wait.until(ExpectedConditions.visibilityOf(password));
	password.sendKeys("test@test");
	
}
@FindBy(xpath="//p[text()='sign in']")	
public WebElement signinbutton;
public void signin()
{
	wait.until(ExpectedConditions.elementToBeClickable(signinbutton));
	signinbutton.click();
	
}
@FindBy(xpath="//p[text()='At least one uppercase character is required']")	
public WebElement error;
public void errormessage()
{
	boolean geterror=error.isDisplayed();
	System.out.println(geterror);
	String gettext1=error.getText();
	System.out.println(gettext1);
}
}