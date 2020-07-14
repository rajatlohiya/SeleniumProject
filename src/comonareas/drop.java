package comonareas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class drop {
	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Developer\\Documents\\Rajat\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://serviceproviders.ca-build.com/Public/Login?ReturnUrl=%2F#/");
		driver.findElement(By.id("UserName")).sendKeys("kstanley@commonareas.work.dev");
		driver.findElement(By.id("Password")).sendKeys("1234567Aa");
		driver.findElement(By.id("login_button")).click();
		
		System.out.println("Logged IN");
		
		driver.get("http://serviceproviders.ca-build.com/ClientAdmin/KitBuilder");		
		
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//div[@name='your-profile']")).click();
       
       
        
        
       


    }

}
		
		
		
		
		



