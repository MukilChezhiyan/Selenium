package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class naukri {
  @Test
  public void naukri_app ()throws InterruptedException{
	  System.setProperty("webdriver.chrome.driver","C:/Users/mukil/Downloads/chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.naukri.com/");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.findElement(By.id("login_Layer")).click();
	    WebElement email_Input = d.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input"));
		WebElement passwordInput = d.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input"));
		email_Input.sendKeys("mukilchezhiyan@gmail.com");
        passwordInput.sendKeys("Mukil@12naukri");

        WebElement loginButton = d.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
		/*String url=d.getCurrentUrl();
		if(url.equals("https://www.naukri.com/mnjuser/homepage"))
		{
			System.out.println("Signed in");
		}
		else
		{
			System.out.println("Not signed in");
		}*/
		Thread.sleep(3000);
		
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/span")).click();
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[1]/div/div/div/input")).sendKeys("software testing");
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[3]/div/div/span")).click();
		d.findElement(By.xpath("//*[@id=\"sa-dd-scrollexperienceDD\"]/div[1]/ul/li[1]")).click();
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/div/div[5]/div/div/div/input")).sendKeys("Chennai");
		d.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div/button/span[1]")).click();
		String u=d.getCurrentUrl();
		if(u.equals("https://www.naukri.com/software-testing-jobs-in-chennai?k=software%20testing&l=chennai&experience=0&nignbevent_src=jobsearchDeskGNB"))
		{
		    System.out.println("Webpage displayed");	
		}
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/label/i")).click();
		d.findElement(By.xpath("//*[@id=\"search-result-container\"]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/div[4]/label/i")).click();
		d.findElement(By.xpath("//*[@id=\"listContainer\"]/div[2]/div/div[2]/div")).click();
		String s=d.getCurrentUrl();
		if(s.equals("https://www.naukri.com/job-listings-openings-for-quality-assurance-engineer-istarbs-client-chennai-i-star-business-solutions-chennai-tamil-nadu-0-to-1-years-300623006027?src=jobsearchDesk&sid=16957250214105153&xp=2&px=1&nignbevent_src=jobsearchDeskGNB"))
		{
			System.out.println("job page opened");
		}
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)d;
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0,-600)");
      d.findElement(By.xpath("//*[@id=\"job_header\"]/div[2]/div[2]/button[1]")).click();
      d.close();
  }
}
