package Login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login {
  
WebDriver driver;
String Email=null;
String pass=null;
WebDriverWait wait;
Actions act;
Action act1;



  

 public Login(WebDriver driver)
 {
	 this.driver = driver;

     //This initElements method will create all WebElements

     PageFactory.initElements(driver, this);
act =new Actions(driver);


     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 }
 @FindBy(xpath="//span[contains(text(), \"Continue with Google\")]")
 WebElement Login_ele;
 
 @FindBy(xpath="//*[@type=\"email\"]")
 WebElement Email_ele;
 
 @FindBy(xpath="//span[(text()=\"Next\")]")
 WebElement Button; 
 
 @FindBy(xpath="//button//span[text()=\"Next\"]")
 WebElement Button1;
 
 @FindBy(name="password") 
 WebElement Password;
 
 @FindBy(xpath="//*[@type=\"submit\"]")
 WebElement submit;
 
 public void Enter()
 {
	 Login_ele.click();
 }
 
 public void Email(String Email)
 {
	 this.Email=Email;
 }

 public void pass(String pass)
 {
	 this.pass=pass;
 }
 public void Pass_Value(String Email, String pass)
 {
	
	 Email_ele.sendKeys(Email);
	Button.click();
	Password.click();
	 
	Password.sendKeys(pass, Keys.ENTER);
	

	
	
 

	
	 
 }
 
 public void Login_Check()
 {
 this.Pass_Value(Email,pass);

 }
 
 public WebDriver pageUrl()
 {
	  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	 return this.driver;
 }

	
}
