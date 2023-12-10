package Functionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
public static void main (String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"); 
        WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    driver.manage().window().maximize();
		WebElement Username  = driver.findElement(By.xpath("//input[@ type = 'email']"));
		Username.sendKeys("pranitadeshmukh29051999@gmail.com");
		Thread.sleep(5000);
		WebElement Password  = driver.findElement(By.xpath("//input[@ id = 'ap_password' ]"));
		Password.sendKeys("Pranita123@");
		Thread.sleep(5000);
		WebElement Login = driver.findElement(By.xpath("//input[@ id = 'signInSubmit' ]"));
	    Login.click();
	     WebElement Homepage = driver.findElement(By.xpath("//a[@ class = 'nav-logo-link nav-progressive-attribute']"));
	    Homepage.click();
		Thread.sleep(5000);
		WebElement Searchbar  = driver.findElement(By.xpath("//input[@id='nav-search-keywords']"));
		Searchbar.sendKeys("iphone 14 pro");
		Thread.sleep(5000);
		WebElement Searchicon  = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Searchicon.click();
		Thread.sleep(5000);
		WebElement Addtocart  = driver.findElement(By.xpath("//button[@id='a-autoid-2-announce']"));
		 Addtocart.click();
		Thread.sleep(5000);
		WebElement icon  = driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']"));
		icon.click();
		Thread.sleep(5000);
		WebElement PDP  = driver.findElement(By.xpath("//span[@class='a-truncate-cut'] [1]"));
		PDP.click();
		Thread.sleep(5000);
		WebElement Wishlist  = driver.findElement(By.xpath("//input[@id= 'add-to-wishlist-button-submit']"));
		Wishlist.click();
		Thread.sleep(5000);
	    driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}	
	

	
}
