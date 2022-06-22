package com.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
   public static void browserConFig() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
       }
   
   public static void loadUrl(String url) {
	    driver.get(url);
       }
   
   public static void maximize() {
	    driver.manage().window().maximize();
       }
   
   public static WebElement locateElementById(String id) {
	   WebElement element = driver.findElement(By.id(id));
	   return element;
       }
   
   public static WebElement locateElementByName(String name) {
	   WebElement element = driver.findElement(By.name(name));
	   return element;
       }
   
   public static WebElement locateByClassName(String classname) {
	   WebElement element = driver.findElement(By.className(classname));
	   return element;
       }
   
   public static WebElement locateByXpath(String xpath) {
	   WebElement element = driver.findElement(By.xpath(xpath));
	   return element;
       }
   
   public static WebElement locateByTagName(String tagname) {
	   WebElement element = driver.findElement(By.tagName(tagname));
	   return element;
       }
   
   public static void selectByIndex(WebElement element, int i) {
	   Select s=new Select(element);
	   s.selectByIndex(i);
      }
   
   public static void selectByValue(WebElement element, String value) {
	   Select s=new Select(element);
	   s.selectByValue(value);
      }
   
   public static void selectByVisibleText(WebElement element, String text) {
	  Select s=new Select(element);
	  s.selectByVisibleText(text);
      }
   
   public String getText(WebElement element) {
	  String text = element.getText();
      return text;
      }
   
   public void print(String text) {
	  System.out.println(text);
      }
   
   public void alertSimple() {
	Alert a = driver.switchTo().alert();
	a.accept();
      }
   public void screenShot(String path) throws IOException {
	   TakesScreenshot ts=(TakesScreenshot)driver;
	   File source = ts.getScreenshotAs(OutputType.FILE);
	   File file=new File(path);
	   FileUtils.copyFile(source, file);
      }
   
   public void excelReplaceAll(String path, String sheet, String old, String newone) throws Exception {
	File f=new File(path);
	FileInputStream fis=new FileInputStream(f);
	Workbook w=new XSSFWorkbook(fis);
	Sheet s = w.getSheet(sheet);
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			if (c.equals(old)) {
				c.setCellValue(newone);
			}
		}
	}
	FileOutputStream out=new FileOutputStream(f);
	w.write(out);
}
   
 public void cellCreate(String path, String sheet,int rowNo,int cellNo , String value) throws Exception {
	 File f=new File(path);
	 FileInputStream fis=new FileInputStream(f);
	 Workbook w=new XSSFWorkbook(fis);
	 Sheet s = w.getSheet(sheet);
	 Row r = s.getRow(rowNo);
	 Cell c = r.createCell(cellNo);
	 c.setCellValue(value);
	 FileOutputStream out=new FileOutputStream(f);
	 w.write(out);
     }  
 
 public void rowCreate(String path, String sheet,int rowNo) throws Exception {
	 File f=new File(path);
	 FileInputStream fis=new FileInputStream(f);
	 Workbook w=new XSSFWorkbook(fis);
	 Sheet s = w.getSheet(sheet);
	 s.createRow(rowNo);
	 FileOutputStream out=new FileOutputStream(f);
	 w.write(out);
     } 
 
 public void excelSetValue(String path, String sheet,int rowNo, int cellNo, String input) throws Exception {
	 File f=new File(path);
	 FileInputStream fis=new FileInputStream(f);
	 Workbook w=new XSSFWorkbook(fis);
	 Sheet s = w.getSheet(sheet);
	 Row r = s.createRow(rowNo);
	 Cell c = r.getCell(cellNo);
	 c.setCellValue(input);
	 FileOutputStream out=new FileOutputStream(f);
	 w.write(out);
     } 
   
   public  String excelSendKeys(String path, String sheet, int rowNo, int cellNo) throws Exception {
	   
	   String value = null;
	   File f=new File (path);
	   FileInputStream fis=new FileInputStream(f);
	   Workbook w=new XSSFWorkbook(fis);
	   Sheet s = w.getSheet(sheet);
	   Row r = s.getRow(rowNo);
	   Cell c = r.getCell(cellNo);
	   CellType type = c.getCellType();
	   switch (type) {
	      case STRING:
	    	  value = c.getStringCellValue();
	    	  break;
	      case NUMERIC:
	    	  if (DateUtil.isCellDateFormatted(c)) {
	    		  Date date = c.getDateCellValue();
	    		  SimpleDateFormat sdf=new SimpleDateFormat();
	    		   value = sdf.format(date);
        		
				}
	    	  else {
                  double numeric = c.getNumericCellValue();
                  BigDecimal bd=BigDecimal.valueOf(numeric);
                 value = bd.toString();
			}

	}
	   return value;

}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
