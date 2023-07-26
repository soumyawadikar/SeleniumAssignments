package automationassignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {


		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\excel\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			//driver.quit();
			
			WebElement ele=driver.findElement(By.xpath("//a[@id=\'nav-logo-sprites\']"));
			
			if(ele.isDisplayed()) {
				System.out.println("home page is verified");
			
			}
			else {
				System.out.println("home page is not verified");
			}
			
			
		}

	}

