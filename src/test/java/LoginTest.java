import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		driver = new ChromeDriver();
	}
	@Test
	public void doLogin() 
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("samit");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("122456");
		
	}
	@Test
	public void postjira()
	{
		System.out.println("Samshad");
		System.out.println("Ahmad");
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
