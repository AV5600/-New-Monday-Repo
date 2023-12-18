package workflowmavenoffice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workflowmavenoffice {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Latitude Touch\\eclipse-workspace\\Jar Files\\Chrome Driver\\chromedriver\\chromedriver.exe");
        
        System.setProperty("webdriver.firefox.marioette", "C:\\Users\\Latitude Touch\\eclipse-workspace\\Jar Files\\Firefox Driver\\geckodriver.exe");
        
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Latitude Touch\\eclipse-workspace\\Jar Files\\Edge Driver\\msedgedriver.exe");
        
        ChromeDriver driver = new ChromeDriver();
        
        FirefoxDriver driver1 = new FirefoxDriver();
        
        EdgeDriver driver2 = new EdgeDriver();
        
        driver.get("https://www.eclipse.org/downloads/");
        
        driver1.get("https://www.eclipse.org/downloads/");
        				
		driver2.get("https://www.eclipse.org/downloads/");
		
	}

}
