package com.w2a.pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class HomePageLocators {

	@FindBy(xpath = "//a[@id='showcase-showcasef2-11385-viewmore-lnk']")
	public WebElement barHomepageBook;

	@FindBy(css = "#showcaseSeeAll-showcase-product1 > .product-info > .title > .title-product > p > .title-lnk")
	public WebElement firstHomepageBook;

	@FindBy(xpath = "//button [@class='col-xs-12 btn-checkout']")
	public WebElement checkOutButton;

	@FindBy(xpath = "//button [@class='navbar-toggle button-cart-top']")
	public WebElement basketIconButton;












	public WebElement search;
	@FindBys({
		@FindBy(css = ".cols-nested.flight-date-fieldset.total-children-2"),
		@FindBy(id = "flight-age-select-1")
	})
	public WebElement firstAge;
	@FindAll({
		@FindBy(css = "#flight-age-select-222"),
		@FindBy(id = "flight-age-select-2")
	})
	
	public WebElement secondAge;
	@FindBy(css = "fieldset.cols-nested.flight-date-fieldset.total-children-2")
	public WebElement block;
	@FindBy(css="a[role='tab']")
	public List<WebElement> tabCount;


}
