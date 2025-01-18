package project;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Service {
	WebDriver d = new ChromeDriver();
	@BeforeSuite
	public void open() {
		System.out.println("open");

}
	
	@Test

	public void OpenWebsite() throws InterruptedException {
		d.get("https://mapi.trycatchtech.com/tproject/biztrox/html/service.html");
		System.out.println("Service page");
		
		  d.manage().window().maximize();
		  d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		   
		  d.findElement(By.linkText("FREE ENQURY")).click();
		  System.out.println("FREE ENQURY Button");
		  Thread.sleep(1000);
		  d.navigate().back();
		  
		  try {
	            List<WebElement> elements = d.findElements(By.xpath("//h1[text()='SERVIC WE PROVIDE']"+ ""));
	            
	            String expectedText = "Service";
	            
	            for (WebElement element : elements) {
	                String actualText = element.getText();
	                if (actualText.equals(expectedText)) {
	                    System.out.println("Text matches for element: " + actualText);
	                } else {
	                    System.out.println("Text does NOT match. Found: " + actualText);
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
		  
		  JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollBy(0, 1500)");
			System.out.println("Scroll down to Read more button");
			
			

			//d.findElement(By.xpath("//a[@href='service.html'][1]")).click();
			//d.findElement(By.linkText("Read more")).click();
			//System.out.println("Read more");
		
			
			
			
			
			
			
			
			
			
	}
}


	
	

