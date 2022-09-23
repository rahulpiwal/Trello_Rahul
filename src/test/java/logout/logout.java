package logout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logout {
 
WebDriver driver;

public logout(WebDriver driver)
{
	 this.driver = driver;
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //This initElements method will create all WebElements

    PageFactory.initElements(driver, this);
   


}
@FindBy(xpath="//button[@title=\"rahul piwal (rahulpiwal1)\"]")
WebElement out;

@FindBy(xpath="//span[text()=\"Log out\"]")
WebElement log_out;

public void out()
{
	out.click();
	log_out.click();
}
}


