package OrangeHRM.libray;

import org.openqa.selenium.By;
import Utils.AppUtils;

public class loginPage extends AppUtils
{
  
	public void login(String uid,String pass)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(uid);
		driver.findElement(By.id("txtPassword")).sendKeys(pass);
		driver.findElement(By.id("btnLogin")).click();
		
	}
 	public void Logout()
 	{
 		driver.findElement(By.id("welcome")).click();
 		driver.findElement(By.linkText("Logout")).click();
 	}
 	public boolean isadminModuleDisplayed()
 	{
 	   if(driver.findElement(By.linkText("Admin")).isDisplayed())
 	   {
 		   return true;
 	   }else
 	   {
 		   return false;
 	   }
 		
 		
 	}
	
	
	
	
}
