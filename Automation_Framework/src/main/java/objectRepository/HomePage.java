package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(linkText = "Books")
	private WebElement booksLink;
	
	@FindBy(linkText =  "Computers")
	private WebElement computerLink;
	
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement apparelAndShoesLink;
	
	@FindBy(linkText = "Digital downloads")
	private WebElement digitaldownloadsLink;
	
	@FindBy(linkText =  "Electronics")
	private WebElement electronicsLink;
	
	@FindBy(linkText = "Jewelry")
	private WebElement jewelryLink;
	
	@FindBy(linkText = "Gift Cards")
	private WebElement giftcardsLink;
    
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	
	public WebElement getGiftcards() {
		return giftcardsLink;
	}
	
	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public void setApparelAndShoesLink(WebElement apparelAndShoesLink) {
		this.apparelAndShoesLink = apparelAndShoesLink;
	}

	public WebElement getDigitaldownloadsLink() {
		return digitaldownloadsLink;
	}

	public void setDigitaldownloadsLink(WebElement digitaldownloadsLink) {
		this.digitaldownloadsLink = digitaldownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public void setJewelryLink(WebElement jewelryLink) {
		this.jewelryLink = jewelryLink;
	}
}
