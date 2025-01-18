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

public class Contact {
	WebDriver d = new ChromeDriver();
	
	@BeforeSuite
		public void open() {
			System.out.println("open");
}
	
@Test
public void OpenWebsite() throws InterruptedException {
		d.get("https://mapi.trycatchtech.com/tproject/biztrox/html/contact.html");
		
		  d.manage().window().maximize();
		  d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	       
		System.out.println("Contact page");
		
		
		 JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollBy(0, 500)");
			System.out.println("scroll down to Contact Us section");
			Thread.sleep(1000);
			
			
			        try {
			            
			            // Locate the "Contact" section
			            WebElement contactSection = d.findElement(By.cssSelector(".section2_main"));

			            // Check if the "Contact" section is visible
			            if (contactSection.isDisplayed()) {
			                System.out.println("The 'Contact' section is visible.");
			            } else {
			                System.out.println("The 'Contact' section is not visible.");
			            }

			        } finally {}
			            			        
			       

			                try {
			                    // Locate and check visibility of `fa-mobile`
			                    WebElement mobileIcon = d.findElement(By.cssSelector("i.fa-mobile"));
			                    if (mobileIcon.isDisplayed()) {
			                        System.out.println("Mobile icon is visible.");
			                    } else {
			                        System.out.println("Mobile icon is not visible.");
			                    }

			                    // Locate and check visibility of `fa-envelope-o`
			                    WebElement emailIcon = d.findElement(By.cssSelector("i.fa-envelope-o"));
			                    if (emailIcon.isDisplayed()) {
			                        System.out.println("Email icon is visible.");
			                    } else {
			                        System.out.println("Email icon is not visible.");
			                    }

			                    // Locate and check visibility of `fa-map-o`
			                    WebElement mapIcon = d.findElement(By.cssSelector("i.fa-map-o"));
			                    if (mapIcon.isDisplayed()) {
			                        System.out.println("Map icon is visible.");
			                    } else {
			                        System.out.println("Map icon is not visible.");
			                    }

			                } finally {}
			                
			              
			                        try {
			                           
			                            // Check if country codes are visible
			                            List<WebElement> countryCodes = d.findElements(By.cssSelector(".contact_con p"));
			                            boolean allCodesVisible = true;
			                            for (WebElement code : countryCodes) {
			                                if (!code.isDisplayed()) {
			                                    allCodesVisible = false;
			                                    break;
			                                }
			                            }
			                            if (allCodesVisible) {
			                                System.out.println("All country codes are visible.");
			                            } else {
			                                System.out.println("Some country codes are not visible.");
			                            }
			                        } finally {}
			                        
			                        try {
		                                  // Check if the form is visible
		                                    WebElement form = d.findElement(By.xpath("//div[@class='form']"));
		                                    if (form.isDisplayed()) {
		                                        System.out.println("Contact Form is visible.");

		                                        // Check individual fields
		                                        WebElement nameField = d.findElement(By.xpath("//input[@placeholder='Name']"));
		                                        WebElement emailField = d.findElement(By.xpath("//input[@placeholder='Email Address']"));
		                                        WebElement subjectField = d.findElement(By.xpath("//input[@placeholder='Subjects']"));
		                                        WebElement messageBox = d.findElement(By.xpath("//textarea[@placeholder='Your Message Here']"));

		                                        if (nameField.isDisplayed() && emailField.isDisplayed() && subjectField.isDisplayed() && messageBox.isDisplayed()) {
		                                            System.out.println("All required fields (Name, Email, Subject, Message Box) are visible.");
		                                        } else {
		                                            System.out.println("One or more fields are not visible.");
		                                        }
		                                    } else {
		                                        System.out.println("Contact Form is not visible.");
		                                    }
		                                } finally {}        
		                                     
			                        
			                     
			                              try {
			                            	  d.findElement(By.name("name")).sendKeys("Trusha Joshi");
						                      System.out.println("Name has been successfully inputted.");
						                      

			                                  // Locate the email input field
			                                  WebElement emailField = d.findElement(By.xpath("//input[@placeholder='Email Address']"));

			                                  // Input the email
			                                  emailField.sendKeys("trushajoshi@gmail.com");

			                                  System.out.println("Email has been successfully inputted.");
			                                  
			                                  d.findElement(By.id("subject")).sendKeys("Project");
			                                  System.out.println("Project");
			                                  
			                                  
			                                  WebElement textArea = d.findElement(By.xpath("//textarea[@placeholder='Your Message Here']"));
			                                  textArea.sendKeys("This is a sample message to test the text area input.");

                                              System.out.println("Text has been successfully inputted in the textarea.");
                                            
			                           
			                              } finally {}
			                                
			                              try {
			                                     // Locate the "Explore More" link
			                                WebElement exploreMoreButton = d.findElement(By.xpath("//a[text()='Explore More']"));
			                                exploreMoreButton.click();

			                                 System.out.println("Explore More button has been clicked.");
			                                 
			                               } finally {}
			                                         
			                             JavascriptExecutor aa = (JavascriptExecutor) d;
			                  			js.executeScript("window.scrollBy(0, 1500)");
			                  			System.out.println("scroll down to footer section");
			                  			Thread.sleep(1000);
      

}
}
			        

			

			
			
			
			
			
			
			
			







