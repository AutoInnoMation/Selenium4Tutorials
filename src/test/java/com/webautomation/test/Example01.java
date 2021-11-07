package com.webautomation.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class Example01 {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Feature 1 : Multiple TAB
		/*
		 * driver.get("https://www.google.com/");
		 * driver.switchTo().newWindow(WindowType.TAB);
		 * driver.navigate().to("https://www.booking.com/");
		 */
		
		
		
		
		//Feature 2 : get screenshot of particular element 
		/*
		 * driver.get("https://www.google.com/");
		 * 
		 * WebElement agreeElement =
		 * driver.findElement(By.xpath("//div[text()='I agree']"));
		 * agreeElement.click();
		 * 
		 * WebElement logoElement =
		 * driver.findElement(By.xpath("//img[@alt='Google']")); File
		 * file=logoElement.getScreenshotAs(OutputType.FILE); File destFile =new
		 * File("logo.png"); FileUtils.copyFile(file,destFile);
		 */
		
		//Feature 3 : Multiple Window
		/*
		 * driver.get("https://www.google.com/");
		 * driver.switchTo().newWindow(WindowType.WINDOW);
		 * driver.navigate().to("https://www.booking.com/");
		 */
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		//Assume element1 is above element2
		/*WebElement element1;
		element1 = driver.findElement(By.xpath("//a[@id='item_4_title_link']"));
		
		String element2 = driver.findElement(with(By.xpath("//div[@class='inventory_item_desc']")).below(element1)).getText();
		System.out.println("Text from element 2 which is below element1 : "+ element2);*/

		//Assume element0 is above element1
		
		WebElement element1; 
		element1 = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]")); 
		String element0 = driver.findElement(with(By.tagName("div")).above(element1)).getText();
		System.out.println("Text from element 2 which is above element1 : "+ element0);
		  
		  
		  //Assume element0 is on the left side of element1 
		/*WebElement element1;
		element1 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")); 
		String element0 = driver.findElement(with(By.tagName("div")).toLeftOf(element1)).getText();
		System.out.println("Text from element 2 which is Left Of element1 : "+ element0);*/
		  
		   
		  //Assume element0 is on the right side of element1 WebElement element1;
		/*WebElement element1;
		element1 = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]")); 
		String element0 = driver.findElement(with(By.tagName("button")).toRightOf(element1)).getText();
		System.out.println("Text from element 2 which is Left Of element1 : "+ element0);*/
		
	    
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
