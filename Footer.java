package project;

import java.awt.Point;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Footer {
	WebDriver d = new ChromeDriver();
	
	@BeforeSuite
		public void open() {
			System.out.println("open");
		}	
		
	@Test
	public void OpenWebsite() throws InterruptedException {
			d.get("https://mapi.trycatchtech.com/tproject/biztrox/html/home.html\r\n");
			
			  d.manage().window().maximize();
			  d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		       
			System.out.println("Home page");
			
			   JavascriptExecutor js = (JavascriptExecutor) d;
				js.executeScript("window.scrollBy(0, 6900)");
				System.out.println("scroll down to footer section");
				Thread.sleep(1000);
		    
				
			
				
				        try {
				            // List of pages to check
				            String[] pages = {
				            	"https://mapi.trycatchtech.com/tproject/biztrox/html/home.html",
				                "https://mapi.trycatchtech.com/tproject/biztrox/html/about.html",
				                "https://mapi.trycatchtech.com/tproject/biztrox/html/service.html",
				                "https://mapi.trycatchtech.com/tproject/biztrox/html/pages.html",
				                "https://mapi.trycatchtech.com/tproject/biztrox/html/blog.html",
				                "https://mapi.trycatchtech.com/tproject/biztrox/html/contact.html",
				            	"https://mapi.trycatchtech.com/tproject/biztrox/html/home.html"

				            };

				            // Get the footer HTML from the first page as a reference
				            d.get(pages[0]);
				            WebElement footer1 = d.findElement(By.xpath("//footer"));
				            String footerHtml1 = footer1.getAttribute("outerHTML");

				            boolean footerMatch = true;

				            // Check footer HTML on other pages
				            for (String page : pages) {
				                d.get(page);
				                WebElement footer2 = d.findElement(By.xpath("//footer"));
				                String footerHtml2 = footer2.getAttribute("outerHTML");

				                if (!footerHtml1.equals(footerHtml2)) {
				                    footerMatch = false;
				                    System.out.println("Footer mismatch found on page: " + pages);
				                }
				            }

				            // Output the result
				            if (footerMatch) {
				                System.out.println("Footer is consistent across all pages.");
				            } else {
				                System.out.println("Footer is not consistent across all pages.");
				            }

				        } finally {}
				        
				        JavascriptExecutor aa = (JavascriptExecutor) d;
						js.executeScript("window.scrollBy(0, 6900)");
						System.out.println("scroll down to footer section");
						Thread.sleep(1000);
				        
				        
				       		 try {
				                   	 // Locate the image element
				                    WebElement image = d.findElement(By.xpath("//img[@src='../images/logo-footer.png']"));

				                    // Check if the image is visible
				                    if (image.isDisplayed()) {
				                        System.out.println("The image is visible.");
				                    } else {
				                        System.out.println("The image is not visible.");
				                    }
				                } catch (Exception e) {
				                    System.out.println("An error occurred: " + e.getMessage());
				                } finally {}
				                   
				       	
			
}
}
