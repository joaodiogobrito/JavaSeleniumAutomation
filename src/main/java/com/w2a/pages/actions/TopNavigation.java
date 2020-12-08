package com.w2a.pages.actions;


import com.w2a.base.Constants;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.w2a.base.Page;
import com.w2a.pages.locators.TopNavigationLocators;

public class TopNavigation {
	
	public TopNavigationLocators topNavigation;
	public static Logger log = Logger.getLogger("ApplicationLogger");

	public TopNavigation(WebDriver driver){

		this.topNavigation = new TopNavigationLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.topNavigation);


	}

	public SigninPage gotoSignIn(){

		Page.click(topNavigation.upperleft);
		Page.click(topNavigation.login_button);
		log.debug("Clicked on Log In Button");
		return new SigninPage();

	}

	public FavoritesPage gotoFavorites(){

		Page.click(topNavigation.favorites_button);
		log.debug("Clicked on Favorites Button");
		return new FavoritesPage();

	}

	// To open a new Basket Page an item needs to be added first
	public BasketPage gotoBasket(){

		Page.click(topNavigation.kart_icon);
		log.debug("Opening Basket Page");
		return new BasketPage();

	}



	public void closeCookies(){

		Page.click(topNavigation.cookies_close_button);

	}


	public String checkUserIsLoggedIn() throws InterruptedException {

		Page.click(topNavigation.wook_logo);
		Thread.sleep(5000);
		Page.click(topNavigation.upperleft);
		Thread.sleep(5000);

		return Page.getText(topNavigation.logout_button);

	}





	public void signOut() throws InterruptedException {

		Page.click(topNavigation.wook_logo);
		Thread.sleep(5000);
		Page.click(topNavigation.upperleft);
		Thread.sleep(5000);
		Page.click(topNavigation.logout_button);
		log.debug("Clicked on Logout Button");

	}

	public void verifyLog(){
		String title = topNavigation.login_button.getText();

		if(title=="login"){
			log.debug("We are Logged In!");

		} else {
			log.debug("We are logged out");

		}

		
		
	}
}
