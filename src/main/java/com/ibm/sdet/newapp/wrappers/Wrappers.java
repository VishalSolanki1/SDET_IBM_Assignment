package com.ibm.sdet.newapp.wrappers;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Wrappers{

	public void clickByLinkText(WebDriver driver, String linkText) {
		driver.findElement(By.linkText(linkText)).click();
		System.out.println("The " + linkText + " link is clicked");
	}
	
	public void enterById(WebDriver driver, String id, String value) {
		WebElement element  = driver.findElement(By.id(id));
		String elementValue = element.getText();
		element.clear();
		element.sendKeys(value);
		System.out.println("Value: " + value + " has been entered in " + "Field: " + elementValue);
	}
	
	public void enterByXpath(WebDriver driver, String value, String xpath) {
		WebElement element  = driver.findElement(By.xpath(xpath));
		String elementValue = element.getText();
		element.clear();
		element.click();
		element.sendKeys(value);
		System.out.println("Value: " + value + " has been entered in " + "Field: " + elementValue);
	}
	
	public void enterByClassName(WebDriver driver, String value, String className) {
		WebElement element  = driver.findElement(By.className(className));
		String elementValue = element.getText();
		element.clear();
		element.click();
		element.sendKeys(value);
		System.out.println("Value: " + value + " has been entered in " + "Field: " + elementValue);
	}
	
	public void clickById(WebDriver driver, String id) {
		WebElement element  = driver.findElement(By.id(id));
		String elementValue = element.getText();
		element.click();
		System.out.println("Button " + elementValue + " is clicked");
	}
	
	public void clickByXpath(WebDriver driver, String xpath) {
		WebElement element  = driver.findElement(By.xpath(xpath));
		String elementValue = element.getText();
		element.click();
		System.out.println("Button " + elementValue + " is clicked");
	}
		
	public String getTextByXpath(WebDriver driver, String xPath) {
		WebElement element  = driver.findElement(By.xpath(xPath));
		String elementText = element.getText();
		System.out.println("Text found: " + elementText);
		return elementText;
	}
	
	public void waitForNextPage(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
}
