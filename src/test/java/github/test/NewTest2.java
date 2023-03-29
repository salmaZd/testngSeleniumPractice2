package github.test;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class NewTest2 {
	
	

  @BeforeTest
  public void TestGitHub() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		
		
		
	}
  
  @Test
  public void f() {
	  String email = "12345@gmail.com";
	  String pass = "55555";
	  
	  Assert.assertEquals(email, email);
	  
	 
	  
	  
	  
  }

}
