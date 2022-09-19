package com.qa.testLayer;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase1;
import com.qa.utility.ReadData;

public class LoginPageTest extends TestBase1 {
	
	 public static LoginPage login;
	 public static ReadData read;
	
	 @Test  (dataProvider = "login")
	 public void loginTest (String user1 , String pass2) {
		 
		 login = new LoginPage ();
		 login.enterEmailAddress(user1);
		 login.enterPass(pass2);
		 login.clickOnLoginBtn();
	 }
	 
	 
	 @DataProvider (name = "login")
	 public String[][] loginData () throws IOException {
		 read = new ReadData ();
		 
		int p= read.lastRowN(0);
		int q = read.lastCellN(0, 1);
		
		String loginData [][] = new String [p][q];
		
		for (int i =1; i<=p ; i++) 
		{
			for (int j=0; j<q ; j++)
			{
				
				loginData [i-1][j]= read.readExcellData(0, i, j);
			}		
		}
		return loginData;
	 }
	 
}
