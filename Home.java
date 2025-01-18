package project;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Home {
	
	WebDriver d = new ChromeDriver();
	
@BeforeSuite
	public void open() {
		System.out.println("open");
	}	
	
@Test
public void OpenWebsite() throws InterruptedException {
		d.get("https://mapi.trycatchtech.com/tproject/biztrox/html/home.html\r\n");
		
		  d.manage().window().maximize();
		  d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	       
		System.out.println("Home page");
		
		d.findElement(By.linkText("MORE DETAILS")).click();
	
		d.navigate().back();
		Thread.sleep(1000);
		
		
		d.findElement(By.className("material-symbols-outlined")).click();
		System.out.println("Consultation");
		Thread.sleep(2000);
		
		
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
		js.executeScript("window.scrollBy(0, 1000)");
		System.out.println("scroll down to Read more button");
		
		
		d.findElement(By.linkText("Read more")).click();
		System.out.println("Read more");
		d.navigate().back();
		Thread.sleep(1000);
	
		 try {
	            
	            // Locate all solution points in the black box
	            List<WebElement> solutionPoints = d.findElements(By.cssSelector(".business_solution .solution p"));

	            // Use a HashSet to check for uniqueness
	            Set<String> uniquePoints = new HashSet<>();
	            boolean isUnique = true;

	            for (WebElement point : solutionPoints) {
	                String text = point.getText().trim();
	                if (!uniquePoints.add(text)) {
	                    // If adding to the set returns false, the point is a duplicate
	                    System.out.println("Duplicate found: " + text);
	                    isUnique = false;
	                }
	            }
	            if (isUnique) {
	                System.out.println("All points are unique.");
	            } else {
	                System.out.println("Some points are duplicated.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
		 
		
		JavascriptExecutor aa = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 490)");
		System.out.println("scroll down to Explore more button");
		Thread.sleep(1000);
		
		d.findElement(By.linkText("Explore more")).click();
		System.out.println("Explore more");
		Thread.sleep(1000);
		d.navigate().back();
		
		
		JavascriptExecutor bb = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 1350)");
		System.out.println("scroll down to Latest Project section");
		Thread.sleep(2000);
		
	
		d.findElement(By.className("section4_overlay")).click();
		System.out.println("imag / hyperlinks");
	
		JavascriptExecutor cc = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 650)");
		System.out.println("scroll down to Latest Project section");
		Thread.sleep(2000);
	
		d.findElement(By.className("section5_multi")).click();
		System.out.println("Our Company Mission");
	
		JavascriptExecutor dd = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 650)");
		System.out.println("scroll down to We are always comited section");
		Thread.sleep(2000);
		
		d.findElement(By.className("section6_icon")).click();
		System.out.println("Our Company Mission video");
		Thread.sleep(1000);
	
		JavascriptExecutor ee = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 4660)");
		System.out.println("scroll down to What Clients Say section");
		Thread.sleep(2000);
		
		
		
		d.findElement(By.xpath("//i[@class='fa fa-arrow-left']")).click();
		System.out.println("Slides of What Clients Say");
	
		JavascriptExecutor ff = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 480)");
		System.out.println("scroll down to Get An Quote");
		Thread.sleep(1000);
		
		d.findElement(By.className("quote_link")).click();
		System.out.println("Get An Quote");
		Thread.sleep(1000);
		
		JavascriptExecutor gg = (JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0, 6600)");
		System.out.println("scroll down to Get An Quote");
		Thread.sleep(1000);

}


}
