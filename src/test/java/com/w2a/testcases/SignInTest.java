package com.w2a.testcases;

import java.util.Hashtable;

import com.w2a.base.Constants;
import com.w2a.errorcollectors.ErrorCollector;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.actions.SigninPage;
import com.w2a.utilities.Utilities;

public class SignInTest {

	
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void signInTest(Hashtable<String,String> data) throws InterruptedException {

		if(data.get("runmode").equalsIgnoreCase("N")){
			throw new SkipException("Skipping the test as the Run mode is NO");
		}

		Page.initConfiguration();
		SigninPage signin = Page.topNav.gotoSignIn();
		signin.doLogin(Constants.username, Constants.password);
		//ErrorCollector.verifyEquals(Page.topNav.checkUserIsLoggedIn(),"LOGOUT "+Constants.username);
		Page.topNav.signOut();

	}
	
	
	@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
		Page.quitBrowser();
		}
	}
}
