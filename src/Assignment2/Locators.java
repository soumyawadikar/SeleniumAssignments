package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.id("vfb-7-1")).click();
		Thread.sleep(40);
		
		driver.findElement(By.id("vfb-7-2")).click();
		Thread.sleep(40);
		driver.findElement(By.id("vfb-7-3")).click();
		Thread.sleep(40);
		driver.close();
	}

}
