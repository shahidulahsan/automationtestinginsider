package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.RegistrationPage;
import util.BrowserFactory;

public class RegistrationTest {
	
	WebDriver driver;
	
	@Test
	public void fillupRegistration() {
		
		driver = BrowserFactory.init();
		
		RegistrationPage reg = PageFactory.initElements(driver, RegistrationPage.class);
		
		reg.firstname("Hello");
		reg.lastname("World");
		reg.Birth_Day_Field("14");
		reg.Birth_Month_Field("Feb");
		reg.Birth_Year_Field("1995");
		reg.Email_Field("abc@tec.com");
		reg.Mobile_Number_Field("22");
		reg.Gender_Male();
		reg.Address_Field("233 ABDS");
		reg.City_Field("Colleyville");
		reg.Pin_Code_Field("3");
		reg.State_Field("Texas");
		reg.Hobby_Singing_Button();
		reg.Course_BA_Button();
		reg.Submit();
	
		
	}

}
