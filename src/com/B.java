package com;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class B {
	
	ChromeDriver driver;
	
	void openBrowser()  {
	
	//System.setProperty("webdriver.chrome.driver",  
		
		driver=new ChromeDriver();

}
	void gotoUrl()  {
		
		driver.get(http://www.facebook.com);
	}
	
	void gotoUrl(String url) {
		
		driver.get("url");
		
	}
	void type()
	{ 
		driver.findElement(By.id("")).sendKeys("email")).sendKeys(sislam@gmail");
	}
	
	void type(By x,String text)
	driver.findElement(x).sendKeys(text);
		
		void getTextFromelement() {
			
			driver.findElement(By.id("u_0_2")).getText();
		}
		
		
void getTextFromelement(String v) {
			
			driver.findElement(By.id("u_0_2")).getText();
			
}


	
	
	
