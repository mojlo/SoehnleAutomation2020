package Newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Login {


	public static void main(String[] args) {
	// TODO Auto-generated method stub


	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\This Pc\\eclipse-workspaceSelenium\\NewSelenium\\src\\Newpackage\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	// driver.get("http://www.tacvibes.com/");
	driver.get("https://shc-staging-portal.azurewebsites.de");

	// for maximize the window
	//by using id
	
driver.findElement(By.id("Email")).sendKeys("Neerajsingh151+11@gmail.com");
driver.findElement(By.id("Password")).sendKeys("Neeraj12345");
//driver.findElement(By.className("btn btn-primary btn-raised btn-block")).click();
//driver.findElement(By.id("Login")).click();

//by using xpath
driver.findElement(By.xpath("//button[@type='submit']")).click();


	driver.manage().window().maximize();

	//for title
	System.out.println("the title of this page is " +driver.getTitle());
	}
	

	}




