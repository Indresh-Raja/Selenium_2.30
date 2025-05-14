package Electronics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePage;

public class TC_DWS_003_Test extends BaseClass{
	@Test
	public void clickOnElectronics () {
		HomePage hp=new HomePage(driver);
		hp.getElectronicsLink().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics","Electronics page is not displayed" );
		Reporter.log("Electronics page is displayed",true);
	}
}
