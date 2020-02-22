package com.e_bank.qa.testpages;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.e_bank.qa.base.Base;
import com.e_bank.qa.pages.LoginPage;

public class LoginPageTest extends Base{

	@Test
	public void loginTest() throws IOException 
	{
			
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			logger.info("Login test failed");
			Assert.assertTrue(false);
			
		}
		
	}

	
}