package Newpackage;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Logout {

   WebDriver driver;
	public static void main(String[] args)  {
	// TODO Auto-generated method stub

	AbstractionDemo abs=new AbstractionDemo();
	abs.login();
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
	
	public void logout() {
		
    
    driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
  //  driver.findElement(By.cssSelector("a.caret text-primary")).click();
   // driver.findElement(By.cssSelector("a.dropdown")).click();
  
    driver.findElement(By.linkText("Sign out")).click();
	


	}}

	



