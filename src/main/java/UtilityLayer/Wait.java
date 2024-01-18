package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseClass;

public class Wait extends BaseClass{
	
	public static void SendKeys(WebElement wb, String value)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		Waitwb.sendKeys(value);	
	}
	
	public static void click(WebElement wb)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Waitwb = wait.until(ExpectedConditions.visibilityOf(wb));
		Waitwb.click();
	}

}
