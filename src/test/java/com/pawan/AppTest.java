package com.pawan;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AppTest {
	
	@Test
	public void  google(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\INTACT\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://pun1lvm20:11880/ProductCps/home");
		
		driver.findElement(By.xpath("//*[@id='field_userid']")).sendKeys("rkadm");
		driver.findElement(By.xpath("//*[@id='login-passwd-webcontrol']/input")).sendKeys("rkadm");
		
		driver.findElement(By.xpath("//*[@id='button-login']/input")).click();
		

		
		driver.close();
		

		
		
		
	}
	
}
   