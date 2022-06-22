package org.testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.day1.BaseClass;

public class Login extends BaseClass{
//	WebDriver driver;
	@BeforeClass
	private void browserLaunch() {
		browserConFig();
		maximize();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
	}
	@Test(parameters = {"userName","password"})
	private void login(String s1, String s2) {
		

	}
	
	

}
