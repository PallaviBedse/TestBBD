package stepDefinition;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestStepDefinition {

	
	public static WebDriver browser;
@Given("user should be on Myntra page")
public void user_should_be_on_myntra_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bedse\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	browser=new ChromeDriver();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	browser.manage().window().maximize();
	browser.get("https://www.myntra.com/");
}


@When("user click on woman tag")
public void user_click_on_woman_tag() throws InterruptedException {
	WebElement Women = browser.findElement(By.xpath("(//a[text()='Women'])[1]"));
    Actions actions = new Actions(browser);
    actions.moveToElement(Women);
    Thread.sleep(2000);
    
}

@When("user click on tops tag")
public void user_click_on_tops_tag() throws InterruptedException {
	 WebElement Tops = browser.findElement(By.xpath("//a[text()='Tops']"));
	 Actions actions = new Actions(browser);
     actions.moveToElement(Tops);
     actions.click().build().perform();
     Thread.sleep(2000);
}

@When("user sort by popularity")
public void user_sort_by_popularity() throws InterruptedException {
	 WebElement sortBy = browser.findElement(By.xpath("//div[@class='sort-sortBy']"));
     Actions actions2 = new Actions(browser);
     actions2.moveToElement(sortBy).build().perform();
     
     WebElement Popularity = browser.findElement(By.xpath("(//*[@class='sort-label '])[2]"));
     actions2.click(Popularity).build().perform();
     //actions2.click();
     Thread.sleep(5000);
    
}

@When("user select discount")
public void user_select_discount() {
	//scroll
    JavascriptExecutor js=(JavascriptExecutor) browser;
	js.executeScript("window.scrollBy(0,10)");
	 WebElement E2 = (browser.findElement(By.xpath("//label[text()='40% and above']")));
	 E2.click();
	   
}

@When("user select Brand")
public void user_select_brand() {
	 WebElement E = (browser.findElement(By.xpath("//label[text()='Roadster']")));
	 E.click();
	 	
}

@When("user select price range")
public void user_select_price_range() {
	WebElement E1 = (browser.findElement(By.xpath("//label[text()='Rs. 624 to Rs. 1049']")));
    E1.click();
}

@When("user click on tops")
public void user_click_on_tops() throws InterruptedException {
	// select product
	browser.findElement(By.xpath("//ul[@class='results-base']//li[1]")).click();
			 
			 Set<String> Windeow = browser.getWindowHandles();
			for (String string : Windeow) {
				browser.switchTo().window(string);
			}
			Thread.sleep(5000);
}

@When("user Add the cart")
public void user_add_the_cart() {
	 //add to bag
	browser.findElement(By.cssSelector(".pdp-add-to-bag.pdp-button.pdp-flex.pdp-center")).click();
	
}

@When("user Go to bag")
public void user_go_to_bag() throws InterruptedException {
	//go to bag
	browser.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
	  Thread.sleep(2000);
}

@When("user view the cart")
public void user_view_the_cart() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@Then("user verifies the Product in wishlist")
public void user_verifies_the_product_in_wishlist()  {
	 //move to wishlist
	browser.findElement(By.xpath("//button[text()='MOVE TO WISHLIST']")).click();
}


}
