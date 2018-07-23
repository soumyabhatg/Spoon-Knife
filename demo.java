package sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class demo {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","/home/avohi/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://google.com"); 
	
	List <WebElement> buttons = driver.findElements(By.xpath("//input[@type='submit']"));
	
	//WebElement actualButtonCaption = driver.findElement(By.xpath("//input[@type='a href']"));
	//	actualButtonCaption.getText();
	
		
	for (int i = 1; i<buttons.size(); i=i+1)
 
		{
 
		System.out.println(buttons.get(i).getText());
		
		}
	System.out.println("NUMBER OF BUTTONS="+buttons.size());
		System.out.println("************************");
		System.out.println("---------------------");
		System.out.println(" build triggers ");
	}
}
