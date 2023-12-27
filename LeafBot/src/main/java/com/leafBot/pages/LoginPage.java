package com.leafBot.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.leafBot.testng.api.base.ProjectSpecificMethods;



public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage(RemoteWebDriver driver, ExtentTest node){
		this.driver = driver;
		this.node = node;
			}
	 
	
	
	public LoginPage enterUserName(String data) {	
		zoomOutUsingJS(150);
		
		clearAndType(locateElement("id","username"), data);
		return this;
	}	

	public LoginPage enterPassword(String data) {
		
	
		clearAndType(locateElement("id","password"), data);
		return this;
	}	
	
	public HomePage clickLogin() {
		WebElement element = locateElement("class","decorativeSubmit");
		driver.executeScript("arguments[0].click();", element);
		return new HomePage(driver, node);		
	}
	
	
	public LoginPage verifyErrorMsg(String data) {
		verifyPartialText(locateElement("id","errordiv"), data);
		return this;
	}
	
	
}
