package lumaFinalProject;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases extends Parameters {
//	@Test(priority = 1)
//	public void signUpFirstTestCase() throws InterruptedException {
	// to navigate to the sign up page
//		driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
//		WebElement firstName = driver.findElement(By.id("firstname"));
//		firstName.sendKeys("dima");
//		WebElement lastName = driver.findElement(By.id("lastname"));
//		lastName.sendKeys("mohammed");
//		WebElement email = driver.findElement(By.id("email_address"));
//		email.sendKeys("dema_moh98@yahoo.com");
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("Dima*5870");
//		WebElement confirmPassword = driver.findElement(By.id("password-confirmation"));
//		confirmPassword.sendKeys("Dima*5870");
//		WebElement creatAccount = driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button"));
//		creatAccount.click();

//		driver.get(
//				"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
//
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("demamoh98@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Dima*5870");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//		Thread.sleep(3000);
//
//		// Assertion
//		String welcomeMsg = driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[1]/span")).getText();
//
//		System.out.println(welcomeMsg);
//		boolean checkTheWordWelcome = welcomeMsg.contains("Welcome");
//
//		SoftAssert myAssertion = new SoftAssert();
//
//		myAssertion.assertEquals(checkTheWordWelcome, false);
//
//		myAssertion.assertAll();
//
//	}

//	@Test(priority = 2)
//	public void selectItemRandomlyAndPrintIt() {
//
//		driver.get(
//				"https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
//
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("asaqa0011@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("AlphaAlpha123");
//		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
//
//		driver.get("https://magento.softwaretestingboard.com/");
//
//		String items[] = { "Jacket", "t-shirt", "jeans for men", "jeans for women", "pants" };
//		Random myRandom = new Random();
//		int randItems = myRandom.nextInt(0, items.length);
//		System.out.println();
//
//		WebElement searchBar = driver.findElement(By.xpath("//*[@id=\"search\"]"));
//		searchBar.sendKeys(items[randItems]);
//		searchBar.sendKeys(Keys.ARROW_DOWN.ENTER);
//		System.out.println(items[randItems] + "*********************");
//		
//		// Assertion
//		String SentText = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/h1/span")).getText();
//
//		System.out.println(SentText);
//		boolean containsValue = SentText.contains(items[randItems]);
//
//		SoftAssert myassserttion1 = new SoftAssert();
//
//		myassserttion1.assertEquals(containsValue, false);
//
//		myassserttion1.assertAll();
//}

//	@Test(priority = 3)
//	public void addingItemsToTheCart() throws InterruptedException {
//
//		driver.get("https://magento.softwaretestingboard.com/");
//		Random rand = new Random();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		// scroll down to the items
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1850)", "to scroll down to the items");
//
//		WebElement ItemContainer = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[3]"));
//
//		List<WebElement> items = ItemContainer.findElements(By.className("product-item-link"));
//		Thread.sleep(5000);
//
//		String[] URls = { "https://magento.softwaretestingboard.com/radiant-tee.html",
//				"https://magento.softwaretestingboard.com/breathe-easy-tank.html",
//				"https://magento.softwaretestingboard.com/argus-all-weather-tank.html",
//				"https://magento.softwaretestingboard.com/hero-hoodie.html",
//				"https://magento.softwaretestingboard.com/fusion-backpack.html" };
//
//		for (int i = 0; i < 5; i++) {
//			driver.get(URls[i]);
//
//			if (driver.getCurrentUrl().contains("radiant")) {
//
//				WebElement colorDiv = driver
//						.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]"));
//				String[] colorsssLabels = { "option-label-color-93-item-50", "option-label-color-93-item-56",
//						"option-label-color-93-item-57" };
//				int RandomColor = rand.nextInt(0, 3);
//				List<WebElement> Sizes = driver.findElements(By.className("swatch-option"));
//				int RandomSize = rand.nextInt(0, 5);
//				Sizes.get(RandomSize).click();
//				Thread.sleep(3000);
//
//				List<WebElement> colorsssss = colorDiv.findElements(By.tagName("div"));
//				colorsssss.get(RandomColor).click();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("3");
//
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//			} else if (driver.getCurrentUrl().contains("breathe")) {
//				
//				int[] myRandomQ = {0,1,2,3,4,5,9,10,90,100,70};
//				
//				int index = rand.nextInt(0, 11); 
//				
//
//				WebElement colorLength2 = driver.findElement(
//						By.xpath("/html/body/div[1]/main/div[2]/div/div[1]/div[4]/form/div[1]/div/div/div[2]/div"));
//				List<WebElement> colorIndex2 = colorLength2.findElements(By.tagName("div"));
//
//				Thread.sleep(5000);
//				List<WebElement> Sizes = driver.findElements(By.className("swatch-option"));
//				int RandomSize = rand.nextInt(0, 5);
//				Sizes.get(RandomSize).click();
//				Thread.sleep(5000);
//				int RandomColor = rand.nextInt(0, 3);
//				colorIndex2.get(RandomColor).click();
//				Thread.sleep(3000); 
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("4");
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//			} else if (driver.getCurrentUrl().contains("argus")) {
//				Thread.sleep(5000);
//				List<WebElement> Sizes = driver.findElements(By.className("swatch-option"));
//				int RandomSize = rand.nextInt(0, 5);
//				Sizes.get(RandomSize).click();
//				List<WebElement> ColorsTank = driver.findElements(By.className("color"));
//				Thread.sleep(5000);
//
//				int RandomColorForTankProduct = rand.nextInt(0, 1);
//				Thread.sleep(5000);
//				driver.findElement(By.id("option-label-color-93-item-52")).click();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("4");
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//			} else if (driver.getCurrentUrl().contains("hoodie")) {
//				
//				WebElement colorsDiv = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
//						List<WebElement> Colorssss = colorsDiv.findElements(By.tagName("div")); 
//				
//				
//				Thread.sleep(5000);
//				List<WebElement> Sizes = driver.findElements(By.className("swatch-option"));
//				int RandomSize = rand.nextInt(0, 5);
//				Sizes.get(RandomSize).click();
//				List<WebElement> ColorsTank = driver.findElements(By.className("color"));
//				Thread.sleep(5000);
//
//				int RandomColorForTankProduct = rand.nextInt(0, 3);
//				
//				Colorssss.get(RandomColorForTankProduct).click(); 
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("1");
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//
//			} else if (driver.getCurrentUrl().contains("fusion")) {
//
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
//				driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("5");
//				driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
//				Thread.sleep(5000);
//			}
//		}
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div[1]/a")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"top-cart-btn-checkout\"]")).click();
//
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]")).click();
//
//		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
//
//		Thread.sleep(5000);
//		String FinalPriceAtWebSite = driver
//				.findElement(By.xpath("//*[@id=\"opc-sidebar\"]/div[1]/table/tbody/tr[4]/td/strong/span")).getText();
//		System.out.println(FinalPriceAtWebSite);
//		String updatedFinalPriceAtWebSite = FinalPriceAtWebSite.replace("$", "");
//		double priceAsDouble = Double.parseDouble(updatedFinalPriceAtWebSite);
//		System.out.println(priceAsDouble);
//		
//		SoftAssert myasssert = new SoftAssert();
//		myasssert.assertEquals(priceAsDouble, 266.3, "this is to test the price");
//		myasssert.assertAll(); 
//	}

//	@Test(invocationCount = 5, priority = 4)
//	public void reorderItems() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//		driver.get("https://magento.softwaretestingboard.com/sales/order/history/");
//		driver.findElement(By.xpath("//*[@id=\"my-orders-table\"]/tbody/tr[1]/td[6]/a[2]/span")).click();
//		Thread.sleep(7000);
//
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"checkout-shipping-method-load\"]/table/tbody/tr[1]/td[1]/input"))
//				.click();
//		Thread.sleep(3000);
//
//		driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button")).click();
//
//		Thread.sleep(5000);
//		driver.findElement(
//				By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span"))
//				.click();
//
//	}
}
