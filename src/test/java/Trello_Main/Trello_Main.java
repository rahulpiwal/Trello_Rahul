package Trello_Main;
import Board.*;
import logout.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DashBoard.DashBoard;
import Login.*;

public class Trello_Main {
public	WebDriver driver;
	Login log_in;
	DashBoard dashboard;
	Board board;
	logout logout;
	String Email="rpiwal38@gmail.com";
	String Pass="R@080singh";
	  
	  @BeforeTest
	  public void Setup()
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
	  }
	  @Test(priority=0)
	  public void login()
	  {
		  driver.get("https://trello.com/login");
		  log_in=new Login(driver);
		  log_in.Enter();
		  log_in.Email(Email);
		  log_in.pass(Pass);
		
		  log_in.Login_Check();
        
		  driver=log_in.pageUrl();
		  driver.getCurrentUrl();
	  }
	  @Test(priority=1)
	  public void desh()
	  {

		  dashboard=new DashBoard(driver);
		  dashboard.create_click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		  dashboard.create_board();
		  dashboard.board_title();
		  driver=dashboard.Url();
	 System.out.println(driver.getCurrentUrl());
	  }
	  @Test(priority=2)
	  public void Board()
	  {
		 board=new Board(driver);
		 board.list_add();
		
		 board.card();
		 board.move_Ele();
			System.out.println(driver.getCurrentUrl());
	  }
	  @AfterTest
	  public void logout()
	  {
		logout =new logout(driver);
		logout.out();
		 
	  }
		 
	  }
