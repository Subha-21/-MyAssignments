package w2d1assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultipleOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		
		Select dd = new Select(element);
		
		List<WebElement> options = dd.getOptions();
		
		int size = options.size();
		System.out.println(size);
				
		for(int i = 0; i < options.size(); i++) {
			
			
			
			Thread.sleep(2000);
			
			if(i==1 || i == 3) {
				options.get(i).click();
			}
			
			driver.quit();	
			
		}	
		
		
			
		}
			

	}


