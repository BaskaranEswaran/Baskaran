package com.junit;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.day1.BaseClass;

public class HotelBooking extends BaseClass {
	@BeforeClass
	public static void launchBrowser() {
		browserConFig();
		maximize();
		loadUrl("https://adactinhotelapp.com/");
	}
	@Before
	public void takeScreenShotBefore() throws IOException {
		screenShot("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\beforescreenshot.png");
	}
	@After
	public void takeScreenShotAfter() throws IOException {
		screenShot("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\Afterscreenshot.png");
	}
	@Test
	public void adactinBooking() throws Exception {
		WebElement userName = locateElementById("username");
		String  userNameInput= excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 0);
		userName.sendKeys(userNameInput);
		
		WebElement password = locateElementByName("password");
		String userPasswordInput = excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 1);
		password.sendKeys(userPasswordInput);
		
		WebElement login = locateElementByName("login");
		login.click();
		
		WebElement location = locateElementByName("location");
		location.click();
		selectByValue(location, "Paris");
		
		WebElement hotels = locateElementByName("hotels");
		hotels.click();
		selectByValue(hotels, "Hotel Hervey");
		
		WebElement roomType = locateElementById("room_type");
		roomType.click();
		selectByValue(roomType, "Super Deluxe");
		
		WebElement roomNos = locateElementByName("room_nos");
		roomNos.click();
		selectByValue(roomNos, "5");
		
		WebElement checkInDate = locateElementById("datepick_in");
		String checkInDat = excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 2);
		checkInDate.sendKeys(checkInDat);
		
		WebElement checkOutDate = locateElementById("datepick_out");
		String checkOutDat = excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 3);
		checkOutDate.sendKeys(checkOutDat);
		
		WebElement aduldRoom = locateElementByName("adult_room");
		aduldRoom.click();
		selectByValue(aduldRoom, "2");
		
		Thread.sleep(5000);
		WebElement submit = locateElementByName("Submit");
		submit.click();
		
		WebElement ratioB = locateByXpath("//input[@type=\"radio\"]");
		ratioB.click();
		
		WebElement continu = locateByXpath("//input[@type=\"submit\"]");
		continu.click();
		
		WebElement firstName=locateByXpath("(//input[@type=\"text\"])[11]");
		String firstNam = excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 4);
		firstName.sendKeys(firstNam);
		
		WebElement lastName=locateByXpath("(//input[@type=\"text\"])[12]");
		String lastNam = excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 5);
		lastName.sendKeys(lastNam);
		
		WebElement billingAddress=locateElementByName("address");
		String address = excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 6);
		billingAddress.sendKeys(address);
		
		WebElement creditCard=locateByXpath("(//input[@type=\"text\"])[13]");
		String cardNo = excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 7);
		creditCard.sendKeys(cardNo);
		
		WebElement cardType = locateElementById("cc_type");
		cardType.click();
		selectByValue(cardType, "VISA");
		
		WebElement monthExp = locateElementById("cc_exp_month");
		monthExp.click();
		selectByValue(monthExp, "10");
		
		WebElement yearExp = locateElementById("cc_exp_year");
		yearExp.click();
		selectByValue(yearExp, "2022");
		
		WebElement cvvNo = locateElementByName("cc_cvv");
		String cvv = excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 8);
		cvvNo.sendKeys(cvv);
		
		WebElement bookNow = locateElementById("book_now");
		bookNow.click();
    
	}

	}
	
