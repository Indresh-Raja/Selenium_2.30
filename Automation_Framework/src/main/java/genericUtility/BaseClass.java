package genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.WelcomePage;

public class BaseClass {
	
	public static WebDriver driver;
	public WebDriverUtility wdu=new WebDriverUtility();
	public FileUtility fu=new FileUtility();
	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		wdu.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(fu.getDataFromProperty("url"));
	}
	@BeforeMethod
	public void login() throws IOException {
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys(fu.getDataFromProperty("email"));
		lp.getPasswordTextField().sendKeys(fu.getDataFromProperty("password"));
		lp.getLoginButton().click();
	}
	@AfterMethod
	public void logout() {
		HomePage hp=new HomePage(driver);
		hp.getLogoutLink();
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
