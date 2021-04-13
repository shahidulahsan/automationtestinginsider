package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
	                  this.driver = driver;}
	
	//Element library
	@FindBy (xpath="//input[@name='First_Name']") WebElement First_Name_Field;
	@FindBy (xpath="//input[@name='Last_Name']") WebElement Last_Name_Field;
	@FindBy (xpath="//select[@id='Birthday_Day']") WebElement Birth_Day_Field;
	@FindBy (xpath="//select[@id='Birthday_Month']") WebElement Birth_Month_Field;
	@FindBy (xpath="//select[@id='Birthday_Year']") WebElement Birth_Year_Field;
	@FindBy (xpath="//input[@name='Email_Id']") WebElement Email_Field;
	@FindBy (xpath="//input[@name='Mobile_Number']") WebElement Mobile_Number_Field;
	@FindBy (xpath="//input[@value='Male']") WebElement Gender_Male_Button;
	@FindBy (xpath="//textarea[@name='Address']") WebElement Address_Field;
	@FindBy (xpath="//input[@name='City']") WebElement City_Field;
	@FindBy (xpath="//input[@name='Pin_Code']") WebElement Pin_Code_Field;
	@FindBy (xpath="//input[@name='State']") WebElement State_Field;
	@FindBy (xpath="//input[@value='Singing']") WebElement Hobby_Singing_Button;
	@FindBy (xpath="//input[@value='B.A']") WebElement Course_BA_Button;
	@FindBy (xpath="//input[@value='Submit']") WebElement Submit_Button;
	
	
	
	//Interactive method
	public void firstname(String firstName) {First_Name_Field.sendKeys((firstName)+ random(99));}
	public void lastname(String lastName) {Last_Name_Field.sendKeys(lastName);}
	public void Birth_Day_Field(String birthday) {dropDown(Birth_Day_Field, birthday);}
	public void Birth_Month_Field(String birthmonth) {dropDown(Birth_Month_Field, birthmonth);}
	public void Birth_Year_Field(String birthyear) {dropDown(Birth_Year_Field, birthyear);}
	public void Email_Field(String email) {Email_Field.sendKeys(random(9) + (email));}
	public void Mobile_Number_Field(String number) {Mobile_Number_Field.sendKeys(random(99999999) + number);}
	public void Gender_Male() {Gender_Male_Button.click();}
	public void Address_Field(String address) {Address_Field.sendKeys(address);}
	public void City_Field(String city) {City_Field.sendKeys(city);}
	public void Pin_Code_Field(String digit) {Pin_Code_Field.sendKeys(random(99999) + digit);}
	public void State_Field(String state) {State_Field.sendKeys(state);}
	public void Hobby_Singing_Button() {Hobby_Singing_Button.click();}
	public void Course_BA_Button() {Course_BA_Button.click();}
	public void Submit() {Submit_Button.click();}
	
	
	
	
	
}
