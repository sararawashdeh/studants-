import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
WebDriver driver ; 
		
	   WebDriverManager.edgedriver().setup();

	    driver = new EdgeDriver();

		driver.get("http://127.0.0.1:5501/index.html");
		List <WebElement> myStudents = driver.findElements(By.tagName("option"));
//		for(int i =0 ; i < myStudents.size(); i++) {       
//			if ( i % 2==0) {
//				
//				
//				System.err.println( myStudents.get(i).getText() );
//				
//				driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
			
			
//			if ( i % 2!=0) {                           
//				
//				myStudents.get(i).click()
//			
//				
//				driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
			
			
			for(int i =3;i < myStudents.size(); i=i+4) {        
				
					
					
					myStudents.get(i).click();
				
					
					driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
				}
				
				
				
			
	
			
			
			
				
				
	
			
			
			
		}
	
		
		
		
		
		
		
		
		
		
	}

}
