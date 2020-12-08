package com.w2a.testcases;

import com.w2a.base.Constants;
import com.w2a.base.Page;
import com.w2a.errorcollectors.ErrorCollector;
import com.w2a.pages.actions.BookPage;
import com.w2a.pages.actions.FavoritesPage;
import com.w2a.pages.actions.HomePage;
import com.w2a.pages.actions.SigninPage;
import com.w2a.utilities.Utilities;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class AddFavoriteTest {



	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void AddFavoriteTest(Hashtable<String,String> data) throws InterruptedException {

		if(data.get("runmode").equalsIgnoreCase("N")){
			throw new SkipException("Skipping the test as the Run mode is NO");
		}

		Page.initConfiguration();
		SigninPage signin = Page.topNav.gotoSignIn();
		signin.doLogin(Constants.username, Constants.password);
		HomePage page = new HomePage();
		page.gotoBarFirstBook();
		page.selectFirstBook();
		BookPage book = new BookPage();
		book.addBookFavorites();
		FavoritesPage fav = Page.topNav.gotoFavorites();
		ErrorCollector.verifyEquals(fav.getFavoritesPageTitle(),"lista de desejos");
//		fav.deleteLastAddedBook();
		Page.topNav.signOut();


	}
	
	
	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
		Page.quitBrowser();
		}
	}
}
