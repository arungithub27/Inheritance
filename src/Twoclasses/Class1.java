package Twoclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 extends Class2 {
	
@BeforeTest
public void arun(){
	System.out.println("First");
	}

@Test
public void B(){
	System.out.println("Second");
}

@Test
public void C(){
	System.out.println("Third");
}




}
