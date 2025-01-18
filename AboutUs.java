package project;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AboutUs {
	WebDriver d = new ChromeDriver();
	
	@BeforeSuite
	public void open() {
		System.out.println("open");
}
	
	
@Test

	public void OpenWebsite() throws InterruptedException {
		d.get("https://mapi.trycatchtech.com/tproject/biztrox/html/about.html");
		System.out.println("About Us page");
		
		  d.manage().window().maximize();
		  d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

		  try {

	            // Locate the "About Us" section using its class
	            WebElement aboutUsSection = d.findElement(By.cssSelector(".section1_con h1"));

	            // Check if the section is visible
	            if (aboutUsSection.isDisplayed()) {
	                System.out.println("The 'About Us' section is visible.");
	            } else {
	                System.out.println("The 'About Us' section is NOT visible.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		  
		  

		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 1000)");
		System.out.println("scroll down to Explore More button");
		Thread.sleep(1000);
	
		d.findElement(By.linkText("Explore more")).click();
		System.out.println("Explore more");
		Thread.sleep(1000);
		d.navigate().back();
		
		JavascriptExecutor aa = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 1000)");
		System.out.println("scroll down to Explore More button");
		Thread.sleep(1000);
		
		
		d.findElement(By.className("quote_link")).click();
		System.out.println("Get An Quote");
		
		JavascriptExecutor bb = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 3000)");
		System.out.println("scroll down till bottom");
		Thread.sleep(1000);
		
		
}
	
	
}


