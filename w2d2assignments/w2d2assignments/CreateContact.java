package w2d2assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();	
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Democsr");  
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");   
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click(); 
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Suganya");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Selvam");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Sugan");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("Barath");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("EEE");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("magizh@gmail.com");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select dd= new Select(element);
		 dd.selectByValue("NY");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Learn Selenium");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		System.out.println(driver.getTitle());
		
		
	}

}
