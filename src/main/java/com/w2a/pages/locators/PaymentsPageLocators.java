package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentsPageLocators {


	//Basket
	@FindBy(xpath = "//button [@class='button-cart pull-right']")
	public WebElement continueToDetails_button;
	//Details
	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/main[1]/div[2]/div[6]/div[3]/div[4]/div[1]/div[1]")
	public WebElement delivery24h_button;


	@FindBy(xpath = "//span[contains(text(),'Continuar')]")
	public WebElement continueToConfirmation_button;
	//Confirmation
	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/main[1]/div[2]/div[6]/div[4]/div[3]/div[1]/label[1]")
	public WebElement termsAndConditions_button;
	@FindBy(xpath = "//span[contains(text(),'Confirmar encomenda')]")
	public WebElement Confirmation_button;






}
