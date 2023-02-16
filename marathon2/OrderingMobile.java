package marathon2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://dev57553.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("5$dJ*EFdhhW0");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		Thread.sleep(3000);
		
		Shadow shadow = new Shadow(driver);
		
		shadow.setImplicitWait(30);
		
	    shadow.findElementByXPath("//div[text()='All']").click();
	 
	    
   
	    WebElement filter = shadow.findElementByXPath("//div[class()='sn-polaris-nav-header-filter can-animate']/label[text()='All filter navigator']");
	    filter.click();
	    filter.sendKeys("Service Catalog");
	    filter.sendKeys(Keys.ENTER);


//        WebElement serviceCatalog = shadow.findElementByXPath("//span[text()='Service Catalog']");
//       serviceCatalog.click();
//		
//		
	}

}
