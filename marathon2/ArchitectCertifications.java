package marathon2;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class ArchitectCertifications {

	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement user = driver.findElement(By.id("username"));
		
		
		user.sendKeys("hari.radhakrishnan@qeagle.com");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		Thread.sleep(3000);
		

		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		System.out.println(parentWindow);
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
	
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

	
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		
		Thread.sleep(3000);
		
	
		Actions action = new Actions(driver);
		
		WebElement shaLearn = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
				
		action.moveToElement(shaLearn).perform();
		
		WebElement shaCert = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		driver.executeScript("arguments[0].click();", shaCert);
		
		driver.findElement(By.xpath("//div[@class='slds-grid slds-wrap slds-grid--align-center']/div[2]")).click();
		
		WebElement txtSummary = driver.findElement(By.xpath("//div[@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large']"));
		
		System.out.println(txtSummary.getText());
		
	   List<WebElement> certName = driver.findElements(By.xpath("//div[@class='slds-size--1-of-1 slds-large-size--1-of-3 slds-p-horizontal--medium slds-p-vertical--medium']//div[@class='credentials-card_title']"));
	  
	   for (int i = 0; i < certName.size(); i++) {
		   
		   String certList = certName.get(i).getText();
		   System.out.println(" List1 : " + certList);
		
	}
	   
	   driver.findElement(By.xpath("//div[@class='slds-size--1-of-1 slds-large-size--1-of-3 slds-p-horizontal--medium slds-p-vertical--medium']//div[@class='credentials-card_title']")).click();
	   
	   List<WebElement> certName2 = driver.findElements(By.xpath("//div[@class='slds-container--center slds-container--x-large slds-p-top--small']//div[@class='credentials-card_title']"));
	   
	   for (int j = 0; j < certName2.size(); j++) {
		   
		   String certList2 = certName2.get(j).getText();
		   System.out.println(" List :" + certList2);
		
	}
	   
	   File source = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snaps/Architect.png");
		
		FileUtils.copyFile(source, dest);
	
	   driver.quit();

	}
}
