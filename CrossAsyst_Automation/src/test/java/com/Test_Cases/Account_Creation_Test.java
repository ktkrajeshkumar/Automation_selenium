package com.Test_Cases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base_Class.Base_Class;
import com.Pages.Login_Page;

public class Account_Creation_Test extends Base_Class {
	
	Login_Page loginPage;

	public Account_Creation_Test(){
		super();
	}

	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new Login_Page();	
	}

	@Test(priority=3)
	public void loginTest(){
		loginPage.newaccount();
	}



	@AfterMethod
	public void tearDown(){
		driver.quit();
	}


}
