package Board;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Board {
	WebDriver driver;
	Actions act;
	Action act1;
	int  x_axis;
	int y_axis;
	
	  public Board(WebDriver driver)
	  {
	 	 this.driver = driver;
	 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      //This initElements method will create all WebElements

	      PageFactory.initElements(driver, this);
	      act=new Actions(driver);
	

	  }
	  @FindBy(css="input[name=name]")
	  WebElement list;
	  
	  @FindBy(xpath="//*[@class=\"placeholder\" and text()=\"Add another list\"]")
	  WebElement list1;
	  
	  @FindBy(xpath="//*[text()=  \"Add a card\"]")
	  WebElement B_card;
	  
	  @FindBy(xpath="//div[2]/div/div[3]/a//span[1]//following-sibling::span")
	  WebElement A_card;
	  
	  @FindBy(css=".list-card-title")
	  WebElement A_item;
	  
	  
	  
	  public void list_add()
	  {
		 
	
			 list.sendKeys("B",Keys.TAB,Keys.ENTER);
		 list.sendKeys("A",Keys.TAB,Keys.ENTER);
		 list.sendKeys(Keys.ESCAPE);
		 
	  }
	  
	  public void card()
	  {
		  
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  act1=act.moveToElement(A_card).click().sendKeys("rahul").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build();
		  act1.perform();
	  }
	  
	  public void move_Ele()
	  {
		  driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  Point point = B_card.getLocation();
		  x_axis=point.getX();
		  y_axis=point.getY();
		  
		  System.out.println("X AXIS OF ELEMENT"+ x_axis);
		  System.out.println("Y AXIS OF ELEMENT"+ y_axis);
		  
		  act1=act.dragAndDrop(A_item, B_card).build();
		  act1.perform();
	  }
	  
	 
	  
	

}
