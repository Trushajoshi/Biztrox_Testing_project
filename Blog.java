package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Blog {
	WebDriver d = new ChromeDriver();
	
	@BeforeSuite
		public void open() {
			System.out.println("open");

}
	@Test
	public void OpenWebsite() throws InterruptedException {
			d.get("https://mapi.trycatchtech.com/tproject/biztrox/html/blog.html");
			
			  d.manage().window().maximize();
			  d.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		       
			System.out.println("Blog Page");
			
			

			        try {
			            
			            // Locate the Blog section container
			            WebElement blogSection = d.findElement(By.cssSelector(".section1_con"));

			            // Check if the Blog section is visible
			            if (blogSection.isDisplayed()) {
			                System.out.println("The Blog section is visible.");
			            } else {
			                System.out.println("The Blog section is not visible.");
			            }

			            // Additional verification: Check the Blog heading
			            WebElement blogHeading = d.findElement(By.xpath("//div[@class='section1_con_']/h1[text()='Blog']"));
			            if (blogHeading.isDisplayed()) {
			                System.out.println("The Blog heading is displayed.");
			            } else {
			                System.out.println("The Blog heading is not displayed.");
			            }

			        } finally {}
			        
			       
			       
			      

			                try {
			                   
			                    // Locate the image element
			                    WebElement imageElement = d.findElement(By.cssSelector("img[src='../images/page-title.jpg']"));

			                    // Retrieve the CSS 'filter' property
			                    String filterProperty = imageElement.getCssValue("filter");

			                    // Check if the filter includes grayscale
			                    if (filterProperty.contains("grayscale")) {
			                        System.out.println("The image is in grayscale.");
			                    } else {
			                        System.out.println("The image is not in grayscale.");
			                    }

			                } finally {}
			                   			                
			            
			        JavascriptExecutor js = (JavascriptExecutor) d;
					js.executeScript("window.scrollBy(0, 400)");
					System.out.println("scroll down to Blogs");
					Thread.sleep(1000);
			    
			
			        try {
			           
			            // Locate the `.card` element
			            WebElement cardElement = d.findElement(By.cssSelector(".card"));

			            // Locate the image inside `.card_img`
			            WebElement imageElement = d.findElement(By.cssSelector(".card .card_img img"));

			            // Perform hover action on `.card`
			            Actions actions = new Actions(d);
			            actions.moveToElement(cardElement).perform();

			            // Verify that the image is displayed
			            if (imageElement.isDisplayed()) {
			                System.out.println("Hover action successful, image is displayed properly.");
			            } else {
			                System.out.println("Hover action failed, image is not displayed.");
			            }

			        } finally {}
			        
			        JavascriptExecutor aa = (JavascriptExecutor) d;
					js.executeScript("window.scrollBy(0, 1000)");
					System.out.println("scroll down to footer section");
					Thread.sleep(1000);
			        
	}
}

