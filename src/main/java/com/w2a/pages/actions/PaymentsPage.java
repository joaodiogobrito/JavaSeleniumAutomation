package com.w2a.pages.actions;

import com.w2a.base.Page;
import com.w2a.pages.locators.BasketPageLocators;
import com.w2a.pages.locators.PaymentsPageLocators;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PaymentsPage extends Page {

	public PaymentsPageLocators pay;
	public static Logger log = Logger.getLogger("ApplicationLogger");


	public PaymentsPage(){
		
		this.pay = new PaymentsPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, this.pay);
		
	}



	public void confirmBasket(){
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//Find element by link text and store in variable "Element"
		WebElement Element = pay.continueToDetails_button;

		//This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);

		click(pay.continueToDetails_button);
		log.debug("");

	}

	//TODO Finish Payments last page
	//
	// public void confirmDeliveryMethod(){
		//JavascriptExecutor js = (JavascriptExecutor) driver;

		//Find element by link text and store in variable "Element"
		//WebElement Element = pay.delivery24h_button;

		//This will scroll the page till the element is found
		//js.executeScript("arguments[0].scrollIntoView();", Element);
		//click(pay.delivery24h_button);

		// log.debug("");


	//}

	public void confirmDetails(){
		click(pay.continueToConfirmation_button);
		log.debug("");

	}



	public void finalConfirmation(){
		click(pay.termsAndConditions_button);
		log.debug("");

	}



}


	
	
	


