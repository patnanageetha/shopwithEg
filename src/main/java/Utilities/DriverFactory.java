package Utilities;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DriverFactory {
		
		public static WebDriver driver;
		
		public void init()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}

	}


