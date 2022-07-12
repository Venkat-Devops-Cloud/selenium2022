package maventestng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * @author Venkat Jakkepalli
 *
 */
public class multibrowser {

	public WebDriver driver;

  @Parameters("browser")

  @BeforeClass

  // Passing Browser parameter from TestNG xml

  public void beforeTest(String browser) {

  // If the browser is Firefox, then do this

  if(browser.equalsIgnoreCase("edge")) {
	 
//Initializing the edge driver
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\Venkat Jakkepalli\\Downloads\\Drivers\\msedgedriver.exe");
	  driver = new EdgeDriver();	  

  }else if (browser.equalsIgnoreCase("chrome")) { 

	  //Initialize the chrome driver
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat Jakkepalli\\Downloads\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();

  } 

  // Enter the website address in the browser

  driver.get("https://www.guru99.com/test-case-priority-testng.html"); 

  }

  // Once Before method is completed, Test method will start

  @Test public void login() throws InterruptedException {

	//driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  System.out.println(driver.getTitle());

	}  

  @AfterClass public void afterTest() {

		driver.quit();

	}

}
