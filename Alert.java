import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node074b1n1n22qsd1hwt");
	    
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	   	   
	    org.openqa.selenium.Alert simple = driver.switchTo().alert();
	    simple.accept();
	    
	  
	    driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	    
	    org.openqa.selenium.Alert confirm = driver.switchTo().alert();
	    String text=confirm.getText();
	    System.out.println(text);
	    confirm.dismiss();
	    
	   driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	   org.openqa.selenium.Alert prompt = driver.switchTo().alert();
	   prompt.sendKeys("liberty");
	   prompt.accept(); 
	   String name=driver.findElement(By.id("confirm_result")).getText();
	   System.out.println(name);
	 
	
	}

}
