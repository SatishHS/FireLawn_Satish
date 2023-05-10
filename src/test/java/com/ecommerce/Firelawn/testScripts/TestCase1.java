package com.ecommerce.Firelawn.testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ecommerce.Firelawn.genericLib.BaseClass;
import com.ecommerce.Firelawn.pomPages.AddressForm;
import com.ecommerce.Firelawn.pomPages.AddressPage;
import com.ecommerce.Firelawn.pomPages.CartPage;
import com.ecommerce.Firelawn.pomPages.HomePage;
import com.ecommerce.Firelawn.pomPages.LoginPage;
import com.ecommerce.Firelawn.pomPages.ProductPage;
import com.ecommerce.Firelawn.pomPages.Welcome;


public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() throws IOException, InterruptedException
	{
		test=reports.createTest("TestCase1");
		Thread.sleep(20);
		Welcome w=new Welcome(driver);
		LoginPage l = w.loginBtn();
		HomePage h = l.logindetails(fu.getPropertydata("username"), fu.getPropertydata("password"));
		ProductPage p = h.searchelements(fu.getPropertydata("product"));
		CartPage c = p.addtocartbutton();
		AddressPage a = c.buynowbutton();
		AddressForm af = a.addnewaddress();
		webutilities.dropdown(af.getCountrydd(), fu.getPropertydata("country"));
		webutilities.dropdown(af.getStatedd(), fu.getPropertydata("state"));
		webutilities.dropdown(af.getCitydd(), fu.getPropertydata("city"));
		AddressPage ap = af.addressdetails(fu.getPropertydata("name"), fu.getPropertydata("house"), fu.getPropertydata("street"), fu.getPropertydata("landmark"), fu.getPropertydata("code"), fu.getPropertydata("phnum"));
		
		
		
	}

}
