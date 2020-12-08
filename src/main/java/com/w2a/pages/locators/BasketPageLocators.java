package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class BasketPageLocators {


	@FindBy(xpath = "//button [@class='col-xs-12 btn-checkout']")
	public WebElement checkOut_button;




}
