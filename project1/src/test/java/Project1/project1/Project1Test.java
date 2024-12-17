package Project1.project1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Project1Test {
	WebDriver driver;
	
	@BeforeTest
	public void loading() {
		
		System.out.println("loading the browser...");
		
	}
	
	@BeforeMethod
	public void launch() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\seliniumwebdrivers/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		//driver.manage().window().maximize();
	}
	
	@Test (priority=1)
	public void login() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("test123@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("testpassword");
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
	}
	
	
  @Test (priority=2)
  public void automation() throws InterruptedException {
	  driver.get("https://testautomationpractice.blogspot.com/");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("supraja");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("987654321");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("2-11-90,xyz apartments, Chennai");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"post-body-1307673142697428135\"]/div[3]/div[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='wednesday']")).click();
	  Thread.sleep(2000);
	  Select country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		country.selectByVisibleText("India");
		 Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='green']")).click();
	 Thread.sleep(2000);
	 
	 
	 //datepickers
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("18-02-2024", Keys.ENTER);
	 Thread.sleep(2000);
	 
	 //new browser window
	 driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button")).click();
	 Thread.sleep(2000);
	 driver.switchTo().defaultContent();
	 
	 
	 //slider
	 WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 100, 50).build().perform();
		Thread.sleep(2000);
		
		
		 
		 //drag and drop
		 WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		 Actions a = new Actions(driver);
		 a.dragAndDrop(drag,drop).build().perform();
		 Thread.sleep(2000);
		 
		//resizable
		WebElement size=driver.findElement(By.xpath("//div[@id='resizable']"));
		Actions size1=new Actions(driver);
		act.dragAndDropBy(size, 147,87).build().perform();
		 

		 //alert
		   driver.findElement(By.xpath("//button[normalize-space()='Alert']")).click();
		   Alert alert=driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			
		 //alert
			driver.findElement(By.xpath("//button[normalize-space()='Confirm Box']")).click();
			 Alert confirmbox= driver.switchTo().alert();
			 confirmbox.accept();
		
		 //alert
			 driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
			 driver.switchTo().alert().sendKeys("Tom jerry");;
			 driver.switchTo().alert().accept();
			 WebElement prompt=driver.findElement(By.id("demo"));
			 System.out.println(prompt.getText());
			 
			 //frames
				driver.switchTo().frame("frame-one796456169");
				driver.findElement(By.id("RESULT_TextField-0")).sendKeys("abc");
				driver.findElement(By.xpath("//*[@id=\"q2\"]/table/tbody/tr[2]/td/label")).click();
				Select job=new Select(driver.findElement(By.id("RESULT_RadioButton-3")));
		        job.selectByVisibleText("Developer");
		        driver.findElement(By.id("FSsubmit")).click();
  }

  @AfterMethod
  public void close() {
	  driver.close();
  }
  
  @AfterTest
  public void quit() {
	  driver.quit();
  }

}

