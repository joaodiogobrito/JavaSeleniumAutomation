package com.w2a.pages.actions;

import com.w2a.base.Constants;
import com.w2a.base.Page;
import com.w2a.pages.locators.FavoritesPageLocators;
import com.w2a.pages.locators.HomePageLocators;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class FavoritesPage extends Page {

	public FavoritesPageLocators fav;
	public static Logger log = Logger.getLogger("ApplicationLogger");


	public FavoritesPage(){
		
		this.fav = new FavoritesPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(factory, this.fav);
		
	}


	public String getFavoritesPageTitle(){
		return fav.favoritesTitle.getText();

		}

	public void verifyBookAddedToFavorites(){
		BookPage book = new BookPage();

		String firstTitle = book.getFirstBookTitle();

		String secondTitle = fav.favoritesBookTitle.getText();

		if(firstTitle==secondTitle){
			log.debug("We added book to Favorites accordingly!");

		} else {
			log.debug("Something went wrong adding book to Favorites.");

		}


	}



	public void deleteLastAddedBook(){

		JavascriptExecutor js = (JavascriptExecutor) driver;

		//Find element by link text and store in variable "Element"
		WebElement Element = fav.deleteLastAddedBook;

		//This will scroll the page till the element is found
		js.executeScript("arguments[0].scrollIntoView();", Element);
		click(fav.deleteLastAddedBook);

		log.debug("We are deleting the last added book to favorites");
		log.debug("If we got to this point the test was finished sucessfuly!");
		
	}
	
	public void gotoFlightAndHotels(){
		
		
	}
	


	}
	
	
	


