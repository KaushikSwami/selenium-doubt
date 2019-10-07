package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class Javascript_alert extends Annotations{
	public Javascript_alert()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="(//button[text()='Click me!'])[1]") WebElement click_button;
	
	
	
	public void simple_alert()
	{
		click(click_button);
		acceptAlert();
	}

	

}
