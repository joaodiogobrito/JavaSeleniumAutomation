package com.w2a.pages.actions;

import com.w2a.base.Page;
import com.w2a.pages.locators.BasketPageLocators;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasketPage extends Page {

	public BasketPageLocators basket;
	public static Logger log = Logger.getLogger("ApplicationLogger");


	public BasketPage(){
		
		this.basket = new BasketPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, this.basket);
		
	}



	public PaymentsPage selectCheckOut(){

		Page.click(basket.checkOut_button);
		log.debug("Clicked on Checkout Button");

		return new PaymentsPage();
	}



}


	
	
	


