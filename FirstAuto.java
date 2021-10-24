package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAuto {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
		
		System.out.println("Lauched the browser");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[contains(@class,'btn btn-default')])[2]")).click();

		String english = driver.findElement(By.xpath("//div[@class='ng-binding ng-scope']")).getText();

		System.out.println(english);

		String dutch = driver.findElement(By.xpath("(//div[@class='ng-binding ng-scope'])[2]")).getText();

		System.out.println(dutch);


		if(english.contains("English")){

			System.out.println("English found in the dropdown");
		}

		if(dutch.contains("Dutch")){

			System.out.println("Dutch found in the dropdown");

		}

		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Tanu Singh");
		
		driver.findElement(By.xpath("//input[@id='orgName']")).sendKeys("Amazon");
		
		driver.findElement(By.id("singUpEmail")).sendKeys("tanuicap@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='I agree to the']")).click();
		
		driver.findElement(By.tagName("button")).click();
		
		System.out.println("Get Started button has been clicked");
		
		Thread.sleep(5000);
		
		String aWelcomeEmail = driver.findElement(By.xpath("//span[text()=' A welcome email has been sent. Please check your email. ']")).getText();
		
	
		
		if(aWelcomeEmail.contains("welcome email")){
			
			System.out.println("Mail has been received successfully! Thank you!");
		
		}
		else {
			
			System.out.println("No mail has been received :(, please try again");
		}
		
		
		System.out.println("Run successful");
		
		driver.close();
	}

	private static WebElement ByXPath(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
