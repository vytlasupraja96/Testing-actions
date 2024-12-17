package Project1.project1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class project1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\seliniumwebdrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("loading the browser...");
		driver.get("https://testautomationpractice.blogspot.com/");
	
	  driver.findElement(By.xpath("//input[@id='name']")).sendKeys("supraja");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("987654321");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("2-11-90,xyz apartments,chennai");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//input[@id='wednesday']")).click();
	  Thread.sleep(2000);
	  Select country=new Select(driver.findElement(By.xpath("//select[@id='country']")));
		country.selectByVisibleText("India");
		 Thread.sleep(2000);
	driver.findElement(By.xpath("//option[@value='green']")).click();
	 Thread.sleep(2000);
	 
	 //searchbox
	 driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("testing");
	 driver.findElement(By.xpath("//input[@type='submit']")).click();
	
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
		 
		 //doubleclick
		 WebElement ele=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		 Actions actions=new Actions(driver);
		 actions.doubleClick(ele).build().perform();
		 
		 //drag and drop
		 WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		 Actions a = new Actions(driver);
		 a.dragAndDrop(drag,drop).build().perform();
		 
		 //slider
		 
	    WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slider, 100, 50).build().perform();
	 
	 //frames
		driver.switchTo().frame("frame-one796456169");
		driver.findElement(By.id("RESULT_TextField-0")).sendKeys("abc");
		//driver.findElement(By.linkText("Male")).click();
		Select job=new Select(driver.findElement(By.id("RESULT_RadioButton-3")));
        job.selectByVisibleText("Developer");
        driver.findElement(By.id("FSsubmit")).click();
	 
        //datepickers
       // driver.findElement(By.xpath("//input[@class='hasDatepicker']")).sendKeys("18-02-2024",Keys.ENTER);
        
		//resizable
		// WebElement size=driver.findElement(By.xpath("//div[@id='q0']"));
		 //Actions size1=new Actions(driver);
		 //act.dragAndDropBy(drag, 89, 129).build().perform();
        
        //new window browser
        driver.findElement(By.linkText("New Browser Window")).click();
	  
  

	}

}
