package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.SeleniumHomePage;
import com.leafBot.testng.api.base.Annotations;

public class TC008_Alerts extends Annotations {
	
	@BeforeTest
	public void setData() {
		testcaseName = "TC_001_DropDown";
		testcaseDec = "dropdown";
		author = "Venkatesh";
		category = "smoke";
	}
	
	@Test(priority=7)
	public void select_alerts()
	{
		new SeleniumHomePage().alerts_models().simple_alert();
	}

}
