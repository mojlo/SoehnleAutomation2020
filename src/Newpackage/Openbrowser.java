package Newpackage;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Openbrowser {


	public static void main(String[] args) {
	// TODO Auto-generated method stub


	System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\This Pc\\eclipse-workspaceSelenium\\NewSelenium\\src\\Newpackage\\driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

	// driver.get("http://www.tacvibes.com/");
	driver.get("https://shc-staging-portal.azurewebsites.de");

	// for maximize the window

	driver.manage().window().maximize();

	//for title
	System.out.println("the title of this page is " +driver.getTitle());
	}


	}


