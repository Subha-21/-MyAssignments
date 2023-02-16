package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) throws InterruptedException, IOException {
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

	 //   shadow.findElementByXPath("//div[@class ='sn-polaris-nav-header-filter can-animate']/label[text()='All filter navigator']").sendKeys("Service Catalog", Keys.ENTER);

	    shadow.findElementByXPath("//span[text()='Service Catalog']").click();
	    
	   WebElement mobile = shadow.findElementByXPath("//iframe[@id ='gsft_main']");
	    
	    driver.switchTo().frame(mobile);
	    
	    driver.findElement(By.xpath("//h2[contains(text(), 'Mobiles')]")).click();
	    
	    driver.findElement(By.xpath("//strong[text()='iPhone 6s']")).click();
	    
	    WebElement mobileColor = driver.findElement(By.xpath("//select[@class ='form-control cat_item_option ']"));
	    
	    Select mc = new Select(mobileColor);
	    
	    mc.selectByVisibleText("Gold");
	    
	    WebElement mobileStorage = driver.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]"));
	    
	    Select ms = new Select(mobileStorage);
		
	    ms.selectByVisibleText("128");
	    
	    driver.findElement(By.id("oi_order_now_button")).click();
	    
	    String orderPlaced = driver.findElement(By.xpath("//div[@class = 'notification notification-success']/span")).getText();
	    
	    if (orderPlaced.contains("has been submitted")) {
	    	
	    	System.out.println("Order is placed");
			
		} else {
			
			System.out.println("Order not placed");

		}
	    
	    String requestNumber = driver.findElement(By.id("requesturl")).getText();
	    
	    System.out.println("Request Number is : " + requestNumber);	    
	    
	    File Source = driver.getScreenshotAs(OutputType.FILE);
	    
	    File dest = new File("./snaps/Request.png");
	    
	    FileUtils.copyFile(Source, dest);
	
	}

}
