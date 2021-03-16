package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SingUp {
	
	
 @Test
		public void t_01_validate_singup_zero_app() throws InterruptedException {
	 
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

			//URL
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://www.phptravels.net/login");
					Thread.sleep(2000);
					
				
			//Sign Up
					
					WebElement SignUp1 = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) form:nth-child(1) div.wow.zoomInDown.animated.row:nth-child(6) div.col-md-12:nth-child(1) > a.btn.btn-success.br25.btn-block.form-group"));
					SignUp1.click();
					Thread.sleep(2000);
					WebElement FirstName = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) div.row:nth-child(3) div.col-md-6:nth-child(1) div.form-group label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
					FirstName.sendKeys("Dwayne");
					Thread.sleep(500);
					WebElement LastName = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) div.row:nth-child(3) div.col-md-6:nth-child(2) div.form-group label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
					LastName.sendKeys("Johnson");
					Thread.sleep(500);
					WebElement CellNumber = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) div:nth-child(1) form:nth-child(1) div.form-group:nth-child(4) label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
					CellNumber.sendKeys("9153444562");
					Thread.sleep(500);
			
			//Email		
					
					WebElement Email = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) div:nth-child(1) form:nth-child(1) div.form-group:nth-child(5) label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
			
					
			//Change number symbol in Email "tech1@mailpoof.com" to any other numbers (110,112,113,114,115.ect)
					
					Email.sendKeys("tech150@mailpoof.com"); 
					
					
					Thread.sleep(500);
					WebElement Password1 = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) div:nth-child(1) form:nth-child(1) div.form-group:nth-child(6) label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
					Password1.sendKeys("Qwerty123");
					Thread.sleep(500);
					WebElement ConfPassword1 = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) div:nth-child(1) form:nth-child(1) div.form-group:nth-child(7) label.pure-material-textfield-outlined.float-none > input:nth-child(1)"));
					ConfPassword1.sendKeys("Qwerty123");
					Thread.sleep(2000);
					WebElement SignUp2 = driver.findElement(By.cssSelector("body.with-waypoint-sticky:nth-child(2) div.body-inner:nth-child(6) div.main-wrapper.scrollspy-action:nth-child(2) div.container div.row div.col-md-6.bg-white-shadow.pt-25.ph-30.pb-40:nth-child(2) div:nth-child(1) form:nth-child(1) div.form-group:nth-child(8) > button.signupbtn.btn_full.btn.btn-success.btn-block.btn-lg"));
					SignUp2.click();
					Thread.sleep(4000);
					
			//Logout
					
					WebElement Arrow = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]"));
					Arrow.click();
					Thread.sleep(3000);
					WebElement Logout = driver.findElement(By.linkText("Logout"));
					Logout.click();
					Thread.sleep(3000);
					
					

				    
		// Test
		// Check point
				  
					String expectedTitle = "Login";
				    String actualTitle = driver.getTitle();
				    Assert.assertEquals(actualTitle, expectedTitle);
				    
	    //Quit
				    driver.quit();
				    
				    
	}

}
