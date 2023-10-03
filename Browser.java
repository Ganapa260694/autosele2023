import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Browser {

	public static void main(String[] args) {
		
	ChromeDriver portal=new ChromeDriver();
	portal.manage().window().maximize();
	portal.get("http://leaftaps.com/opentaps/control/main");
	portal.findElement(By.id("username")).sendKeys("Demosalesmanager");
	portal.findElement(By.id("password")).sendKeys("crmsfa");
	portal.findElement(By.className("decorativeSubmit")).click();
	portal.findElement(By.linkText("CRM/SFA")).click();
	portal.findElement(By.linkText("Create Lead")).click();
	portal.findElement(By.id("createLeadForm_companyName")).sendKeys("Cadd studio");
	portal.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("0412345");
	portal.findElement(By.id("createLeadForm_firstName")).sendKeys("Ganapathi");
	portal.findElement(By.id("createLeadForm_lastName")).sendKeys("Gana");
		
	}

}
