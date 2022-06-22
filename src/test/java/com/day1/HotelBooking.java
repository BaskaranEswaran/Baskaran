package com.day1;

import org.openqa.selenium.WebElement;

public class HotelBooking extends BaseClass{

	public static void main(String[] args) throws Exception {
		BaseClass bc=new BaseClass();
		bc.browserConFig();
		bc.maximize();
		bc.loadUrl("https://adactinhotelapp.com/");
		
		WebElement userName = bc.locateElementById("username");
		String  userNameInput= bc.excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 0);
		userName.sendKeys(userNameInput);
		
		WebElement password = bc.locateElementByName("password");
		String userPasswordInput = bc.excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 1);
		password.sendKeys(userPasswordInput);
		
		WebElement login = bc.locateElementByName("login");
		login.click();
		
		WebElement location = bc.locateElementByName("location");
		location.click();
		bc.selectByValue(location, "Paris");
		
		WebElement hotels = bc.locateElementByName("hotels");
		hotels.click();
		bc.selectByValue(hotels, "Hotel Hervey");
		
		WebElement roomType = bc.locateElementById("room_type");
		roomType.click();
		bc.selectByValue(roomType, "Super Deluxe");
		
		WebElement roomNos = bc.locateElementByName("room_nos");
		roomNos.click();
		bc.selectByValue(roomNos, "5");
		
		WebElement checkInDate = bc.locateElementById("datepick_in");
		String checkInDat = bc.excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 2);
		checkInDate.sendKeys(checkInDat);
		
		WebElement checkOutDate = bc.locateElementById("datepick_out");
		String checkOutDat = bc.excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 3);
		checkOutDate.sendKeys(checkOutDat);
		
		WebElement aduldRoom = bc.locateElementByName("adult_room");
		aduldRoom.click();
		bc.selectByValue(aduldRoom, "2");
		
		Thread.sleep(5000);
		WebElement submit = bc.locateElementByName("Submit");
		submit.click();
		
		WebElement ratioB = bc.locateByXpath("//input[@type=\"radio\"]");
		ratioB.click();
		
		WebElement continu = bc.locateByXpath("//input[@type=\"submit\"]");
		continu.click();
		
		WebElement firstName=bc.locateByXpath("(//input[@type=\"text\"])[11]");
		String firstNam = bc.excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 4);
		firstName.sendKeys(firstNam);
		
		WebElement lastName=bc.locateByXpath("(//input[@type=\"text\"])[12]");
		String lastNam = bc.excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 5);
		lastName.sendKeys(lastNam);
		
		WebElement billingAddress=bc.locateElementByName("address");
		String address = bc.excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 6);
		billingAddress.sendKeys(address);
		
		WebElement creditCard=bc.locateByXpath("(//input[@type=\"text\"])[13]");
		String cardNo = bc.excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 7);
		creditCard.sendKeys(cardNo);
		
		WebElement cardType = bc.locateElementById("cc_type");
		cardType.click();
		bc.selectByValue(cardType, "VISA");
		
		WebElement monthExp = bc.locateElementById("cc_exp_month");
		monthExp.click();
		bc.selectByValue(monthExp, "10");
		
		WebElement yearExp = bc.locateElementById("cc_exp_year");
		yearExp.click();
		bc.selectByValue(yearExp, "2022");
		
		WebElement cvvNo = bc.locateElementByName("cc_cvv");
		String cvv = bc.excelSendKeys("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 8);
		cvvNo.sendKeys(cvv);
		
		WebElement bookNow = bc.locateElementById("book_now");
		bookNow.click();
		
		Thread.sleep(10000);
		WebElement orderNumber = bc.locateElementByName("order_no");
		String attribute = orderNumber.getAttribute("value");
		bc.print(attribute);
//		bc.cellCreate("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 0, 10);
//		bc.excelSetValue("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 0, 10, "orderNumber");
//		bc.cellCreate("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 10);
//		bc.excelSetValue("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 1, 10, attribute);

		bc.cellCreate("C:\\Users\\VOSTRO\\eclipse-workspace\\BaskaranFramework\\files\\HotelBooking.xlsx", "Sheet1", 0, 10, attribute);
		
//		WebElement bookedItinerary = bc.locateByXpath("//a[contains(text(),'Booked')]");
//		bookedItinerary.click();
//		
//		Thread.sleep(10000);
//		WebElement entry = bc.locateElementById("order_id_text");
//		entry.sendKeys(attribute);
//		
//		WebElement go = bc.locateElementByName("search_hotel_id");
//		go.click();
//		
//		WebElement ratioButton = bc.locateByXpath("(//input[@type=\"checkbox\"])[2]");
//		ratioButton.click();
//		
//		WebElement cancel = bc.locateElementByName("cancelall");
//		cancel.click();
//		
//		bc.alertSimple();
		
		
		
		
		
		

	}

}
