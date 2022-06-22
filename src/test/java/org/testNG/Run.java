package org.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Run {
	@Test(dataProvider = "data",dataProviderClass = DataProviderc.class)
	private void tc1(String s1, String s2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtBox = driver.findElement(By.id("email"));
		txtBox.sendKeys(s1);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(s2);
		WebElement logi = driver.findElement(By.name("login"));
		logi.click();
	}
	

}
