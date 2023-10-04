import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpath {

	public static void main(String[] args) {
		ChromeDriver portal=new ChromeDriver();
		portal.manage().window().maximize();
		portal.get("http://leaftaps.com/opentaps");
		portal.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		portal.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		portal.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		portal.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		portal.findElement(By.xpath("//a[text()='Leads']")).click();
	}

}
