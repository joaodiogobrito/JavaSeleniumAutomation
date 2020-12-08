package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookPageLocators {


	@FindBy(css = "#productPageRightSectionTop-actions-addList-btn")
	public WebElement bookFavoritebuttonOn;


	@FindBy(xpath = "//div [@class='col-xs-12 addCart-btn']")
	public WebElement basketButton;


	@FindBy(xpath = "//h1 [@id='productPageRightSectionTop-title-h1']")
	public WebElement bookTitle;






}
