package webtesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MoviePlexTest {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Kevin\\OneDrive\\3. Semester\\stqm\\Uebungen\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();


		String baseUrl = "http://localhost:8080/movieplex7/";
        
        driver.get(baseUrl);

        driver.findElement(By.linkText("Book a movie")).click();
        
        driver.findElement(By.id("j_idt31:0")).click();
        driver.findElement(By.id("shows")).click();
        driver.findElement(By.id("j_idt30:j_idt31:0")).click();
        driver.findElement(By.name("j_idt30:j_idt37")).click();
        driver.findElement(By.id("j_idt30:next")).click();
        
        
        
        
        
//        driver.quit();
	}
	
	
}
