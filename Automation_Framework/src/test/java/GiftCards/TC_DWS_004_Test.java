package GiftCards;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtility.BaseClass;
import objectRepository.HomePage;

public class TC_DWS_004_Test extends BaseClass{
	@Test
	public void clickOnElectronics () {
		HomePage hp=new HomePage(driver);
		hp.getGiftcards().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Gift Cards","Gift Cards page is not displayed" );
		Reporter.log("Gift Cards page is displayed",true);
	}
}
