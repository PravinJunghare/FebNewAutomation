package com.maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void method() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.quit();
	}

}
