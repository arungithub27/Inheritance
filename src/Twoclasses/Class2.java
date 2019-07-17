package Twoclasses;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2  {
	
	@BeforeTest
	public void test2(){
		System.out.println("Check");
	}
	@Test(priority=11)
	public void b() throws InterruptedException{
		//Thread.sleep(4000);
		//System.out.println("Entered Into clss2");
		//driver.findElement(By.xpath("html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Okay");
		System.out.println("Test");
		
	}

}
