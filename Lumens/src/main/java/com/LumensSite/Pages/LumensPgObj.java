package com.LumensSite.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.LumensSite.Base.BaseClass;

public class LumensPgObj extends BaseClass {

	public LumensPgObj(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='btn-group dropdown-group']")
	private WebElement Acctdrp;

	@FindBy(xpath = "//a[@class='userlogin']")
	private WebElement Loginbtn;

	@FindBy(xpath = "//*[@id=\"ltkpopup-close-button\"]/a")
	private WebElement closePopup;

	public WebElement getAcctdrp() {
		return Acctdrp;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	public WebElement getClosePopup() {
		return closePopup;
	}

	@FindBy(name = "dwfrm_login_username")
	private WebElement emailtxtbox;

	@FindBy(name = "dwfrm_login_password")
	private WebElement passtxtbox;

	@FindBy(name = "dwfrm_login_login")
	private WebElement signupbtn;

	@FindBy(xpath = "//a[@class='logo-link lu-sprite']")
	private WebElement goToHome;

	@FindBy(xpath = "//*[@id=\"nav-tab-01\"]/a")
	private WebElement lighting;

	@FindBy(xpath = "//*[@id=\"foo\"]/td[1]/div/div/h3/a")
	private WebElement ceilingLights;

	@FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[2]/div[4]/div[2]/div[1]/div/div/h3/a/span")
	private WebElement chandeliers;

	@FindBy(xpath = "//*[@id=\"main\"]/div[2]/div[2]/div[4]/div[2]/div[1]/div/div/h3/a/span")
	private WebElement largeChandeliers;

	@FindBy(xpath = "//*[@id=\"refinement-LU_BestSellerScore\"]/div/ul/li[2]/a/span[1]/input")
	private WebElement filterReadyToShip;

	@FindBy(xpath = "//*[@id=\"refinement-Style\"]/div/ul/li[3]/a/span[1]/input")
	private WebElement style;

	@FindBy(linkText="Gallery Chandelier")
	private WebElement selectItem;

	@FindBy(xpath = "//*[@id=\"add-to-cart\"]")
	private WebElement addTocart;

	@FindBy(xpath = "//*[@id=\"atcModal\"]/div/div/div/div/div/div[2]/div[2]/a[1]")
	private WebElement goTocart;

	public WebElement getEmailtxtbox() {
		return emailtxtbox;
	}

	public WebElement getPasstxtbox() {
		return passtxtbox;
	}

	public WebElement getSignupbtn() {
		return signupbtn;
	}

	public WebElement getLighting() {
		return lighting;
	}

	public WebElement getCeilingLights() {
		return ceilingLights;
	}

	public WebElement getChandeliers() {
		return chandeliers;
	}

	public WebElement getLargeChandeliers() {
		return largeChandeliers;
	}

	public WebElement getFilterReadyToShip() {
		return filterReadyToShip;
	}

	public WebElement getStyle() {
		return style;
	}

	public WebElement getSelectItem() {
		return selectItem;
	}

	public WebElement getAddTocart() {
		return addTocart;
	}

	public WebElement getGoTocart() {
		return goTocart;
	}

	public WebElement getGoToHome() {
		return goToHome;
	}

}
