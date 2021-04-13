package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public static void dropDown(WebElement locator, String option) {
		Select sel = new Select(locator); 
		sel.selectByVisibleText(option);}
	
	public int random(int digit) {
		Random rnd = new Random();
		return (rnd.nextInt(digit)); 
		

	}
	
	
	
	
	
	

}
