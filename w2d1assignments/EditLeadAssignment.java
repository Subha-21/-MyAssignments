package w2d1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadAssignment {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Google");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvam");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Suganya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestAutomation");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Suganya Test Automation");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("suganselvam@gmail.com");	
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("New Info");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle());
	
		
	}

	
}
