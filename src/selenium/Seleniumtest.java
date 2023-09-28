package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Seleniumtest {
    @Test
	public void amazon_app()throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/mukil/Downloads/chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		d.get("https://www.amazon.com/");
		d.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span")).click();
		d.findElement(By.id("ap_email")).sendKeys("mukilsneha12@gmail.com");
		d.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		d.findElement(By.id("ap_password")).sendKeys("Mukil12@amazon");
		d.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		String url=d.getCurrentUrl();
		if(url.equals("https://www.amazon.com/?ref_=nav_custrec_signin"))
		{
			System.out.println("Signed in");
		}
		else
		{
			System.out.println("Not signed in");
		}
		Thread.sleep(3000);
		
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("kurti for women");
		d.findElement(By.id("nav-search-submit-button")).click();
		String u=d.getCurrentUrl();
		if(u.equals("https://www.amazon.in/s?k=kurti+for+women&crid=KVAUXNWG4XQU&sprefix=kurti+for+women%2Caps%2C242&ref=nb_sb_noss_1"))
		{
		    System.out.println("Webpage displayed");	
		}
		
		
        Thread.sleep(2000);
		
        JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div[1]/span/a")).click();
		
		String s=d.getCurrentUrl();
		if(s.equals("https://www.amazon.com/Cotton-Printed-Anarkali-Kurtis-Women/dp/B07RG7MP2V/ref=sr_1_6?crid=2ZBG1FRL4M6XH&keywords=kurti+for+women&qid=1695738662&sprefix=kurti+for+women%2Caps%2C306&sr=8-6"))
		{
			System.out.println("product displayed");
		}
		
		d.close();

	}
    
	
}
