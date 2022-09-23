package DashBoard;
import Login.*;
import Trello_Main.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DashBoard {
  WebDriver driver;
  Actions act;
  Action act1;
  
  public DashBoard(WebDriver driver)
  {
 	 this.driver = driver;
 	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      //This initElements method will create all WebElements

      PageFactory.initElements(driver, this);
 act=new Actions(driver);

  }
  @FindBy(xpath="//button[@aria-label=\"Create board or Workspace\"]")    
  WebElement create;
  
  @FindBy(xpath="//*[text()=\"Create board\"]")
  WebElement create_board;
  
  @FindBy(xpath="//input[@type=\"text\"]")
  WebElement Board_title;
  
  public void create_click()
  {
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		  System.out.println(driver.getCurrentUrl());
	  create.click();
  }
  
  public void create_board()
  {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  System.out.println(driver.getCurrentUrl());
	  create_board.click();
  }
  public void board_title()
  {
	  Board_title.sendKeys("Rahul_board", Keys.TAB ,Keys.TAB, Keys.TAB, Keys.ENTER);
	
}
  public WebDriver Url()
  {
	  return this.driver;
  }
  }
