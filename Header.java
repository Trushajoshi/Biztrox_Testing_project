package project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Header {

WebDriver d = new ChromeDriver();
	
	@BeforeSuite
		public void open() {
			System.out.println("open");
		}	
	@Test
	public void OpenWebsite() throws InterruptedException {
			d.get("https://mapi.trycatchtech.com/tproject/biztrox/html/home.html");
			
			  d.manage().window().maximize();
			  d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
			  
		   try {
	            
	            WebElement header = d.findElement(By.className("header_head"));

	           
	            if (header.isDisplayed()) {
	                System.out.println("Header section is visible.");
	            } else {
	                System.out.println("Header section is NOT visible.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {}
	        	
	        	
		      d.findElement(By.linkText("info@companyname.com")).click();
		       System.out.println("email ID is visible ");

	
	
	        try {
	         
	            // Locate the "Call Us Now" link by text
	            WebElement callUsNowLink = d.findElement(By.xpath("//a[contains(.,'Call Us Now') and span[text()=' 123-456-5523 ']]"));

	            // Check if the element is displayed
	            if (callUsNowLink.isDisplayed()) {
	                System.out.println("Call Us Now with contact number is visible.");
	            } else {
	                System.out.println("Call Us Now with contact number is NOT visible.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	          
	        }
	  
	                try {
	                
	                    // Locate the search icon by its class
	                    WebElement searchIcon = d.findElement(By.className("fa-search"));

	                    // Check if the search icon is displayed
	                    if (searchIcon.isDisplayed()) {
	                        System.out.println("Search icon is visible.");

	                        // Simulate a click on the search icon
	                        searchIcon.click();

	                        // Verify the expected behavior after clicking
	                        // Example: Check if a search bar becomes visible
	                        WebElement searchBar = d.findElement(By.className("fa-search")); // Replace with the actual ID or locator
	                        if (searchBar.isDisplayed()) {
	                            System.out.println("Search icon is working. Search bar is visible.");
	                        } else {
	                            System.out.println("Search icon is not working as expected.");
	                        }
	                    } else {
	                        System.out.println("Search icon is NOT visible.");
	                    }
	                } catch (Exception e) {
	                    e.printStackTrace();
	                } finally {}
	                  
	              
	                        try {
	                           

	                            // Locate the logo image element by its tag and alt attribute
	                            WebElement logo = d.findElement(By.cssSelector(".navlogo img"));

	                            // Check if the logo is displayed
	                            if (logo.isDisplayed()) {
	                                System.out.println("Logo is visible.");
	                            } else {
	                                System.out.println("Logo is NOT visible.");
	                            }
	                        } catch (Exception e) {
	                            e.printStackTrace();
	                        } finally {
	                            
	                    }
	                        

	                                try {
	                                  
	                                    // Locate the <ul> element inside the navlink div
	                                    List<WebElement> navLinks = d.findElements(By.cssSelector(".navlink ul li a"));

	                                    // Loop through each link and check if it is visible
	                                    for (WebElement link : navLinks) {
	                                        if (link.isDisplayed()) {
	                                            System.out.println("Link: " + link.getText() + " is visible.");
	                                        } else {
	                                            System.out.println("Link: " + link.getText() + " is NOT visible.");
	                                        }
	                                    }
	                                } catch (Exception e) {
	                                    e.printStackTrace();
	                                } finally {
	                                   	                                
	                            }
	                        

	                }

}  

	                     
	                    
	                

	            
	        
			
	      
	        
	
	    
	


		       
		      