package computers;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePage;

public class TC_DWS_002_Test extends BaseClass {
	@Test
	public void clickOnComputers () {
		HomePage hp=new HomePage(driver);
		hp.getComputerLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","Computers page is not displayed" );
		Reporter.log("Computers page is displayed",true);
	}
}
