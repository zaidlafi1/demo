package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test1 {


	static WebDriver WD;
	public static void main(String[] args) throws InterruptedException {
		
		   String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",  projectpath+"/driver/chromedriver" );
		   WD =new ChromeDriver();
	       WD.manage().window().maximize();
	         
	            WD.get("http://opensooq.com");
	            Thread.sleep(1000);
		
	}

}
