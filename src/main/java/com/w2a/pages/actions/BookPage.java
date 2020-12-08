package com.w2a.pages.actions;

import com.w2a.base.Page;
import com.w2a.pages.locators.BookPageLocators;
import com.w2a.pages.locators.HomePageLocators;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BookPage extends Page {

	public BookPageLocators book;
	public static Logger log = Logger.getLogger("ApplicationLogger");


	public BookPage(){
		
		this.book = new BookPageLocators();
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, this.book);
		
	}

	public void addBookFavorites() throws InterruptedException {

		click(book.bookFavoritebuttonOn);
		log.debug("We are adding a book to Favorites");
		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		WebElement elementLocator = book.bookFavoritebuttonOn;
		actions.doubleClick(elementLocator).perform();
		Thread.sleep(10000);
		click(book.bookFavoritebuttonOn);
		Thread.sleep(10000);



	}


	public void addBookBasket() throws InterruptedException {

	click(book.basketButton);
	log.debug("We are adding a book to Basket");
	Thread.sleep(5000);
	//click(book.basketButton);
	//Thread.sleep(5000);
	}


	public void selectBasket() {

	}


	public String getFirstBookTitle(){
		log.debug("We are getting the Title of the first book selected");
		String title = book.bookTitle.getText();
		return title;
	}



}


	
	
	


