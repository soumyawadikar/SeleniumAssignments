package Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/popup.php");
		driver.findElement(By.xpath("//a[text()=\"Click Here\"]")).click();
	
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement ele=driver.findElement(By.xpath("//input[@name='emailid']"));
		ele.sendKeys("Soumyajahagirdar1995@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		

	}

}
