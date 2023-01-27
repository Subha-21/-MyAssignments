package w2d2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
{
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();	
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("44");
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7896656789");
			driver.findElement(By.xpath("//button[@type='button'][text()='Find Leads']")).click();
			Thread.sleep(2000);
			String leadId = driver.findElement(By.xpath("//a[text()='12383]")).getText();
			System.out.println(leadId);
			driver.findElement(By.xpath("//a[text()='12383']")).click();
			driver.findElement(By.xpath("//a[text()='Delete']")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			System.out.println(leadId);
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("44");
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7896656789");
			driver.findElement(By.xpath("//button[@type='button'][text()='Find Leads']")).click();
			String results = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
			
			if(results.equalsIgnoreCase("No records to display"))
			{
				System.out.println("No records to display");
			}
			else 
			{
				System.out.println("Records Present");
			}
			driver.close();
					
		}

	}

}