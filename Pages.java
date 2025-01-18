package project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Pages {
	WebDriver d = new ChromeDriver();
	
	@BeforeSuite
	public void open() {
		System.out.println("open");
	}
	@Test

	public void OpenWebsite() throws InterruptedException {
		d.get("https://mapi.trycatchtech.com/tproject/biztrox/html/pages.html");
		System.out.println("page");
		
		  d.manage().window().maximize();
		  d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		  
		  JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollBy(0, 600)");
			System.out.println("scroll down to OUR AWESOME TEAM section");
			Thread.sleep(1000);
			
			

			        try {
			            // Locate the element to hover over (e.g., a social media icon)
			            WebElement facebookIcon = d.findElement(By.xpath("//i[@class='fa fa-facebook']"));

			            // Create Actions instance
			            Actions actions = new Actions(d);

			            // Perform hover action
			            actions.moveToElement(facebookIcon).perform();

			            // Verify hover effect (example: check if tooltip or link is displayed)
			            WebElement tooltip = d.findElement(By.xpath("//div[@class='card_con']")); // Adjust as needed
			            if (tooltip.isDisplayed()) {
			                System.out.println("Hover action succeeded, tooltip is visible.");
			            } else {
			                System.out.println("Hover action failed, tooltip is not visible.");
			            }
			        } finally {}
			      //div[@class='team_card']/img

			        
			       
			                try {
			                    
			                    // Locate the image or card element to hover over
			                    WebElement teamCard = d.findElement(By.cssSelector(".team_card"));

			                    // Perform hover action
			                    Actions actions = new Actions(d);
			                    actions.moveToElement(teamCard).perform();

			                    // Verify hover effect (e.g., visibility of social media icons)
			                    WebElement facebookIcon = d.findElement(By.cssSelector(".fa.fa-facebook"));
			                    if (facebookIcon.isDisplayed()) {
			                        System.out.println("Hover action successful, social media icons are visible.");
			                    } else {
			                        System.out.println("Hover action failed, social media icons are not visible.");
			                    }
			                } finally {
			                    
			                }
			            
			                JavascriptExecutor aa = (JavascriptExecutor) d;
			    			js.executeScript("window.scrollBy(0, 500)");
			    			System.out.println("scroll down to OUR AWESOME TEAM section");
			    			Thread.sleep(1000);
			        
			    			
			    			        try {
			    			            
			    			            // Locate the image element or card container
			    			            WebElement imageElement = d.findElement(By.cssSelector("img[src='../images/team-page-4.jpg']"));

			    			            // Perform hover action
			    			            Actions actions = new Actions(d);
			    			            actions.moveToElement(imageElement).perform();

			    			            // Verify hover effect (e.g., visibility of Facebook icon)
			    			            WebElement facebookIcon = d.findElement(By.cssSelector(".card_con .fa.fa-facebook"));
			    			            if (facebookIcon.isDisplayed()) {
			    			                System.out.println("Hover action successful, Facebook icon is visible.");
			    			            } else {
			    			                System.out.println("Hover action failed, Facebook icon is not visible.");
			    			            }

			    			        } finally {}
			    			            
			    			        JavascriptExecutor bb = (JavascriptExecutor) d;
					    			js.executeScript("window.scrollBy(0, 500)");
					    			System.out.println("scroll down to Get An Quote ");
					    			Thread.sleep(1000);
					    			
					    			
					    			
			    			       d.findElement(By.className("quote_link")).click();
			    			       System.out.println("Get An Quote");
			    			       Thread.sleep(1000);
			    			     
			    			       
			    			       JavascriptExecutor cc = (JavascriptExecutor) d;
					    			js.executeScript("window.scrollBy(0, 2400)");
					    			System.out.println("scroll down to OUR AWESOME TEAM section  ");
					    			Thread.sleep(1000);
					    			

					    			        try {
					    			             // Locate the card container
					    			            WebElement cardContainer = d.findElement(By.cssSelector(".card_con"));

					    			            // Perform hover action
					    			            Actions actions = new Actions(d);
					    			            actions.moveToElement(cardContainer).perform();

					    			            // Verify hover effect, such as the visibility of Facebook icon
					    			            WebElement facebookIcon = d.findElement(By.cssSelector(".card_con .fa.fa-facebook"));
					    			            if (facebookIcon.isDisplayed()) {
					    			                System.out.println("Hover action successful, Facebook icon is visible.");
					    			            } else {
					    			                System.out.println("Hover action failed, Facebook icon is not visible.");
					    			            }

					    			           

					    			        } finally {}
					    			        
					    			    }
					    			
			    			}
	
	
	

					    
			    			

			        
			        

			   
			     
		  
	   
		  
		   
	 
