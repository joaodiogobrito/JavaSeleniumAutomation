package com.w2a.pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPageLocators {


	@FindBy(xpath = "//input [@name='email']")
	public WebElement email;
	@FindBy(xpath = "//input [@name='pass']")
	public WebElement password;
	@FindBy(xpath = "//button [@class='primary']")
	public WebElement submit;

}
