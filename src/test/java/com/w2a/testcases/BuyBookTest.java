package com.w2a.testcases;

import com.w2a.base.Constants;
import com.w2a.base.Page;
import com.w2a.pages.actions.*;
import com.w2a.utilities.Utilities;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class BuyBookTest {



	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void BuyBookTest(Hashtable<String,String> data) throws InterruptedException {

		if(data.get("runmode").equalsIgnoreCase("N")){
			throw new SkipException("Skipping the test as the Run mode is NO");
		}

		Page.initConfiguration();
		SigninPage signin = Page.topNav.gotoSignIn();
		signin.doLogin(Constants.username, Constants.password);
		Page.topNav.closeCookies();
		HomePage page = new HomePage();
		page.gotoBarFirstBook();
		page.selectFirstBook();
		BookPage book = new BookPage();
		book.addBookBasket();
		Thread.sleep(20000);
//		BasketPage basket = Page.topNav.gotoBasket();
//		basket.selectCheckOut();
		PaymentsPage pay = new PaymentsPage();
		pay.confirmBasket();
	}
	
	
	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
		Page.quitBrowser();
		}
	}
}
