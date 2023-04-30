package lumaFinalProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

public class Parameters {
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void SetUp() throws InterruptedException  {

		
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(20000);
		driver.get(
				"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");

		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("demamoh98@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Dima*5870");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		

	}
}
