package Newpackage;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	public class AddNotification {

   WebDriver driver;
	public static void main(String[] args)  {
	// TODO Auto-generated method stub

		AddNotification abs=new AddNotification();
	abs.login();
	abs.addnotification();
	}
	public void login() {


	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\This Pc\\eclipse-workspaceSelenium\\NewSelenium\\src\\Newpackage\\driver\\chromedriver.exe");
     driver= new ChromeDriver();

	// driver.get("http://www.tacvibes.com/");
	driver.get("https://shc-staging-portal.azurewebsites.de");
	driver.manage().window().maximize();
	// for maximize the window
	//by using id
    driver.findElement(By.id("Email")).sendKeys("Neerajsingh151+11@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Neeraj12345");
	//driver.findElement(By.className("btn btn-primary btn-raised btn-block")).click();
	//driver.findElement(By.id("Login")).click();

	//by using xpath
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	}
	
	public void addnotification() {
		
	//	 driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
		 Select dropdown= new Select (driver.findElement(By.className("dropdown-toggle"))); 
	     dropdown.selectByVisibleText("Notification Tile"); 
	//  driver.findElement(By.linkText("Profile")).click();
	//	 driver.findElement(By.linkText("Notification Tile")).click();
		 
		// driver.findElement(By.cssSelector("input#Name")).sendKeys("singh"); 
	//	 driver.findElement(By.cssSelector("a#btnUpdate")).click();
		// driver.findElement(By.cssSelector("input#GenderWoman")).click();
		// driver.findElement(By.cssSelector("span.circle")).click();
		
		 
   
  //  driver.findElement(By.cssSelector("a.caret text-primary")).click();
   // driver.findElement(By.cssSelector("a.dropdown")).click();
  
    
	


	}}

	

