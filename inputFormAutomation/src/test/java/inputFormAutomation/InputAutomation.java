package inputFormAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputAutomation {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Test");
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Name");
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement gender = driver.findElement(By.id("sex-0"));
		gender.click();
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement experience = driver.findElement(By.id("exp-2"));
		experience.click();
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("15/12/2022");
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement profession = driver.findElement(By.id("profession-1"));
		profession.click();
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement tool = driver.findElement(By.id("tool-2"));
		tool.click();
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Select continent = new Select(driver.findElement(By.id("continents")));
		continent.selectByVisibleText("Africa");
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement upload_file = driver.findElement(By.id("photo"));
		upload_file.sendKeys("C:\\Users\\tigerit\\Downloads\\bKash_QA_1.png");
		
		Thread.sleep(1000);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement submit_btn = driver.findElement(By.id("submit"));
		submit_btn.click();
		
		Thread.sleep(2000);
		
		System.out.println("Form Filled Up Successfully !!");
		
//		driver.close();
		driver.quit();
		
	}

}
