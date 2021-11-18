package OrangeHRM.testcases;

import OrangeHRM.libray.loginPage;
import Utils.AppUtils;

public class adminlogintest extends AppUtils
{

	public static void main(String[] args) throws Exception 
	{
		AppUtils.LaunchApp("http://orangehrm.qedgetech.com");
		loginPage lp =new loginPage();
		lp.login("Admin", "Qedge123!@#");
		boolean res =lp.isadminModuleDisplayed();
		if(res)
		{
			System.out.println("admin module displayed   test pass");
		}else 
		{
			System.out.println("admin module not displayed  test fail");

		}
		
				

	}

}
