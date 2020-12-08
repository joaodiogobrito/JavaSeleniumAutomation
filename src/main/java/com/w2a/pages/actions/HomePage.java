package com.w2a.pages.actions;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.HomePageLocators;

public class HomePage extends Page {
	
	public HomePageLocators home;
	public static Logger log = Logger.getLogger("ApplicationLogger");
	

	public HomePage(){
		
		this.home = new HomePageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, this.home);
		
	}
	
	public void gotoBarFirstBook(){


		click(home.barHomepageBook);
		log.debug("We are navigating to first group of books page");

	}


	public void selectFirstBook(){

		click(home.firstHomepageBook);
		log.debug("We are selecting the first book");
	}

	public void selectBasket() {
	//	JavascriptExecutor js = (JavascriptExecutor) driver;

		//Find element by link text and store in variable "Element"
	//	WebElement Element = home.basketButton;

			//This will scroll the page till the element is found
	//	js.executeScript("arguments[0].scrollIntoView();", Element);


	}


	public void clickCheckOutButton() {

		click(home.checkOutButton);

	}

}


	
	
	


