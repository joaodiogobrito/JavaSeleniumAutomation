package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.function.ToDoubleBiFunction;

public class TopNavigationLocators {

	@FindBy(xpath = "//button [@class='navbar-toggle button-list-top']")
	public WebElement favorites_button;
	@FindBy(xpath = "//button [@class='menu-btn navbar-toggle']")
	public WebElement upperleft;
	@FindBy(xpath = "//span [@class='loginLabel']")
	public WebElement login_button;
	@FindBy(xpath = "//a [@class='font-icon font-icon-log font-icon-log-out']")
	public WebElement logout_button;
	@FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/button[3]/span[2]")
	public WebElement kart_icon;
	@FindBy(xpath = "//div [@class='branding global-sprite']")
	public WebElement wook_logo;
	@FindBy(xpath = "//div [@class='button closeButton']")
	public WebElement cookies_close_button;




	//TODO Later
	// FindaAll to create a sessionButton

}
