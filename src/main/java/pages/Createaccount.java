package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.DriverFactory;

public class Createaccount extends DriverFactory {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	public Createaccount(WebDriver driver)
	{
		PageFactory.initElements(driver,this);


}
@FindBy(xpath="//button[text()='Create Account']")
public WebElement account;
public void createaccount()
{

	account.click();
}

@FindBy(xpath="//input[@name='firstName']")
public WebElement firstname;
public void enterfirstname()
{
	wait.until(ExpectedConditions.visibilityOf(firstname));
	firstname.sendKeys("g");
}
@FindBy(xpath="//p[text()='create account']")
 public WebElement clickaccount;
public void clickaccount()
{
	clickaccount.click();
}

@FindBy(xpath="//p[text()='First name must be 2 to30 characters']")
public WebElement error;
public void errorvalidation()
{
	boolean geterror=error.isDisplayed();
	System.out.println(geterror);
	String geterrortext=error.getText();
	System.out.println(geterrortext);
	
	
	
}

}



