package Assignment2;




import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable{

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
         driver.findElement(By.linkText("Draggable")).click();
      
         WebElement drag=driver.findElement(By.xpath(" //iframe[@class=\"demo-frame\"]"));
         driver.switchTo().frame(drag);
         WebElement ele=driver.findElement(By.id("draggable"));
         Actions action=new Actions(driver);
         action.dragAndDropBy(ele, 145, 50).build().perform();
         
         TakesScreenshot ts=((TakesScreenshot)driver);
         File srcFile=ts.getScreenshotAs(OutputType.FILE);
 
         FileUtils.copyFile(srcFile,new File(".//screenshot/screen.png"));
         
         
         
		
	}

}
