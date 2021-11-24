import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.setProperty("WebDriver.ChromeDriver", "C:\\Users\\Sangeetha\\eclipse-workspace\\SeleniumDemo1\\src\\Driver\\chromedriver.exe");
		driver.get("https://www.google.com");
//		String title = driver.getTitle();
//		System.out.println("Title of the page is",title);
	//	System.out.println(driver.getCurrentUrl());
		
		
	}

}
